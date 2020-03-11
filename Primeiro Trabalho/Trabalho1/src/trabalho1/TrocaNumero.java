/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author tulio
 */
public class TrocaNumero {

    //Atribuição
    public int numA;
    public int numB;

    //Construtores
    public TrocaNumero() {
        this.numA = 0;
        this.numB = 0;
    }

    //Método
    public void mudaPosicao(int numA, int numB) {
        System.out.println("Entrada: " + numA + " e " + numB);

        int aux = numA;
        numA = numB;
        numB = aux;

        System.out.println("Saída: " + numA + " e " + numB);
    }

}
