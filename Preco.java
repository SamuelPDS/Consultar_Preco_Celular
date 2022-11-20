package com.mycompany.tedcelular;
import java.util.Random;
import java.util.Scanner;

public class Tedcelular {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);   
    int cel1 = 13000;
    int cel2 = 6000;
    int cel3 = 3000;
    int opcao = 0;
    int numero = 0;
    
    while (opcao !=4) {
        System.out.println("Qual celular você deseja consultar?");
        System.out.println(" 1 - Iphone 13");
        System.out.println("2 - Samsung Galaxy S22");
        System.out.println("3 - Samsung Galaxy A32");
        
        numero = sc.nextInt();
        switch (numero){
        
        case 1:
        System.out.println("O valor do Iphone 13 esta em "+cel1); 
        break;
        
        case 2:
        System.out.println("O valor do S22 e de "+cel2);
        break;
        case 3:
        System.out.println("O valor do A32 e de "+cel3);
        break;
        }
        System.out.println("Deseja prosseguir? 1 - sim 4 - nao");
        opcao = sc.nextInt();
    }
}
}
