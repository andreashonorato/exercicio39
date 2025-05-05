
package com.mycompany.exercicio39;

import javax.swing.JOptionPane;


public class Exercicio39 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 2:"));
        int n = 0;
        try{
        
        n = n1/ n2;
        }catch (java.lang.ArithmeticException e) {
            
        }
        System.out.println("O resultado é:" + n);
    }
}
