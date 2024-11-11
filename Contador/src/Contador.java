import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
      Scanner terminal = new Scanner (System.in);
      
      int parametro1 = terminal.nextInt();
      int parametro2 = terminal.nextInt();
      terminal.close();
      try{
        contar(parametro1, parametro2);
      }catch (ParametrosInvalidosException e){
        System.out.println("Erro: " + e.getMessage());
      }
  }
  
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
      
      if(parametroUm >= parametroDois){
        throw new ParametrosInvalidosException ("O segundo número precisa ser maior que o primeiro número");
      }
      
      int contagem = parametroDois - parametroUm;
      for (int i = 1; i <= contagem; i++){
        System.out.println(i);
      }
    }
}
