/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.LinkedList;
import java.util.Queue;
import view.ContadorDeBotas;
import view.InputBotas;
import view.InputCarga;
/**
 *
 * @author Vinicius
 */
public class Main { // Classe principal.
    
    public static void main(String[] args)
    {
        try{
        ContadorDeBotas contador = new ContadorDeBotas();
        InputBotas inserir = new InputBotas();

        InputCarga inputC = new InputCarga();
        Queue <String> e = new LinkedList<>();
        inputC.inputarCarga(e);
        
        inserir.inputBotasPerdidas(e);
        contador.metodo(inserir.tamCalcado, inserir.lado);
        }catch(Exception s)
        {
            System.out.println("Erro ao executar");
        }
        
    }
}
