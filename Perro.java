/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Perro {
    String nombre;
    String raza;
    String colorPelo;
    String colorOjos;
    float tamaño;
/**
 *
 * Consturctor vacio, inicializa los atributos en cero.
 */
    public Perro() {}
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
    public Perro(String nombre, String raza, String colorPelo, String colorOjos, float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.tamaño = tamaño;
    }
 /**
 *
 * Método para que el perro coma, no recibe parametros y  devuelve un boolean.
 */     
    public boolean comer(){
   
       System.out.println(nombre+" ha comido");
       return true;
   }
/**
 *
 * Método para que el perro duerma, no recibe parametros y no devuelve nada.
 */   
   public void dormir(){
       
       System.out.println(nombre+" ha dormido");
       
   }
/**
 *
 * Método para que el perro corra, no recibe parametros y no devuelve nada.
 */  
   public void correr(){
   
        System.out.println(nombre+" ha corrido");
   }
 /**
 *
 * Método para que el perro camine, no recibe parametros y no devuelve nada.
 */   
   public void caminar(){
       
       System.out.println(nombre+" ha caminado");
       
   }
 /**
 *
 * Método para que el perro juegue, no recibe parametros y no devuelve nada.
 */   
   public void jugar(){
   
       System.out.println(nombre+" ha jugado");
   }
}
