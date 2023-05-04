/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Paulo Henrique
 */
public class Produto {
    private int id;
    private String nome;
    private Date validade;
    private int quantidade;
    private String marca;
    private double valor_bruto;
    private double valor_liquido;
    private double valor_venda;

    public Produto() {
    }

    public Produto(int id, String nome, Date validade, int quantidade, String marca, double valor_bruto, double valor_liquido, double valor_venda) {
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.marca = marca;
        this.valor_bruto = valor_bruto;
        this.valor_liquido = valor_liquido;
        this.valor_venda = valor_venda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor_bruto() {
        return valor_bruto;
    }

    public void setValor_bruto(double valor_bruto) {
        this.valor_bruto = valor_bruto;
    }

    public double getValor_liquido() {
        return valor_liquido;
    }

    public void setValor_liquido(double valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }
    
}
