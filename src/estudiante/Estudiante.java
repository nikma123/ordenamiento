/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author nicolas
 */
public class Estudiante {

   private String nombre;
   private String apellido;
   private String identificacion;
   private int puesto;
   private double nota;
   
   
   public Estudiante(String nombre, String apellido, String identificacion, int puesto, double nota){
       setNombre(nombre);
       setApellido(apellido);
       setIdentificacion(identificacion);
       setPuesto(puesto);
       setNota(nota);
       
   }
    public String imprimir(){
       return "";
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
  
    
}
