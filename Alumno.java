/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Alumno {
    
    String nombre;
    String carrera;
    int semestre;
    int numeroCuenta;
    float promedio;
    /**
 *
 * consturctor vacio, inicializa los atributos en cero.
 */
    public Alumno() {}
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
    public Alumno(String nombre, String carrera, int semestre, int numeroCuenta, float promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.numeroCuenta = numeroCuenta;
        this.promedio = promedio;
    }
 /**
 *
 * Método para estudiar, no recibe parametros y  no devuelve un nada.
 */     
    public void estudiar(){
   
       System.out.println(nombre+" ha estudiado");
   }
 /**
 *
 * Método para hacer tarea, no recibe parametros y  no devuelve un nada.
 */      
   public void hacerTarea(){
       
       System.out.println(nombre+" ha hecho su tarea");
       
   }
/**
 *
 * Método para inscribirse, no recibe parametros y  no devuelve un nada.
 */       
  public void inscribirse(){
   
        System.out.println(nombre+" se ha inscrito con el numero de cuenta: "+numeroCuenta);
   }
/**
 *
 * Método para hacer examenes, no recibe parametros y  no devuelve un nada.
 */       
  public void hacerExamenes(){
       
       System.out.println(nombre+" ha hecho examen");
       
   }
 /**
 *
 * Método para tomar apuntes, no recibe parametros y  no devuelve un nada.
 */      
  public void tomarApuntes(){
   
       System.out.println(nombre+" ha tomado sus apunteso");
   }
}
