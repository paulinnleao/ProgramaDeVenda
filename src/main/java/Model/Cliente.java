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
    private ArrayList<Estoque> historico = new ArrayList<Estoque>(); //Este será o histórico de compra do cliente
    SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");

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
