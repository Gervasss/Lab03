import java.util.Random;

public class Produto{
    static private long codigo;
    private String nome;
    private int quantidade;
    private float valor;

   static Random random = new Random();

    Produto(){}
    Produto(String nome, int quantidade, float valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public void exibir() {
        System.out.println("\nCodigo: " + geraCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor: " + getValor());
        System.out.println("Valor da venda: " + calcularVenda());
    }

    float calcularPreco(){
        return (float) (valor * 1.2);
    }
    
    float calcularVenda() {
        return calcularPreco() * quantidade;
    }

    static long geraCodigo() {
        codigo = random.nextInt(200);
        return codigo;
    }  
    
    //---------
    public long getCodigo() {
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 

    public int getQuantidade() {
        return quantidade;
    }   

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}