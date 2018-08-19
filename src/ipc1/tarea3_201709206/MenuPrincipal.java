package ipc1.tarea3_201709206;
// @author Luisa Fernanda CC

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal (){
        //Constructor
        MenuP();
    }
    Scanner leer = new Scanner(System.in);
    String Registro[] = new String[5];//Para la opción de Usuarios
    String User;//Para la opción de Usuarios
    int Numero,Num,Num1,Num2,Num3,contador,i,res;//Variables a utilizar
    public void MenuP() {//Menú Principal
        // Declarando variables
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
                case 1://Si elige Usuarios
                    System.out.println("\n\n\n");
                   Usuario();
                break;
                case 2://Si elige Contador
                    System.out.println("\n\n\n");
                   Contador();
                break;
                case 3://Si elige Mayor a Menor
                    System.out.println("\n\n\n");
                    MayorAMenor();
                break;
                case 4://Si elige promedio
                    System.out.println("\n\n\n");
                    Promedio();
                break;
                case 5:
                    System.exit(0);//Salir del programa
                break;
                default://Si no es ninguna de las opciones
                    System.out.println("\n\n\n\n Opción incorrecta.\n");
            }
        }
    }
    
    public void Usuario(){
        System.out.println("USUARIO\n");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios Ascendentes ");
        System.out.println("3. Mostrar Usuarios Descendentes");
        System.out.println("4. Menú Principal");
        i = 1;//Contador
        int op1;//Opción del menú de usuario
        op1 = leer.nextInt();
        switch (op1){
            case 1:
                RegistroUsuario();
                break;
            case 2:
                UserAscendentes();
                break;
            case 3:
                UserDescendentes();
                break;
            case 4:
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\n\n\n Opción incorrecta.");
                Usuario();
        }
    }
    public void RegistroUsuario(){
        contador = 1;
        for(i=0;i<Registro.length;i++){
            System.out.println("Ingrese Usuario No."+contador);
            User = leer.next();
            Registro[i]=User;  
            contador++;
        }
        System.out.println("\nUsuarios ingresados exitosamente\n\n");
        Usuario();
    }
    public void UserAscendentes(){
        contador = 5;
        for(i=Registro.length-1;i>=0;i--){
            System.out.println("Usuario No."+contador+": "+Registro[i]);
            contador--;
        }
        System.out.println("\n");
        Usuario();
    }
    public void UserDescendentes(){
        contador = 1;
        for(i=0;i<Registro.length;i++){
            System.out.println("Usuario "+contador+": "+Registro[i]);
        contador++;
        }
        System.out.println("\n");
        Usuario();
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
                    IngresoNúmeros();
                    break;
            case 2:
                    Buscador();
                break;
            case 3:
                    NumeroDigitos();
                break;
            case 4:
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                Contador();
        }
    }
    public void IngresoNúmeros(){
        System.out.println("\n\nIngrese un número");
        Num = leer.nextInt();
        System.out.println("\n");
        Contador();
    }
    public void Buscador(){
        System.out.println("\n\nIngrese el número a buscar en "+Num);
	Num1 = leer.nextInt();//Numero a buscar
	Numero = Num;//Numero que el usuario ingresó anteriormente
	contador=0;//Contador de las veces que se repite el número
	res=Numero;//Variable en la que se guardará el residuo
	while(Numero>=1){
		res = Numero % 10;//El residuo de la división entre 10
		Numero = Numero / 10;
		if (res==Num1){//Si el residuo es igual al numero a buscar
			contador++;//Sumar a contador +1
		}        
	}
        System.out.println("\nEl dígito "+Num1+" se repite "+contador+" veces\n\n");
        Contador();
    }
    public void NumeroDigitos(){
        System.out.println("Numero "+Num);
        contador = 0;//Contador de dígitos
        Numero = Num;//Numero que el usuario ingreso
        res=Numero;//Variable que se divirá en 10
        System.out.println(Numero+" "+res);
        while (res>=1) {//Mientras la variable sea mayor o igual a 1
            res = res / 10;//dividir en 10
            contador++;//Sumar al contador +1
        }
        System.out.println("\n\nEl número "+Numero+" tiene "+contador+" dígitos\n\n");
        Contador();
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
        Numero = 0;//Número que el usuario ingresará
        i = 1;//Contador
        int Número[] = new int[3];
        do{
        System.out.println("Ingrese Número No."+i);
        try{
        Numero= leer.nextInt();
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Numeros, no letras");
        }
        Número[i-1]= Numero;//Número es la matriz, [i-1] es la fila en que se ingresará el número, "Numero" la variable en que se guardará
            System.out.println("Número "+Numero+" resgistrado.");//Confirma el registro del número
            i++;
            Num1 = Número[0];//Variable donde se guarda el primer número
            Num2 = Número[1];//Variable donde se guarda el segundo número
            Num3 = Número[2];//Variable donde se guarda el tercer número
        }while(i!=4);//Detiene el proceso hasta que elcontador sea 4
        System.out.println("\n\n\n\n -Números ingresados exitosamente- \n");
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
}