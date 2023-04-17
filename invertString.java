
import java.util.Scanner;

public class invertString {

    public static void main(String[] args) {
        
        String palavra;
        Scanner teclado = new Scanner(System.in);// instanciando um objeto do tipo scanner para ler o a palavra digitada pelo usuario
        
        System.out.println("Digite uma palavra para ver sua escrita ao contrario:");
        palavra = teclado.nextLine();
        
        System.out.println("A palavra escrita ao contrario fica:");
        
            for(int i = palavra.length()-1; i >= 0 ; i--)// o laço de repetição for se inicia valendo o numero total de caracteres da string e vai decrementando a cada itereção
                // começando assim do ultimo elemento o colocando em primeira posiçao 
            {
                System.out.print(palavra.charAt(i));//charAT é o método que retorna o caractere no índice especificado em uma string.
            }             
    }
    
}