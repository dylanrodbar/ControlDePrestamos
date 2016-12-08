/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contro;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Prestamos implements Serializable {
    ArrayList<Items> items;
    Alarma alarma = null;
    private Personas persona;
    
    
    public boolean preparado (Items items, Personas personas){
        if (!items.Itemsvacio()){
            if(!personas.Personasvacio()){
                return true;
            }
        }
        return false;
    }
    
    
    public Prestamos(ArrayList<Items> items){
        this.items = items;
        for (Items e: items){
            e.setPrestado(true);
        }
        
    }
    
    public Prestamos(ArrayList<Items> items, LocalDateTime alarma, boolean recurrente){ 
        this.items = items;
        this.alarma = new Alarma (alarma, recurrente);
        for (Items e: items){
            e.setPrestado(true);
        }
        
    }
    
    public ArrayList <String> devolverArrayListItems()
    {
      ArrayList<String> temporal = new ArrayList<>();
      for(Items e: items)
      {
       temporal.add(e.getNombre());                   //Devuelve un arraylist de items para usarlos en un combo box
      }
      return temporal;
    }

    public void eliminarItem(int indice)
    {
        items.get(indice).eliminarPrestamo();  //Llama al método para quitar el préstamo asignado
        items.remove(indice);                  //Elimina al ítem del arraylist
    }

    public void eliminarItems()
    {
        for(Items e: items)
        {
         e.eliminarPrestamo();    //Llama la método para quitarle el préstamo asignado
        }
        items.removeAll(items);   //Luego del recorrido, elimina todos los items del arraylist

    }
        public Personas getPersona() {
            return persona;            //Retorna a la persona asociada
         }

        public void setPersona(Personas persona) {
            this.persona = persona;
        }
        
        public Alarma getAlarma(){
            return alarma;
            
        }
    
    
    
    public String toStringItems (){
        String Items = "";
        for (Items item: items){
            Items += " -" + item.getNombre();
        }
        return Items;
    }
    
    public String toStringAlarma(){
        if (alarma==null){
            return "---------";
        }
        else
            return alarma.getFecha().toLocalDate()+"";
    }
    
    public ArrayList<Items> getItems(){
        return items;
    }
    
    
    
    
}
