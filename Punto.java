/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Punto {
    
    int x;
    int y;
/**
 *
 * Consturctor vacio, inicializa los atributos en cero.
 */    
    public Punto(){}
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
/**
 *
 * Metodo para imprimir el punto, no recive nada, no devuelve nada.
 */    
    public void imprimePunto(){
    
        System.out.println("X es igual a "+x);
        System.out.println("Y es igual a "+y);
    }
    
}
