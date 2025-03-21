/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Profesor {
    
    private String licensiatura;
    private int conocimiento;
    private boolean empatia;
    private int cuenta;
    private boolean inteligencia;
/**
 *
 * Consturctor vacio, inicializa los atributos en cero.
 */   
    public Profesor(){}
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */   
    public Profesor(String lic, int conocimiento, boolean empatia, int cuenta, boolean intel){
       
        this.licensiatura=lic;
        this.conocimiento=conocimiento;
        this.empatia=empatia;
        this.cuenta=cuenta;
        this.inteligencia=intel;
        
   }
 /**
 *
 * Método para que el profesor exponga, no recibe parametros y  no devuelve un nada.
 */ 
    public void exponer(){
   
       System.out.println("Profesor ha expuesto");
   }
 /**
 *
 * Método para que el profesor dirija, no recibe parametros y  no devuelve un nada.
 */   
   public void dirigir(){
       
       System.out.println("Profesor ha dirigido");
       
   }
 /**
 *
 * Método para que el profesor cree una habilidad, no recibe parametros y  no devuelve un nada.
 */  
  public void crearHabilidad(){
   
        System.out.println("Profesor ha creado habilidad");
   }
 /**
 *
 * Método para que el profesor cree un examen, no recibe parametros y  no devuelve un nada.
 */  
  public void crearExamenes(){
       
       System.out.println("Profesor ha creado examen");
       
   }
 /**
 *
 * Método para que el profesor evalue, no recibe parametros y  no devuelve un nada.
 */   
  public void evaluar(){
   
       System.out.println("Profesor te ha evaluado");
   }
   
       
}
       

