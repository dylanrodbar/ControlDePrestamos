

package Contro;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Controladora implements Serializable {
    
   private ArrayList<Items> items = new ArrayList<>();
   private ArrayList<Categorias> categorias = new ArrayList<>();
   private ArrayList<Tipos> tipos = new ArrayList<>();
   private ArrayList<Personas> personas = new ArrayList<>();
   private ArrayList<Prestamos> prestamos = new ArrayList<>();
   
   
   //*************************************************Métodos para ítems****************************************************+
   //indiceTipo: para agregar el tipo
    public void crearItem(String nombre, String codigo, String descripcion, int indiceTipo, ArrayList<Integer> indCategorias)
    {
      Items prueba = new Items (nombre,codigo,descripcion,tipos.get(indiceTipo));
      tipos.get(indiceTipo).anadirItem(prueba);
      items.add(prueba);
        System.out.println(prueba.getNombre());
        System.out.println(prueba.getCodigo());
      for(Integer e: indCategorias)
          
          //ArrayList<Integers>: sale de la interfaz gráfica
      {
       prueba.anadirCategoria(categorias.get(e));
       System.out.println(e.toString());
       categorias.get(e).anadirItem(prueba);
      }
      //Escribir();
      System.out.println(prueba.getNombre()+" "+ prueba.getCodigo()+" " +prueba.getDescripcion()+" "+prueba.getTipo());    
   
    
    }
    public void editarItem(String nombre, String codigo, String descripcion, String tipo, int indice, ArrayList<String> nomCategorias)
    {
      Tipos tipoTemporal=null;
      for(Tipos e: tipos)
      {
          if(e.getNombre().equals(tipo))
          {
              tipoTemporal=e;
          }
      }
      if(!items.get(indice).getTipo().getNombre().equals(tipoTemporal.getNombre()))
      {
       items.get(indice).getTipo().eliminarItem(items.get(indice)); //Almacenar en variables 
       items.get(indice).setTipo(tipoTemporal);
       items.get(indice).getTipo().anadirItem(items.get(indice));  //Agrega el item al tipo actualizado
      }
      items.get(indice).setNombre(nombre);
      items.get(indice).setCodigo(codigo);  
      items.get(indice).setDescripcion(descripcion);    //Edita los datos de los ítems
      //items.get(indice).setTipo(tipo);  //Se agrega luego
      ArrayList<Categorias> categoriasTemp = items.get(indice).getCategorias();
      items.get(indice).eliminarCategorias();   //Elimina todas las categorías
      for(String e: nomCategorias)
      {
      ArrayList <String> temp = new ArrayList<>();
      int contador1 = 0;
      for(Categorias i: categorias)  //Recorre las categorías para compararlas con las categorías que se añadirán
      {
          if (e.equals(i.getNombre()))              //Añade las categorías que se añadieron en editarItem
          {                                         //Esto mediante diferentes recorridos   
            if(i.confirmarItemVacio())
            {
              i.anadirItem(items.get(indice)); 
            }
            else
            {
            contador1 = 0; 
            temp = i.devolverArrayListItems(); //Almacena temporalmente los items de la categoría
            for (String j: temp)           //Se hace un recorrido de items
            {
              
            if(items.get(indice).getNombre().equals(j)) 
             {                                           //Si coincide el item del arraylist con el item
                contador1+=1;                            //que se está editando, entonces se suma el
                                                        //contador para luego no agregar el item 
             
             }
            }
            if(contador1==0)   //Si el contador1 es 0, quiere decir que no se encontró el item
            {                 //por lo que se debe agregar
              i.anadirItem(items.get(indice));  //agrega el item a la categoría
            }
            }
            items.get(indice).anadirCategoria(i); //
          }
      }
          
      int contador = 0;
      for (Categorias n: categoriasTemp)
      {                                      //Recorrido para eliminar los items de las categorías que
          contador=0;
          for(String m: nomCategorias)       //se corrigieron del ítem
          {  
            if(n.getNombre().equals(m))
            {
                contador+=1;
                System.out.println(contador);
                                               //Compara con las categorías si los nuevos items coinciden
            }
            
          }
          if(contador == 0)          //En caso de no existir
          {

           n.eliminarItem(items.get(indice)); //Elimina el item de esa categoría   
          }
          
      }
      
      //Usar el getTipo para luego compararlo con el nombre del nuevo tipo, si no coinciden, entonces
        //al tipo que le correspondía el item, se le eliminará por medio del método "eliminarItem"
      //items.get(indice).eliminarCategoria(categs);
      
      }
      
          
      //Escribir();
   
        
    }
    public void eliminarItem(int indice, ArrayList<String> nomCategs, String nombreTipo)
    {
        Items modificador = items.get(indice);
        for(Categorias m: categorias)
        {
            for(String n: nomCategs)   //Recorre las categorias, 
            {
                if(m.getNombre().equals(n))
                {
                    m.eliminarItem(modificador);
                }
                
            }
        }
        
        for(Tipos e: tipos)
        {
            if(e.getNombre().equals(nombreTipo))
            {
                e.eliminarItem(modificador);
            }
        }
        //Recorrer el arraylist tipos hasta encontrar al nombreTipo, luego a ese tipo se
        //aplica el eliminarItem
        
        
        items.remove(indice);    //Elimina el objeto del arraylist con ese índice
        //Escribir();
    }
    public Items devolverItem(int indice)
    {
        Items devolver = items.get(indice);               
        return devolver;  //Devuelve un objeto a la clase de interfaz gráfica
                          //Se utiliza para consultar y para editar items
    }
    
    public ArrayList<String> devolverArrayListItems()
    {
    ArrayList <String> prueba = new ArrayList<>();
    for(Items e: items)
    {
        prueba.add(e.getNombre());            //Devuelve un arraylist de Strings para utilizarlos en el combo box
    }                                         //de la interfaz gráfica, relacionado con items
    return prueba;
    }
    
    public ArrayList<Items> getItemsOrdenados (){
        Collections.sort(items, (Items  Items1, Items  Items2) -> Items1.getNombre().compareTo(Items2.getNombre()));
        return items;
    }
    

    //***********************************************+Métodos para categorías*****************************************************+
    public void crearCategoria(String nombre)
    {
        categorias.add(new Categorias(nombre)); //Crea la nueva categoría
        //Escribir();   
    }
    
    public void editarCategoria(String nombre, int indice)
    {
        categorias.get(indice).setNombre(nombre);  //Edita el nombre de la categoría
        System.out.println(categorias.get(indice).getNombre());
        Escribir();
    }
    
    public void eliminarCategoria(int indice, ArrayList<String> nomItems)
    {
       Categorias modificador = categorias.get(indice);
       for(Items m: items)
       {
       for(String n: nomItems)
        {
         if(m.getNombre().equals(n))
         {
          m.eliminarCategoria(modificador);  //Antes de eliminar la categoría, eliminará de los items, el elemento del arraylist
         }                                   //con la categoría que se decidió eliminar
         
        }
       }
       
       categorias.remove(indice);
      //Escribir();
    }
    
    
    public Categorias devolverCategoria(int indice)
    {
      Categorias devolver = categorias.get(indice);    //Devuelve un objeto tipo categoría           
      return devolver;
    }
    public ArrayList<String> devolverArrayListCategoriasStr()
    {
    ArrayList <String> prueba = new ArrayList<>();  //Devuelve un arraylist de Strings para utilizarlos en el combo box
                                                    //de la interfaz gráfica, relacionado con categorias
    for(Categorias e: categorias)
    {
        prueba.add(e.getNombre());
    }
    return prueba;
    }
    
    
    public Boolean confirmarVacioCategorias()
    {
        if(categorias.isEmpty())
        {
        return true;                        //Si está vacío, enviará una señal true para validaciones
        }
        else
        {
            return false;
        }
    }
    
    public ArrayList<Categorias> getCategoriasOrdenados (){
        Collections.sort(categorias, (Categorias  categorias1, Categorias  categoria2) -> categorias1.getNombre().compareTo(categoria2.getNombre()));
        return categorias;
    }
    
    //************************************************Métodos para tipo*****************************************
    public void agregarTipo(String nombre)
    {
     tipos.add(new Tipos(nombre));         //Agrega un nuevo tipo
     //Escribir();
    }
    public void editarTipo(String nombre, int indice)
    {
        tipos.get(indice).setNombre(nombre);   //Edita un tipo
       Escribir();
    }
    public void borrarTipo(int indice, ArrayList <String> nombreItems)
    {
        for(Items m: items)
        {
           for(String n: nombreItems)
           {
             if(m.getNombre().equals(n))  
             {
               m.eliminarTipo();  
             }
           }
        }
        tipos.remove(indice);
       Escribir();
    }
    public Tipos devolverTipo(int indice)
    {
        return tipos.get(indice);
        
    }
    public ArrayList<String> devolverArrayListTipos()  //Se utiliza para asignarlo a combo box
    {
       ArrayList <String> tiposString = new ArrayList<>();
       for(Tipos e: tipos)
       {
           tiposString.add(e.getNombre());
       }
       return tiposString;
    }
    
    public ArrayList<Tipos> getTiposOrdenados (){
        Collections.sort(tipos, (Tipos  categorias1, Tipos  categoria2) -> categorias1.getNombre().compareTo(categoria2.getNombre()));
        return tipos;
    }
    
    //***************************************+Métodos para personas*****************************************
    public void agregarPersona(String nombre, String telefono, String correo)
    {
     personas.add(new Personas(nombre,telefono,correo));   //Agrega una nueva persona
     //Escribir();
    }
    
    public void editarPersona(String nombre, String telefono, String correo, int indice)
    {
        personas.get(indice).setNombre(nombre);
        personas.get(indice).setTelefono(telefono);  //Edita los datos de la persona
        personas.get(indice).setCorreo(correo);
        //Escribir();
    }
    public void eliminarPersona(int indice)
    {
        personas.remove(indice);      //Elimina a una persona
       //Escribir();
    }
    public ArrayList<String> devolverArrayListPersonas()
    {
        ArrayList<String> personasTemp = new ArrayList<>();
        for(Personas e: personas)
        {
            personasTemp.add(e.getNombre());   //Devuelve el arraylist para el combo box
        }
       return personasTemp;
    }
    
    public Personas devolverPersona(int indice)
    {
        return personas.get(indice);
    }
    
    public ArrayList<Personas> getPersonas (){
        Collections.sort(personas, new Comparator<Personas>() {
        public int compare(Personas  personas1, Personas  personas2)
        {

            return  personas1.getNombre().compareTo(personas2.getNombre());
        }
    });
        return personas;
    }
    
    public ArrayList<Tipos> getTipos()
    {
        return tipos;
    }
    
    
    
    //***********************************Métodos para prestamos*********************************************
    
    public void crearPrestamo(int numPersona, ArrayList<Items> items){
        Personas persona;
        Prestamos prestamo = new Prestamos(items);
        persona= personas.get(numPersona);
        persona.añadirPrestamo(prestamo);
        //Escribir();
    }
    
    public void crearPrestamoConAlarma(int numPersona, ArrayList<Items> items, LocalDateTime alarma, boolean recurrente){
        Personas persona;
        Prestamos prestamo = new Prestamos(items, alarma, recurrente);
        persona= personas.get(numPersona);
        persona.añadirPrestamo(prestamo);
        //Escribir();            
    }
    
    
    public ArrayList<String> devolverArrayListPrestamos()
    {
     ArrayList<String> temporal = new ArrayList<>();
     for(Prestamos e: prestamos)
     {
        temporal.add(e.getPersona().getNombre()); //Toma el nombre de la persona relacionada al préstamo
     }
     return temporal;  //retorna un arraylist con los nombre de las personas asociadas a un préstamo
    }
    
    public Prestamos devolverPrestamo(int indice)
    {
      return prestamos.get(indice); //Retorna el objeto préstamo que se especifica con el índice
    }
    
    public void eliminarItemPrestamo(int indicePersona, int indicePrestamo, int indiceItem)
    {
        personas.get(indicePersona).eliminarItem(indicePrestamo, indiceItem);
        //Escribir();
    }
    
    public void eliminarPrestamo(int persona, int indicePrestamo)
    {
        personas.get(persona).eliminarPrestamo(indicePrestamo);
    }
    
    
    public ArrayList<Items> getItems (){
        return items;//
    }
    
    public Prestamos getPrestamos(int persona, int indice){
        return personas.get(persona).getPrestamos().get(indice);
    }
    
    //****************************************Método para la alarma *************************
    
    public String comprovarAlarma(){
        for (Personas person: personas){
            if (!person.getPrestamos().isEmpty()){
                for (Prestamos prestams: person.getPrestamos()){
                    if (prestams.getAlarma()!=null){
                        if (prestams.getAlarma().isActivada()){
                            if (prestams.getAlarma().fueraDeTiempo()){
                                if (!prestams.getAlarma().isRecurrente()){
                                    prestams.getAlarma().setActivada(false);
                                    return "El prestamo de: " + person.getNombre() + " ha caducado!";
                                }
                                else
                                    return "El prestamo de: " + person.getNombre() + " ha caducado! \n Alarma recurrente";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public String verificarComprovarAlarma(){
        for (Personas person: personas){
            if (!person.getPrestamos().isEmpty()){
                for (Prestamos prestams: person.getPrestamos()){
                    if (prestams.getAlarma()!=null){
                        if (prestams.getAlarma().isActivada()){
                            if (prestams.getAlarma().fueraDeTiempo()){
                                if (!prestams.getAlarma().isRecurrente()){
                                    return "El prestamo de: " + person.getNombre() + " ha caducado!";
                                }
                                return "El prestamo de: " + person.getNombre() + " ha caducado! \t Alarma recurrente";

                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
 
    
    
    
 public void Escribir()
    {
        try{
            FileOutputStream categ;
            ObjectOutputStream categt;
            FileOutputStream item;
            ObjectOutputStream itemt;
            FileOutputStream person;
            ObjectOutputStream persont;
            FileOutputStream pres;
            ObjectOutputStream prest;
            try (FileOutputStream tipo = new FileOutputStream("Tipos"); ObjectOutputStream tipot = new ObjectOutputStream(tipo)) {
                categ = new FileOutputStream("Categorias");
                categt = new ObjectOutputStream(categ);
                item = new FileOutputStream("Items");
                itemt = new ObjectOutputStream(item);
                person = new FileOutputStream("Personas");
                persont = new ObjectOutputStream(person);
                pres = new FileOutputStream("Prestamos");
                prest = new ObjectOutputStream(pres);
                tipot.writeObject(tipos);
            }
         categt.writeObject(categorias);
         categt.close();
         categ.close();
         itemt.writeObject(items);
         itemt.close();
         item.close();
         prest.writeObject(prestamos);
         prest.close();
         pres.close();
         persont.writeObject(personas);
         persont.close();
         person.close();
            System.out.println("Se ha guardado con éxito");
       }catch(IOException ioe){
            System.out.println("Se ha generado un error al guardar");
        }
    }
    
    public void Leer()
    {
      try
        {
            ObjectInputStream categt;
            FileInputStream tipo;
            ObjectInputStream tipot;
            FileInputStream item;   
            ObjectInputStream itemt;
            FileInputStream person;
            ObjectInputStream persont;
            FileInputStream pres;
            ObjectInputStream prest;
          try (FileInputStream categ = new FileInputStream("Categorias")) {
              categt = new ObjectInputStream(categ);
              categorias = (ArrayList) categt.readObject();
              tipo = new FileInputStream("Tipos");
              tipot = new ObjectInputStream(tipo); //Asignar a todos los arraylist
              tipos = (ArrayList) tipot.readObject();
              item = new FileInputStream("Items");
              itemt = new ObjectInputStream(item);
              items = (ArrayList) itemt.readObject();
              person = new FileInputStream("Personas");
              persont = new ObjectInputStream(person);
              personas = (ArrayList) persont.readObject();
              pres = new FileInputStream("Prestamos");
              prest = new ObjectInputStream(pres);
              prestamos = (ArrayList) prest.readObject();
          }
            categt.close();
            tipo.close();
            tipot.close();
            item.close();
            itemt.close();
            person.close();
            persont.close();
            pres.close();
            prest.close();
            System.out.println("Se ha leído con éxito");
         }catch(IOException ioe){
          }catch(ClassNotFoundException c){
             System.out.println("ha ocurrido un error al cargar los archivos");
          }  
    }

    
    
}

    
    


      

