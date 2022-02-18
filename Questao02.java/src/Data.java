package Questao3;
import java.util.Data;

public class Data {
    
        Data dia = new Data();
        private int Dia , Mes, Ano;
        public Data(int d, int m, int a){
        Dia = d;
        Mes = m;
        Ano = a;
        if (d > 31 || d < 1 ||  m > 12 || m < 1 || a < 0){
        Dia = 1;
        Mes = 1;
        Ano = 1;
    }
    }
    public int getDia(){
        return Dia;
    }
    public int getMes(){
        return Mes;
    }
    public int getAno(){
        return Ano;
    }
    public String getMesExtenso(){
        String a[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
        return meses[this.mes-1];
    }
    public int Compara(Data dia){


    if (nDia > dia.getDia() && nMes == dia.getMes() && nAno ==  dia.getAno()){
             return 1;
        }
        else if (nDia < dia.getDia() && nMes == dia.getMes() && nAno ==  dia.getAno()){
             return -1;
        }
        else if (nDia == dia.getDia() && nMes > dia.getMes() && nAno ==  dia.getAno()){
            return 1;
        }
        else if (nDia == dia.getDia() && nMes < dia.getMes() && nAno == dia.getAno()){
             return -1;
        } 
        else if (nDia == dia.getDia() && nMes == dia.getMes() && nAno > dia.getAno()){
             return 1;
        }
        else if (nDia == dia.getDia() && nMes == dia.getMes() && nAno < dia.getAno()){
             return -1;
        }
        else return  0;
    }
    public boolean isBissexto(Data dia){
        if((dia.getAno() % 4 == 0) && (dia.getAno() % 100 != 0)){
             return true;
            }
            else if(dia.getAno() % 400 == 0){
              return true;
             }
        return false;
    }
    public Data clone(){
        Data copia = new Data();
        return copia;
    }

}