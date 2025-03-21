/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Pokemon {
    
    String nombre;
    int ataque;
    int defensa;
    int defensaEsp;
    int ataqueEsp;
    int velocidad;
    int vida;
/**
 *
 * Consturctor vacio, inicializa los atributos en cero.
 */
   public Pokemon(){}
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */   
   public Pokemon(String nombre,int atk, int def, int defesp, int atkesp,int spd, int hp  ){
       
       this.nombre= nombre;
       ataque = atk;
       defensa = def;
       defensaEsp = defesp;
       ataqueEsp = atkesp;
       velocidad = spd;
       vida = hp;
   
   }
/**
 *
 * Método para que el pokemon ataque, no recibe parametros y  no devuelve un nada.
 */     
   public void atacar(){
   
       System.out.println(nombre +" te ha golpeado");
   }
/**
 *
 * Método para que el pokemon utilice un objeto, no recibe parametros y  no devuelve nada.
 */    
   public void usarObjeto(){
       
       System.out.println(nombre +" ha usado un objeto");
       
   }
/**
 *
 * Método para que el pokemon se retire, no recibe parametros y  no devuelve nada.
 */   
  public void retirarse(){
   
        System.out.println(nombre +" se ha retirado");
   }
/**
 *
 * Método para que el pokemon se cure, no recibe parametros y  no devuelve nada.
 */    
  public void curarse(){
       
       System.out.println(nombre +" se ha curado");
       
   }
 /**
 *
 * Método para que el pokemon defienda, no recibe parametros y  no devuelve nada.
 */    
   public void defenderse(){
   
       System.out.println(nombre +" se ha defendido");
   }
   
   
}

