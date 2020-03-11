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
public class NumeroDecrescente {

    //Atribuição
    int n;

    //Construtor
    public NumeroDecrescente() {
        this.n = 0;
    }
    
    //Método decrescente
    public void contaDecrescente (int n){
        System.out.println("Contagem decrescente: ");
        for (int c=0; c<n; c++){
            System.out.println("- " + (n-c));
        }
    }
}
