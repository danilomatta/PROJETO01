import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro){
            throw new  ParametrosInvalidosException("O segundo parametro tem que ser maior que o primeiro");
        } 

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i<= contagem; i++ ){
            System.out.println("Imprimindo o numero: "+ i);
        }

    }
}
