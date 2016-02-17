/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Vinicius
 */
public class VerificarValor { // Classe para verificar tamanho e lado das botas.

    public boolean verificar(int e, String d) { // Método recebe um inteiro que é referente ao tamanho da bota e tambem uma string que é referente ao lado da bota.
       
        if ((e >= 30 && e <= 60) && (d.equalsIgnoreCase("d") || d.equalsIgnoreCase("e"))){ // Codndição para verificar se o tamanho da bota é maior que 30 e menor que 60 e para verificar se o lado é direto ou esquerdo.
        
            return true; // Caso as 2 referências recebidas sejão verdadeiras o método retornará true.
        }else
        {
            return false; // Caso 1 das referências recebidas sejá falsa o método retornará false.
        }

    
    }
}
