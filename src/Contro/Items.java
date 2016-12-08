/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author La curacao
 */
public class Items implements Serializable {
    private ArrayList<Categorias> categorias = new ArrayList<>();

    private Prestamos pres;
    private String nombre;
    private String codigo;
    private String descripcion;
    private Tipos tipo; //Hay que definir la clase tipo
    private Boolean prestado;      //Se hace true luego de efectuar un préstamo
    //private Prestamo pres;  

    public Items(String nombre, String codigo, String descripcion, Tipos tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.prestado = false;
    }
    
    public  ArrayList<Categorias> getCategorias() {
        ArrayList <Categorias> temporal = new ArrayList<>();
        for(Categorias e: categorias)
        {
            temporal.add(e);
        }
        return temporal;
    }

    
    public boolean Itemsvacio(){
        return categorias.isEmpty();
    }
    
    
    public Items() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipos getTipo() {
        return tipo; //Creo que cuando se hace el setTipo, el temporal que quiero asignar también se edita
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    
    public void eliminarCategorias()
    {
        categorias.removeAll(categorias); //Elimina todas las categorías
    }
    
    public void eliminarCategoria(Categorias categ)
    {
    categorias.remove(categ);  //Elimina una sola categoría
    }
    
    
    public void anadirCategoria(Categorias categ)
    {
        categorias.add(categ); //Añade una categoría
    }
    
    
    public ArrayList <String> devolverArrayListCategorias()
    {
    ArrayList <String> prueba = new ArrayList<>();
    for(Categorias e: categorias)
    {
        System.out.println(e.getNombre());
        prueba.add(e.getNombre()); //Se recorre y se pone en un edittext de la interfaz
    }
    return prueba;
    }
     public void eliminarCategoria(ArrayList<Categorias> categ)
    {
        for(Categorias e: categ)
        {                                        //Elimina una categoría
            categorias.remove(e);
        }
        
    }
   public String devolverNombreTipo()
   {
       return tipo.getNombre();
   }
   
   public void eliminarTipo()
   {
       tipo = null;
   }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }
   
    public String toStringTipo(){
        return tipo.getNombre();
    }
    
    
    public String toStringPrestado(){
        if (prestado){
            return "✔";
        }
        return "--";
    }
    
    public String toStringCategorias(){
        String NombreCategorias = "";
        NombreCategorias = this.categorias.stream().map((e) -> "- " + e.getNombre()).reduce(NombreCategorias, String::concat);
        return NombreCategorias;
    }
    
   public void eliminarPrestamo()
   {
     prestado = false;               //Le quita al item el préstamo asignado
     pres = null;
   }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

