/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201709206;

import java.util.Scanner;        
// @author Luisa Fernanda CC
public class IPC1Tarea3_201709206 {
//Inicializando Tarea3    
Scanner leer = new Scanner(System.in);
    public void MenuPrincipal() {
        // Declarando variable
        int op;//op:opción elegida
        op = 0;
        while (op!=5){
        // Menú Principal
            System.out.println("[IPC1]Tarea3_201709206\n\n");
            System.out.println("1. Usuarios");
            System.out.println("2. Contador de Dígitos Repetidos");
            System.out.println("3. Tres números de Mayor a Menor");
            System.out.println("4. Calcular Pomedio");
            System.out.println("5. Salir");
            op = leer.nextInt();
            switch(op){
                case 1:
                   Usuario();
                break;
                case 2:
                   Contador();
                break;
                case 3:
                    MayorAMenor();
                break;
                case 4:
                    Promedio();
                break;
                case 5:
                    System.exit(0);//Salir del programa
                break;
                default://Si no es ninguna de las opciones
                    System.out.println("\n\n\n\n Opción incorrecta. Intente nuevamente.\n\n");
            }
        }
    }
    public void Usuario(){
        System.out.println("\n\n\n\nUSUARIO\n\n");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios Ascendentes ");
        System.out.println("3. Mostrar Usuarios Descendentes");
        System.out.println("4. Menú Principal");
        int op1;//Opción del menú de usuario
        op1 = leer.nextInt();
        switch (op1){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opción Incorrecta");
                Usuario();
        }
    }
    public void Contador(){
        System.out.println("\n\n\n\nCONTADOR DE DÍGITOS REPETIDOS\n\n");
        System.out.println("1. Ingresar un número");
        System.out.println("2. Ingresar número a buscar");
        System.out.println("3. Mostrar número de dígitos");
        System.out.println("4. Menú Principal");
        int op2;//Opción del menú contador
        op2 = leer.nextInt();
        switch (op2){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                MenuPrincipal();
                break;
            default:
                System.out.println("Opción incorrecta");
                Contador();
        }
    }
    public void MayorAMenor(){
        System.out.println("\n\n\n\nTRES NÚMERO DE MAYOR A MENOR\n\n");
        System.out.println("1. Ingresar Números");
        System.out.println("2. Mostrar Ordenados");
        System.out.println("3. Menú Principal");
         int op3;//Opción del menú MayorAMenor
        op3 = leer.nextInt();
        switch (op3){
            case 1:
                break;
            case 2:
                break;
            case 3:
                MenuPrincipal();
                break;
            default:
                System.out.println("Opción incorrecta");
                MayorAMenor();
        }
    }
    public void Promedio(){
        System.out.println("\n\n\n\nCALCULAR PROMEDIO\n\n");
        System.out.println("1. Mostrar Promedio");
        System.out.println("2. Menú Principal");
        System.out.println("");
        System.out.println("");
    }
}
