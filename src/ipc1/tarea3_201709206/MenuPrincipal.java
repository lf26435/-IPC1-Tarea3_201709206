package ipc1.tarea3_201709206;
// @author Luisa Fernanda CC

import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal(){
        //Constructor
        MenuP();
    }
    Scanner leer = new Scanner(System.in);
    public void MenuP() {//Menú Principal
        // Declarando variable
        int op;//op:opción elegida
        op = 0;
        while (op!=5){
        // Menú Principal
            System.out.println("[IPC1]Tarea3_201709206\n");
            System.out.println("1. Usuarios");
            System.out.println("2. Contador de Dígitos Repetidos");
            System.out.println("3. Tres números de Mayor a Menor");
            System.out.println("4. Calcular Pomedio");
            System.out.println("5. Salir");
            op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("\n\n\n");
                   Usuario();
                break;
                case 2:
                    System.out.println("\n\n\n");
                   Contador();
                break;
                case 3:
                    System.out.println("\n\n\n");
                    MayorAMenor();
                break;
                case 4:
                    System.out.println("\n\n\n");
                    Promedio();
                break;
                case 5:
                    System.exit(0);//Salir del programa
                break;
                default://Si no es ninguna de las opciones
                    System.out.println("\n\n\n\n Opción incorrecta. Intente nuevamente.\n");
            }
        }
    }
    public void Usuario(){
        System.out.println("USUARIO\n");
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
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\nOpción incorrecta\n\n");
                Usuario();
        }
    }
    public void Contador(){
        System.out.println("CONTADOR DE DÍGITOS REPETIDOS\n");
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
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\nOpción incorrecta\n\n");
                Contador();
        }
    }
    public void MayorAMenor(){
        System.out.println("TRES NÚMERO DE MAYOR A MENOR\n");
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
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\nOpción incorrecta\n\n");
                MayorAMenor();
        }
    }
    public void Promedio(){
        System.out.println("CALCULAR PROMEDIO\n");
        System.out.println("1. Mostrar Promedio");
        System.out.println("2. Menú Principal");
        System.out.println("");
        int op4;//Opción el menú Promedio
        op4 = leer.nextInt();
        switch (op4){
            case 1:
                break;
            case 2:
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\nOpción incorrecta\n\n");
                Promedio();
        }
    }
}