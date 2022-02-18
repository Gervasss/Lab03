
package Questao3;

public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data dia = new Data(07,06,2001);
        Data i = new Data(29,11,2019);
        System.out.println(dia.getDia());
        System.out.println(dia.getMes());
        System.out.println(dia.getAno());
        System.out.println(i.getDia());  
        System.out.println(i.getMes());
        System.out.println(i.getAno());
        System.out.println(dia.getMesExtenso());
        System.out.println(dia.Compara(dia));
        System.out.println(dia.isBissexto(dia));
        System.out.println(dia.clone(dia));
    }    

}