/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_hazielpavon;

import java.util.Scanner;

public class Examen1P1_HazielPavon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Sumador binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir ");
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    String numero1,
                     numero2,
                     result = "";
                    boolean valida = false;

                    System.out.println("ingrese el primer numero");
                    numero1 = sc.next();

                    System.out.println("ingrese el segundo numero");
                    numero2 = sc.next();
// inicio del for y el if donde hago todas las validaciones simples 
                    if (numero1.length() == numero2.length()) {

                        for (int i = numero1.length() - 1; i >= 0; i--) {
                            char vali = numero1.charAt(i);
                            char vali2 = numero2.charAt(i);

                            if ((vali == '0' || vali == '1') && (vali2 == '0' || vali2 == '1')) {
                                valida = true;
                            } else {
                                valida = false;
                                break;
                            }

                        }
                        if (valida == false) {
                            System.out.println("Contiene caracteres distinto de 0 y 1 ");
                        } else {
                            System.out.println("validos");
 // imprime si los binarios son validos y no hay otro valor o caracter diferente de uno y cero                            
                            char res = '0';
                            for (int i = numero1.length() - 1; i >= 0; i--) {
                                char vali = numero1.charAt(i);
                                char vali2 = numero2.charAt(i);
// despues de agarrar cada caracter de derecha a izquierda se valida si es uno o cero para realizar la suma de binarios 
                                if (res == '0') {
                                    if (vali == '0' && vali2 == '0') {
                                        result = '0' + result;
                                        res = '1';
                                    } else if (vali == '1' && vali2 == '0' || vali2 == '1' && vali == '0') {
                                        result = '1' + result;
                                        res = '0';
                                    } else if (vali == '1' && vali == '1') {
                                        result = '0' + result;
                                        res = '1';
                                    }
// si queda residuos las validaciones cambian en medida a las reglas dadas 
                                } else if (res == '1') {
                                    if (vali == '0' && vali2 == '0') {
                                        result = '1' + result;
                                        res = '0';
                                    } else if (vali == '1' && vali2 == '0' || vali == '0' && vali2 == '1') {
                                        result = '0' + result;
                                        res = '1';
                                    } else if (vali == '1' && vali == '1') {
                                        result = '0' + result;
                                        res = '1';
                                    }

                                }
                            }
                            
                            if (res == '1' ){
                                result = '1' + result; 
 // si el residuo es uno se suma uno a la respuesta, al inicio 
                            }
                          
                            
                            
                        }
                            System.out.println ("La suma es " + result); 

                    } else {
                        System.out.println("Los numeros deben de tener el mismo numeros de bits");
                    }

                    break;
// fin de problema1 
                case 2:
// iniciamos haciendo validaciones si es mayor a 9 y que sea impar 
                    System.out.println("Ingrese un tamano para el triangulo");
                    int tam = sc.nextInt();
                    if (tam % 2 != 0 && tam > 9) {
                        for (int i = 0; i < tam; i++) {
// contador para lo largo 
                            for (int k = 0; k < tam; k++) {

                                if (i == 0) {
                                    System.out.print(" *");
                                } else if (i == k) {
// si el i es 0 va a imprimir un linea recta 
                                    System.out.print(" *");
                                } else if (k == (tam - i) - 1) {
                                    System.out.print(" * ");
// mitad del triangulo 
                                } else if (i == tam - 1) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
// espacios para que el triangulo este hueco 
                                }

                            }
                            System.out.println(" ");

                        }
                    } else {
                        System.out.println("ERROR SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                    }
                    break;

                case 3:

                    seguir = false;

                default:
                   
                    System.out.println(" Ingrese una opcion valida ");
                    
                    break; 
            }
        }
    }
}
