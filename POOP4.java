/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a = 5;
        
        System.out.println(a);
        
        Punto punto = new Punto();
        System.out.println(punto);// Imprime la referencia del objeto
        
        System.out.println("**********Punto 1**********");
        
        punto.x = 3;
        punto.y = 6;
        punto.imprimePunto();//Imprime los atributos del objeto
        
        System.out.println("**********Punto 2**********");
        
        Punto punto2 = new Punto(5,6);
        punto2.imprimePunto();
        
        System.out.println("**********Pokemon*******"); 
        
        Pokemon rayquaza = new Pokemon("Rayquaza",150,90,90,150,95,105);
        
        rayquaza.atacar();
        rayquaza.curarse();
        
        
        System.out.println("**********Profesor*******"); 
        
        Profesor alvarez = new Profesor("Ciencias",10,true,55667788,true); 
        
        alvarez.crearExamenes();
        alvarez.evaluar();
        
        System.out.println("**********Alumno*******"); 
        
        Alumno gerardo = new Alumno("Gerardo","computacion",420052191,3,9.0f);
        
        gerardo.estudiar();
        gerardo.hacerExamenes();
        
        System.out.println("**********Perro*******"); 
        
        Perro chicharo = new Perro("Chicharo","Pug","Cafe","negro",10.0f);
        
        chicharo.comer();
        chicharo.dormir();
        
    }   

}
