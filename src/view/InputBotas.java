/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import view.VerificarValor;

/**
 *
 * @author Vinicius
 */
public class InputBotas // Classe para pegar cada linha da fila e separar em dois vetores onde 1 ficara armazenado a posição esquerda ou direita do calçado e o outro a tamanho da bota.
{
   public int[] tamCalcado; // Vetor do tamanho da bota.
   public  String[] lado; // Vetor do lado da bota.
/*    public static void main(String[] args)
    {
       InputPares inputP = new InputPares(); 
       InputBotas input = new InputBotas();
       
       input.inputBotasPerdidas(inputP.inputParesBotas());
       

    }  
*/ 
   VerificarValor v = new VerificarValor(); // Instância do objeto.
    public InputBotas() // Construtor default.
    {
    
    }
    public void inputBotasPerdidas(Queue <String> carga) // Método que recebe uma fila e separa em 2 vetores.
    {
        int erroLinha = 0;
        int total = carga.size();
        if((carga.size() %2 == 0) && (carga.size() > 0) && (carga.size() < 1000)) // Validação para numeros pares que aceitara no maximo 1000 linhas.
        {
            int tamanho = carga.size(); 
            boolean looping = true;
            Scanner entrada = new Scanner(System.in);
            tamCalcado = new int [tamanho];
            lado = new String [tamanho];
            int i = 0;

                try{
                    while(!carga.isEmpty()) // Enquanto a fila não estiver vazia o laço será executado.
                    {
                        String frase = carga.remove();  //Valor da fila sera dividido em 2 vetores.
                        

                            String[] array  = new String[2]; 
                            array = frase.split(" ");

                            int calcadoAux = Integer.parseInt(array[0]); // Variavel auxiliares que entrara no if para passar somente valores corretos.
                            String ladoAux = array[1]; 

                            if(v.verificar(calcadoAux, ladoAux))
                            {

                                tamCalcado[i] = Integer.parseInt(array[0]);
                                lado[i] = array[1];
 
                                i++;

                            }else
                            {
                                erroLinha = (total - carga.size());
                                System.out.println("Erro linha: " + erroLinha);
                                while(!carga.isEmpty())
                                {
                                    carga.remove();
                                }
                                tamCalcado = new int[0];
                                lado = new String [0];
                            }
                        
                    }
                }catch(Exception e) // Ao encontrar um valor invalido ele zera os valores dos vetores.
                {
                    System.out.println("Valor Invalido na linha: " + (erroLinha = total - carga.size()));
                    tamCalcado = new int[0];
                    lado = new String[0];
                }


            }else // Caso validação dos numeros pares até 1000 linhas seja invalido, imprimirá uma mensagem de erro.
            {
                System.out.println("Valor de Linha incorreto: " +total+ " , valor excedido ou incorreto" );
            }
    }
        

    }

