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
public class Cliente extends Pessoa{
    private String numeroS;
    private String status;
    private ArrayList<Produto> historico = new ArrayList<Produto>(); //Este será o histórico de compra do cliente
    private Produto compra = new Produto();

    //Registrar compra
    void registraCompra(int id, String nome, String validade, int quantidade, String marca, double valor_bruto, double valor_liquido, double valor_venda){
        this.compra = new Produto(id, nome, validade, quantidade, marca, valor_bruto, valor_liquido, valor_venda);
        historico.add(this.compra);
    }
    //Consulta historico
    void consultaHistorico(){
        for(Produto passo: historico){
            System.out.println(passo);
        }
    }
    //Busca no historico
    void buscaHistorico(int id){
        for(Produto passo: historico){
            if(passo.getId()==id){
                System.out.println(passo);
                break;
            }
        }
    }
    public Cliente( String nome, String numero, String numeroS, String email) {
        super(nome, numero, email);
        this.numeroS = numeroS;
    }

    public Cliente(String nome, String numero, String email) {
        super(nome, numero, email);
        this.numeroS = "(00)00000-0000";
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
