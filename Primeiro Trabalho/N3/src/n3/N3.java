/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n3;

/**
 *
 * @author tulio
 */
public class N3 {

    /**
     * @param args the command line arguments
     */
    public int soma = 0;
    public int n = 30;
    public int multiplica = 0;

    public static void somaImpar(int n) {
        int soma = 0;
        for (int c = 0; c <= 30; c++) {
            soma = soma + c;
        }
        System.out.println("Resultado da soma dos ímpares: " + soma);

    }

    public static void multiplicaPar(int n) {
        int multiplica = 1;

        for (int c = 1; c <= n; c++) {
            multiplica = multiplica * c;
        }
        System.out.println("Resultado da multiplicação dos pares: " + multiplica);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 30;

        somaImpar(n);
        multiplicaPar(n);
    }

}
