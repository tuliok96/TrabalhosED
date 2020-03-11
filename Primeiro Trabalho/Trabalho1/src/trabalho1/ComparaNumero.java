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
public class ComparaNumero {

    int n1;
    int n2;

    public ComparaNumero() {
        this.n1 = 0;
        this.n2 = 0;
    }

    public void maiorNumero(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
            System.out.println("O menor número é: " + n2);

        } else {
            if (n2 > n1) {
                System.out.println("O maior número é: " + n2);
                System.out.println("O menor número é: " + n1);

            } else {
                System.out.println("Os números são iguais");
            }
        }
    }

}
