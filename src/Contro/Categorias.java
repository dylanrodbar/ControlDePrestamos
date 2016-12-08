
package Contro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


public class Categorias implements Serializable {
    
private String nombre;
private ArrayList<Items> items=new ArrayList<>();
    


    public Categorias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void anadirItem(Items objeto)
    {
        items.add(objeto);
    }
    
    public ArrayList devolverArrayListItems()
    {
    ArrayList <String> temporal = new ArrayList<>();
    for(Items e: items)                       //Devuelve un arrayList para utilizarlo en un editText
    {                                                                                                                                         
        temporal.add(e.getNombre());
    }
    return temporal;
    }
   
    public void eliminarItem(Items obj)
    {
        items.remove(obj);          //elimina un item
    }

    public ArrayList<Items> getItems() {
        return items;                     //retorna los items
    }
    
    public Boolean confirmarItemVacio()
    {
        if(items.isEmpty())
        {
            return true;
        }
        else
        {
         return false;        
        }
    }
    
    public String toStringCategorias()
    {
        String itemsDevolver = "";
        for(Items e: items)
        {
            itemsDevolver+=e.getNombre()+"\n";
            
        }
        
        return itemsDevolver;
    }
    
    public ArrayList<Items> getItemsOrdenados (){
        Collections.sort(items, (Items  Items1, Items  Items2) -> Items1.getNombre().compareTo(Items2.getNombre()));
        return items;
    }
    
    


}
