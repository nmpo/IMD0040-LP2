public class Vogais{
  public boolean temVogal(char letra){
    char[] vogais = {'ã','õ','Ã','Õ','a','e','i','o','u','á','é','í','ó','ú','à','è','ì','ò','ù','â','ê','î','ô','û','A','E','I','O','U','Á','É','Í','Ó','Ú','À','È','Ì','Ò','Ù','Â','Ê','Î','Ô','Û'};

    for(int i = 0; i<vogais.length; i++){
      if(vogais[i] == letra){
        return true;
      }
    }
    return false;
  }

  public int contarVogais(String text){
    int quantidade = 0;
    char[] char_teste = text.toCharArray();

    for(int i = 0;i<char_teste.length; i++){
      if(temVogal(char_teste[i])){
        quantidade++;
      }
    }
    return quantidade;
  }
}
