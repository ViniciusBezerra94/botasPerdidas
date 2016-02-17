/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinicius
 */
public class InputCarga {
    
    
    public void inputarCarga(Queue <String> carga ) // Classe para fazer a entrada das informaçoes a partir de um arquivo (por exemplo bloco de texto).
    {
 
        try // Tratamento de exceçoes caso o arquivo contenha alguma informação que não esteja sendo esperada pela classe. 
        {
            FileReader arq = new FileReader("C:\\Users\\TEMP.UMESPACAD\\Desktop\\Nova pasta\\texto.txt"); // O atributo "arq" receberá as informações contidas pelo arquivo indicado. 
            BufferedReader lerArq = new BufferedReader(arq); 

            String linha = lerArq.readLine(); // Faz a leitura de linha por linha do arquivo inserido.
            
            while (linha != null ) // Enquanto a linha não estiver nula o while continuara sendo execultado.
            {   
                carga.add(linha);  // O conteudo da linha será adicionado na fila.
               linha = lerArq.readLine(); // Fará a leitura da proxima linha.
               
            }

        }catch(IOException e )
        {
            System.out.println("Erro ->" + e.getMessage()); // Imprimirar uma mensagem de erro.
        } 
    }
}
