import java.util.Scanner;

public class Main{
  //análise de envolvimento no crime
  static int questionamento(){
    int resposta=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Você telefonou para a vítima?");
    resposta+= validade(input.nextInt());

    System.out.println("Você esteve no local do crime?");
    resposta+= validade(input.nextInt());
    
    System.out.println("Você mora perto da vítima?");
    resposta+= validade(input.nextInt());
  
    System.out.println("Você devia para a vítima?");
    resposta+= validade(input.nextInt());

    System.out.println("Você já trabalhou com a vítima?");
    resposta+= validade(input.nextInt());
    return resposta;
  }

  //verificação dos dados
  static int validade(int y){
    int valorValido=0;
    Scanner input = new Scanner(System.in);
    while(y!=1 && y!=2){
      System.out.println("Valor inválido, digite novamente");
      y=input.nextInt();
    }
    if(y==1){
      valorValido+=1; 
    }
    else if(y==2){
      valorValido+=0;  
    }
    return valorValido;
  }
  
  //sentença final
  static String julgamento(int x){
    String julgado="";
    if(x<2){
      julgado="inocente";
    }
    else if(x==2){
      julgado="suspeito";
    }
    else if(x==3 || x==4){
      julgado="cumplice";
    }
    else if(x==5){
      julgado="assassino";
    }
    return julgado;
  }
  
  public static void main(String[] args) {
    int questionario=0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Responda ás questões utilizando 1 para sim ou 2 para não");

    questionario=questionamento(); 
    String decisao = julgamento(questionario);
    System.out.println("Você é "+decisao);
  }
}
