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
    String ID[] = new String[6];//Para la opción de Promedio
    int notas1[] = new int[4];
    int notas2[] = new int[4];
    int notas3[] = new int[4];
    int notas4[] = new int[4];
    int notas5[] = new int[4];
    int notas6[] = new int[4];
    int Promedio[] = new int[4];
    String User;//Para la opción de Usuarios
    int Numero,Num,Num1,Num2,Num3,contador,i,res;//Variables a utilizar
    float promedio;
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
    public void RegistroUsuario(){//https://www.youtube.com/watch?v=ezB_dR5Ogws <-- Link de video
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
        contador = 5;//Empezará de 5 a 1
        for(i=Registro.length-1;i>=0;i--){//i-- Para retroceder al orden ingresado
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
        System.out.println("1. Ingresar ID");
        System.out.println("2. Notas ID1 "+ID[0]);
        System.out.println("3. Notas ID2 "+ID[1]);
        System.out.println("4. Notas ID3 "+ID[2]);
        System.out.println("5. Notas ID4 "+ID[3]);
        System.out.println("6. Notas ID5 "+ID[4]);
        System.out.println("7. Notas ID6 "+ID[5]);
        System.out.println("8. Menú Principal ");
        int op4;//Opción el menú Promedio
        op4 = leer.nextInt();
        switch (op4){
            case 1:
                    Id();
                break;
            case 2:
                    NotasID1();
                break;
            case 3:
                    NotasID2();
                break;
            case 4:
                    NotasID3();
                break;
            case 5:
                    NotasID4();
                break;
            case 6:
                    NotasID5();
                break;
            case 7:
                    NotasID6();
                break;
            case 8:
                System.out.println("\n\n\n");
                MenuP();
                break;
            default:
                System.out.println("\n\n\n\n Opción incorrecta. Escriba de acuerdo a los parámetros establecidos. "
                            + "Y no utilice letras\n");
                Promedio();
        }
    }
    public void Id(){
        System.out.println("\n\nIngrese los ID");
        contador = 1;
        User=null;
        res=0;
        for(i=0;i<6;i++){
            System.out.println("Ingrese ID No."+contador);
            User = leer.next();
            ID[i]=User;  
            contador++;
        }
        System.out.println("\n");
        Promedio();
    }
    public void NotasID1(){
        System.out.println("NOTAS ID: "+ID[0]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[0]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[0]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas1[i] = leer.nextInt();
                res = res + notas1[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[0]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas1[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID1();
    }
    public void NotasID2(){
        System.out.println("NOTAS ID: "+ID[1]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[1]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[1]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas2[i] = leer.nextInt();
                res = res + notas2[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[1]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas2[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID2();
    }
    public void NotasID3(){
        System.out.println("NOTAS ID: "+ID[2]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[2]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[2]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas3[i] = leer.nextInt();
                res = res + notas3[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[2]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas3[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID3();
    }
    public void NotasID4(){
        System.out.println("NOTAS ID: "+ID[3]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[3]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[3]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas4[i] = leer.nextInt();
                res = res + notas4[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[3]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas4[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID4();
    }
    public void NotasID5(){
        System.out.println("NOTAS ID: "+ID[4]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[4]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[4]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas5[i] = leer.nextInt();
                res = res + notas5[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[4]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas5[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID5();
    }
    public void NotasID6(){
        System.out.println("NOTAS ID: "+ID[5]+"\n");
        System.out.println("1. Ingresar Notas de "+ID[5]);
        System.out.println("2. Mostrar Notas Y Promedio");
        System.out.println("3. Volver");
        Num=leer.nextInt();
        switch(Num){
            case 1:
            System.out.println("\n\nIngrese notas de "+ID[5]);
            res=0;
            for (i=0;i<4;i++){
                System.out.println("Ingrese Nota "+(i+1));
                notas6[i] = leer.nextInt();
                res = res + notas6[i];
            }break;
            case 2:
                promedio = res/4;
                System.out.println("Notas de "+ID[5]);
                    for (i=0;i<4;i++){
                    System.out.println("Nota "+(i+1)+":    "+notas6[i]);
                }
                    System.out.println("------------------");
                    System.out.println("Promedio = "+promedio);
                    break;
            case 3:
                Promedio();
                break;
            default:
                System.out.println("Opción incorrecta");
    }
        System.out.println("\n");
        NotasID6();
    }
   }