import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        String nome;
        int quantidade;
        float valor;

        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("\nNome do produto: ");
        nome = teclado.next();
        produto.setNome(nome);

        System.out.println("\n\nQuantidade: ");
        quantidade = teclado.nextInt();
        produto.setQuantidade(quantidade);

        System.out.println("\n\nPreço: ");
        valor = teclado.nextFloat();
        produto.setValor(valor);

        produto.exibir();
        teclado.close();
    } 
} 