/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Paulo Henrique
 */
public class Cliente{
    private String nome;
    private String numeroF;
    private String numeroS;
    private String status;
    private ArrayList<Estoque> historico = new ArrayList<Estoque>(); //Este será o histórico de compra do cliente
    SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
    private Estoque compra = new Estoque(0000, "Default", formatacao.parse("29/09/9999"), 0, "Deafult", 0.0, 0.0, 0.0);
    
    
    public Cliente(String nome, String numero1, String status){
        this.nome = nome;
        this.status = status;
        this.numeroF = numero1;
        this.numeroS = "(00)00000-0000";
    }
   public Cliente(String nome, String numero1, String numero2, String status){
       this.nome = nome;
       this.status = status;
       this.numeroF = numero1;
       this.numeroS = numero2;
   }
   public void compraFeita(Estoque compra){
       this.compra = compra;
       adicionaHistorico();
   }
    public void adicionaHistorico(){ //Adiciona a compra em uma arraylist que será o histórico de compras do cliente
        historico.add(compra);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(String numeroF) {
        this.numeroF = numeroF;
    }

    public String getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(String numeroS) {
        this.numeroS = numeroS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
