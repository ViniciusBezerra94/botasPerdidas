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
public class ContadorDeBotas { // Classe para verificar quantidade de pares.
 

    public void metodo(int[] tamanho, String[] pe) { 
        int entrada = tamanho.length; // Variavel entrada receberá o tamanho do vetor.

        int contador = 0; // contador dos pares sendo iniciado em zero
        if(tamanho.length > 0){ // Só sera executado se tamanho do vetor for maior que dois por causa dos pares de botas.
            try{
                for (int cont = 0; cont < entrada; cont++) { // Enqunto contador menor que tamanho do vetor sera execuyado.
                        int x1 = tamanho[cont]; // Variavel auxiliar para armazenar o tamanho da bota.
                        String y1 = pe[cont]; // Variavel auxiliar para armazenar o lado da bota.
                        
                    for (int j = 0; j < entrada ; j++ ) // Esse for pecorrera todo o vetor comparando as variaveis auxiliares com todas as posiçoes do vetor.
                    {
                        if(x1 == tamanho[j] && !y1.equals(pe[j])) // Compara para encontrar um par de botas
                        {//ao ser encontrado ele zera as duas posições do vetor.
                            tamanho[cont] = 0;
                            pe[cont] = "E";
                            tamanho[j] = 0;
                            pe[j] = "E";

                            j = entrada;

                            contador = contador +1; // Adicionara 1 ao contador.

                        }
                    }    
                }
            }
            catch(Exception e)
            {
                System.out.println("Erro -> "  + e.getMessage());
            } 
             System.out.println("Contador: " + contador);

    }
       
    }
}
