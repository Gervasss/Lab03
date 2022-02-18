import java.util.Scanner;

public class Departamento {
    String departamento;
    static int cont = 0;
    Funcionario[] funcionarios = new Funcionario[100];
    


    void addFuncionario (String nome, double salario, int DataAmss) {
        Funcionario tempFuncionario = new Funcionario(nome, salario, DataAmss);
        funcionarios[cont] = tempFuncionario;
        cont++;

    }
}