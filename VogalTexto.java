public class VogalTexto{
  public static void main(String[] args) {  
    String texto = "O rato roeu a roupa do rei de Roma";
    char[] vogais = {'A','a','E','e','I','i','O','o','U','u'};
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
