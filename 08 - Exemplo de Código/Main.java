import java.util.*;

public class Main {

public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 System.out.println("Digite o dia");
 int dia = teclado.nextInt();
 System.out.println("Digite o Mês"); 
int mes = teclado.nextInt();
 Datas nasce = new Datas(dia,mes);
 try { 
String extenso = nasce.transforma(); 
System.out.println("Data por extenso:" + extenso); 
}
 catch (Exception e){
 System.out.println(e.getMessage()); 
}
 }
}