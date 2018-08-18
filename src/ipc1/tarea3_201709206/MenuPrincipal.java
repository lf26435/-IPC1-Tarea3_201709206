package ipc1.tarea3_201709206;
// @author Luisa Fernanda CC

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal(){
        //Constructor
        MenuP();
    }
    Scanner leer = new Scanner(System.in);
    int Num1,Num2,Num3;//Variables a utilizar
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
                    System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
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
                System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
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
                System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
                Contador();
        }
    }
    public void MayorAMenor(){
        System.out.println("TRES NÚMERO DE MAYOR A MENOR\n");
        System.out.println("1. Ingresar Números");
        System.out.println("2. Mostrar Ordenados De Mayor A Menor");
        System.out.println("3. Mostrar Ordenados De Menor A Mayor");
        System.out.println("4. Menú Principal");
        int op3;//Opción del menú MayorAMenor
        op3 = leer.nextInt();
        switch (op3){
            case 1:
                IngresoNum();
                break;
            case 2:
                OrdenadoMayorMenor();
                break;
            case 3:
                OrdenadoMenorMayor();
                break;
            case 4:
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
                MayorAMenor();
        }
    }
    public void IngresoNum(){
        int i,Numero;
        Numero = 0;//Número que el usuario ingresará
        i = 1;//Contador
        int Número[] = new int[3];
        do{
        System.out.println("Ingrese Número #"+i);
        try{
        Numero= leer.nextInt();
        }catch(InputMismatchException exce){
            System.out.println("Numeros, no letras");
        }
        Número[i-1]= Numero;//Número es la matriz, [i-1] es la fila en que se ingresará el número, "Numero" la variable en que se guardará
            System.out.println("Número "+Numero+" resgistrado.");//Confirma el registro del número
            i++;
            Num1 = Número[0];//Variable donde se guarda el primer número
            Num2 = Número[1];//Variable donde se guarda el segundo número
            Num3 = Número[2];//Variable donde se guarda el tercer número
        }while(i!=4);
        System.out.println("\n\n\n\nNúmeros ingresados exitosamente\n");
        MayorAMenor();
    }
    public void OrdenadoMayorMenor(){
        if (Num1>=Num2 && Num2>=Num3) {
            System.out.println("\n\n\nSu orden es\n"+Num1+" - "+Num2+" - "+Num3);
        }
        else  if (Num1>=Num3 && Num3>=Num2) {
            System.out.println("\n\n\nSu orden es\n"+Num1+" - "+Num3+" - "+Num2);
        }
        else  if (Num2>=Num1 && Num1>=Num3) {
            System.out.println("\n\n\nSu orden es\n"+Num2+" - "+Num1+" - "+Num3);
        }
        else   if (Num2>=Num3 && Num3>=Num1) {
            System.out.println("\n\n\nSu orden es\n"+Num2+" - "+Num3+" - "+Num1);
        }
        else   if (Num3>=Num1 && Num1>=Num2) {
            System.out.println("\n\n\nSu orden es\n"+Num3+" - "+Num1+" - "+Num2);
        }
        else   if (Num3>=Num2 && Num2>=Num1) {
            System.out.println("\n\n\nSu orden es\n"+Num3+" - "+Num2+" - "+Num1);
        }
        System.out.println("de Mayor a Menor\n");
        MayorAMenor();
    }
    public void OrdenadoMenorMayor(){
        if (Num1<=Num2 && Num2<=Num3) {
            System.out.println("\n\n\nSu orden es\n"+Num1+" - "+Num2+" - "+Num3);
        }
        else  if (Num1<=Num3 && Num3<=Num2) {
            System.out.println("\n\n\nSu orden es\n"+Num1+" - "+Num3+" - "+Num2);
        }
        else  if (Num2<=Num1 && Num1<=Num3) {
            System.out.println("\n\n\nSu orden es\n"+Num2+" - "+Num1+" - "+Num3);
        }
        else   if (Num2<=Num3 && Num3<=Num1) {
            System.out.println("\n\n\nSu orden es\n"+Num2+" - "+Num3+" - "+Num1);
        }
        else   if (Num3<=Num1 && Num1<=Num2) {
            System.out.println("\n\n\nSu orden es\n"+Num3+" - "+Num1+" - "+Num2);
        }
        else   if (Num3<=Num2 && Num2<=Num1) {
            System.out.println("\n\n\nSu orden es\n"+Num3+" - "+Num2+" - "+Num1);
        }
        System.out.println("De Menor a Mayor\n");
        MayorAMenor();
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
                System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
                Promedio();
        }
    }
    public void RegistroUsuario(){
        int[] Registro;
        Registro = new int[5];
        String User;
    }
}