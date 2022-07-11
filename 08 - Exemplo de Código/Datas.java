public class Datas { int dia; int mes;
Datas (int dia, int mes){ this.dia = dia; this.mes = mes; }
public String transforma() throws RuntimeException {
RuntimeException erro1 = new RuntimeException("Dia inválido");
RuntimeException erro2 = new RuntimeException("Mês inválido");
RuntimeException erro3 = new RuntimeException("Este mês não tem 31 dias"); 
RuntimeException erro4 = new RuntimeException("Fevereiro tem apenas 28/29 dias");


 if (dia==0 || dia>31) throw erro1;
 if (mes==0 || mes>12) throw erro2;
 if (dia==31 && (mes==2 || mes==4 || mes==6 || mes==9 || mes==11)) throw erro3;
 if (dia>29 && mes==2) throw erro4;


String data = String.valueOf(dia)+'/';
 switch(mes){
 case 1: data = data+"Janeiro"; break;
 case 2: data = data+"Fevereiro"; break;
 case 3: data = data+"Março"; break; 
 case 4: data = data+"Abril"; break;
 case 5: data = data+"Maio"; break;
 case 6: data = data+"Junho"; break;
 case 7: data = data+"Julho"; break;
 case 8: data = data+"Agosto"; break;
 case 9: data = data+"Setembro"; break;
 case 10: data = data+"Outubro"; break;
 case 11: data = data+"Novembro"; break;
 case 12: data = data+"Dezembro"; break;
 } 
return data; } 
}