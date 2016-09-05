/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nivel1c8;
import java.util.Scanner;


/**
 * programa:nivel1c8
 * descripcion: menor de tres numeros
 * fecha: 11 de junio del 2014
 * autor: Irving Zambrano
 * @author IRvInG
 */
public class Nivel1c8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1=0;
        int valor2=0;
        int valor3=0;
        int menor=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("porfin salio");
        System.out.println("Irving Z");
        System.out.println("ingrese el primer valor ==> ");
        valor1=entrada.nextInt();
        System.out.println("ingrese el segundo valor ==> ");
        valor2=entrada.nextInt();
        System.out.println("ingrese el tercer valor ==> ");
        valor3=entrada.nextInt();
        menor=valor1;
        if
                (valor2<menor)
        {
            menor=valor2;
        }
        if
                (valor3<menor)
        {
            menor=valor3;
        }
        System.out.printf("el menor de %d %d %d es ==>(%d)", valor1,valor2,valor3,menor);
        }
        
        
    }
    

