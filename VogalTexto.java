import java.util.Scanner;
public class VogalTexto{
  public static void main(String[] args) { 
    Scanner input= new Scanner(System.in);
    System.out.println("Digite um texto para saber a quantidade de vogais: ");
    String texto = input.nextLine();
    char[] vogais = {'A','a','Ã','ã','Á','á','À','à','Â','â','E','e','É','é','Ê','ê','I','i','Í','í','O','o','Ó','ó','U','u','Ú','ú'};
    int vogalCont = 0;

    for (char letra : texto.toCharArray()) {
      for (char vogal : vogais) {
        if (letra == vogal) {
           vogalCont++;
           break;
        }
      }
    }

    System.out.println("O texto contém " + vogalCont + " vogal(is).");
  }
}
