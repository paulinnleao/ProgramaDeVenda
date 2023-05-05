/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Produto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Paulo Henrique
 */
public class CadastroClienteController {
    
    private Cliente cliente = new Cliente();
    // Buscar - Verifica se já existe cliente no txt
    /*    Caso esteja vazio, ele buscará todos os arquivos dentro do txt;
          Caso contrário, buscará o que tem dentro da caixa. */
    ArrayList<Cliente> buscaCompleta(boolean hasNextLine) throws FileNotFoundException, IOException{
        String linha;
        String[] parametro = {"","","",""};
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        
        FileReader fr = new FileReader("./src/BD/contatos.txt");
        BufferedReader br  = new BufferedReader(fr);
        linha = "";
        while((linha=br.readLine())!=null){
          String vetorStr[] = linha.split(";");
          cliente = new Cliente(vetorStr[0], vetorStr[1], vetorStr[2], vetorStr[3], vetorStr[4]);
          clientes.add(cliente);
        }
//        while(leituraContato.hasNextLine()){
//            if(hasNextLine){
//                linha = leituraContato.nextLine();
//                for(int j = 0, i = 0; i<linha.length(); i++){
//                    if(linha.charAt(i)==';'){
//                        j++;
//                    }else{
//                        parametro[j]+=linha.charAt(i);
//                    }
//                }                
//                cliente = new Cliente(parametro[0],parametro[1],parametro[2],parametro[3],parametro[4]);
//                clientes.add(cliente);
//            }
//        }
        return clientes;
    }
    
    /*    Caso encontre cliente com o nome, não permite adicionar o mesmo,
          caso não encontre o cliente, permite adicionar*/
    void cadastroCliente(String nome, String telefone, String telefone2, String email){
        this.cliente = new Cliente(nome, telefone, telefone2, email);
        try{
            FileWriter fw = new FileWriter("contatos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.cliente.getNome()+";"
                    + ""+this.cliente.getNumero()+";"
                            + ""+this.cliente.getNumeroS()+";"
                                    + ""+this.cliente.getStatus()+";"
                                            + ""+this.cliente.getEmail()+";");
            
            pw.close();
            fw.close();
        } catch (IOException e){
            System.out.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
    
    /*    Busque o histórico de compra do cliente */
    
       
}
