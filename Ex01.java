/*=============================================================================
 |    Autor:        Johnny Meneses [bilbo_vader@outlook.com]
 |    Tecnologia:   Arduino / C++
 |    Descrição:    Faça um programa que leia 10 números inteiros e os imprima na ordem inversa
 |    VersãO:       1.0 [01/10/20]
 *===========================================================================*/
 
 

//package listalogica;

import java.util.Scanner;

public class Ex01 
{
    public static void main(String args [])
    {
        Scanner ler = new Scanner(System.in);
        int[] numeros;
        numeros = new int[10];
        
        
        for(int i=0;i<10;i++)
        {
            System.out.printf("Digite o "+i+"º numero: ");
            numeros[i] = ler.nextInt();
        }
        
       for(int i=9;i>=0;i--)
        {
            System.out.print(numeros[i]+" ");
        }
        
    }

    
}
