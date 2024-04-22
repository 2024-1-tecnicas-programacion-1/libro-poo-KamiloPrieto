package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {

    //Metodo para solicitar variables, crear objetos y ejecutar metodos
    //Complejidad temporal: O(1) Tiempo constante.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buen dia.");//O(1)
        System.out.println("Por favor ingrese el titulo del libro:");//O(1)
        String titulo = sc.nextLine();//O(1)
        System.out.println("Ingrese el autor del libro:");//O(1)
        String autor = sc.nextLine();//O(1)
        System.out.println("Ingrese el género literario del libro:");//O(1)
        String genero = sc.nextLine();//O(1)
        System.out.println("Ingrese el año de publicación del libro");//O(1)
        int anio = sc.nextInt();//O(1)

        boolean leido = false;//O(1)

        Libro libroUsuario = new Libro(titulo, autor, anio, genero, leido);//O(1)

        libroUsuario.marcarLeido();
        System.out.println(libroUsuario.mostrarInformacion());//O(1)
        libroUsuario.isLeido();
        if (libroUsuario.isLeido() == true) {
            System.out.println("El libro " + titulo + " ya fue leído.");
        } else {
            System.out.println("No has leido " + titulo);
        }//O(1)
        if (libroUsuario.esAntiguo() == true) {
            System.out.println("El libro es antiguo.");
        }//Cierre if para determinar antiguedad//O(1)
    }//Cierre main
}//Cierre Class Principal
