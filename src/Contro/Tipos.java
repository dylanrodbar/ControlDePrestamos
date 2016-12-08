

package Contro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
        
public class Tipos implements Serializable {
private String nombre;
private ArrayList<Items> items = new ArrayList<>();



public ArrayList devolverArrayListItems()
    {
    ArrayList <String> prueba = new ArrayList<>();
    for(Items e: getItems())                       //Devuelve un arrayList para utilizarlo en un editText
    {                                                                                                                                         
        prueba.add(e.getNombre());
    }
    return prueba;
    }

public void anadirItem(Items objeto)
    {
        items.add(objeto);
    }

public void eliminarItem(Items obj)
    {
        getItems().remove(obj);          //elimina un item
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipos(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
    
    
    public String toStringTipos()
    {
        String tiposDevolver = "";
        for(Items e: items)
        {
            tiposDevolver+=e.getNombre()+"\n";
            
        }
        
        return tiposDevolver;
    }
    
    
    public ArrayList<Items> getItemsOrdenados (){
        Collections.sort(items, (Items  Items1, Items  Items2) -> Items1.getNombre().compareTo(Items2.getNombre()));
        return items;
    }
}
