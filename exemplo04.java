//Importação necessária para utilizar o Scanner

import java.util.Scanner; //Para trabalhar com entrada de dados via teclado

public class exemplo4{

  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    double nota1,nota2,media;

    System.out.println("Digite a 1ª nota: ");
    nota1 = sc.nextDouble();
    System.out.println("Digite a 2ª nota: ");
    nota2 = sc.nextDouble();
    media = (nota1+nota2)/2.0;

    System.out.println("Média Final: "+ media);

    sc.close();
    }
}

      



   