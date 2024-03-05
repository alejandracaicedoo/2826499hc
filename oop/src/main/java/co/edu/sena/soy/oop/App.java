package co.edu.sena.soy.oop;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scr = new Scanner(System.in);

        double numero1= 0;
        double numero2= 0;
        double numero3= 0;
        double numero4= 0;

        Data data= new Data();

        System.out.println( "Miscelanea de ejercicios oop" );
        System.out.println("--------------------------------------------------------");
        System.out.println("Menú principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");

    //submenú operadores

    System.out.println("---------------------------------------------------------");
    System.out.println("Categoria operadores");
    System.out.println("1. Calcular área triangulo");
    System.out.println("2. Sumar dos numeros");
    System.out.println("3. Elevar un numero al cuadrado");
    System.out.println("4. Conversion moneda");
    System.out.println("5. Área y perimetro cuadrado");
    System.out.println("6. Área y volumen de un cilindro");
    System.out.println("7. Área y longitud de un circulo");
    System.out.println("8. Promedio");

    System.out.println("-----------------------------");
        System.out.println("1. calcular área triangulo");
        System.out.println("ingrese base");
        numero1 = scr.nextDouble();
        System.out.println("ingrese altura");
        numero2 = scr.nextDouble();
        System.out.println("el area del triangulo es:" + data.áreatriangulo(numero1, numero2));
    
    

    System.out.println("-----------------------------");
        System.out.println("2. sumar dos numeros");
        System.out.println("ingrese numero");
        numero3 = scr.nextDouble();
        System.out.println("ingrese numero");
        numero4 = scr.nextDouble();
        System.out.println("la suma del numero es" + data.sumanumeros(numero3, numero4));

    System.out.println("-----------------");
    System.out.println("3. elevar un numero cuadrado");
    System.out.println("ingrese numero");
    numero1 = scr.nextDouble();
    System.out.println("el resultado :" + data.elevarnumero(numero1));

    System.out.println("-------------------------------------------------");
    System.out.println("4. conversion moneda");
    System.out.println(" ingrese valor");
    numero1 = scr.nextDouble();
    System.out.println("el valor del dolar es:" + data.conversor(numero1));

    System.out.println("---------------------------");
    System.out.println("5. area y perimetro cuadrado");
    System.out.println("ingrese el valor de uno de los lados para hallar el area y perimetro de un cuadrado");
    numero2 = scr.nextDouble();
    System.out.println("el area  del cuadrado es:" + data.areacuadrado(numero2));
    System.out.println("el perimetro del cuadrado es:" + data.perimetrocuadrado(numero1));

    System.out.println("--------------------");
    System.out.println("6. area y volumen de un cilindro");
    System.out.println("ingrese el valor del radio");
    numero1 = scr.nextDouble();
    System.out.println("ingrese el valor de la altura");
    numero2 = scr.nextDouble();
    System.out.println("el area del cilindro es:" + data.areadeuncilindro(numero1,numero2));
    System.out.println("el volumen del cilindro es:" + data.volumencilindro(numero1,numero2) );

    System.out.println("------------------------");
    System.out.println(" 7. area y longitud circulo");
    System.out.println("ingrese el valor del radio");
    numero1 = scr.nextDouble();
    System.out.println("la longitud del circulo es:" + data.longitudcirculo(numero1));
    System.out.println("el area del circulo es:" + data.areacirculo(numero1));

    System.out.println(" ------------------");
    System.out.println(" 8. promedio");
    System.out.println("ingrese primer numero a promediar  ");
    numero1 = scr.nextDouble();
    System.out.println("ingrese segundo numero a promedia");
    numero2 = scr.nextDouble();
    System.out.println("ingrese tercer numero a promediar");
    numero3 = scr.nextDouble();
    System.out.println("el promedio es:" + data.promedio(numero1, numero2, numero3));






    
    
    }


    }

