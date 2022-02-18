import java.util.Scanner;

public class Empresa {
    String departamento;
    static int cont = 0;
    Departamento[] Departamentos = new Departamento[10];

    void addDepartamento (String nome, double salario, int DataAmss) {
        Departamento tempDepartamento = new Departamento(nome, salario, DataAmss);
        Departamento[cont] = tempDepartamento;
        cont++;
}