//Importação necessária para utilizar o Scanner

import java.util.Scanner; //Para trabalhar com entrada de dados via teclado

public class exemplo03{

  public static void main (String[]args){

    // sc é o nome padrão para o meu Scanner. Posso utilizar qualquer outro nome
    
    Scanner sc = new Scanner(System.in);

    int idade;

    System.out.println("Digite a sua idade");

    idade = sc.nextInt();   



    //checando a idade

    if(idade <18){

      System.out.println("Que pena, você só pode beber Toddynho");
  
    }
    else{
      System.out.println("Parabéns, você pode beber Coca Cola!!");
    }
    sc.close(); // Para finalizar o scanner

    
  }  
}