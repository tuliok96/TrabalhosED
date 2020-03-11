/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.ArrayList;

/**
 *
 * @author tulio
 */
public class MediaAluno {

    //Atribuição
    int[] nota = new int[5];
    int valornota;
    int c = 0;
    double somanota = 0;
    double media;

    public void addNota(int valornota) {
        if (valornota > 100 || valornota < 0) {
            System.out.println("Impossível adicionar valor. ");
        } else {
            if (c == 4) {
                System.out.println("Todas as notas já foram digitadas.");
            } else {
                nota[c] = valornota;
                somanota = somanota + nota[c];
                c++;
            }

        }
    }

    public void calculaMedia() {
        media = somanota / c;
        System.out.println("A média do aluno é: " + media);
    }

}
