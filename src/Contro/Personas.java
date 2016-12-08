

package Contro;

import java.io.Serializable;
import java.util.ArrayList;
        
public class Personas implements Serializable {
    private String nombre;
    private String telefono;
    private final boolean prestamoPendiente;
    private ArrayList<Prestamos> prestamos; //Arraylist con objetos de la clase préstamos
    private String correo;

    public Personas(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        prestamos = new ArrayList<>();
        prestamoPendiente = false;
    }
    
    public void añadirPrestamo(Prestamos prestamo){
        this.prestamos.add(prestamo);
    }
    
    public boolean Personasvacio(){
        return prestamos.isEmpty();
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getNumPrestamos(){
        return prestamos.size();
    }
    
    public ArrayList<Prestamos> getPrestamos(){
        return prestamos;
        
    }
    
    public void eliminarItem(int prestamo, int item){
        prestamos.get(prestamo).eliminarItem(item);
    }
    
    public void eliminarPrestamo (int prestamo){
        prestamos.get(prestamo).eliminarItems();
        prestamos.remove(prestamo);
        
    }
   
}


