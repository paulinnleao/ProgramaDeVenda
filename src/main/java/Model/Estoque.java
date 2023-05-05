/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Paulo Henrique
 */
public class Estoque {
    // Cria a mochila
    private ArrayList<Produto> mochila = new ArrayList<Produto>();
    Produto produto = new Produto();
    
    
    // Adicionar produto na mochila
    void setMochila(int id, String nome, String validade, int quantidade, String marca, double valor_bruto, double valor_liquido, double valor_venda){
        this.produto = new Produto(id, nome, validade, quantidade, marca, valor_bruto, valor_liquido, valor_venda);
        mochila.add(produto);
    }
    // Retirar Produto da mochila
    void retiraProduto(int id){
        for(Produto posicao: mochila){
            if(posicao.getId() == id ){
                if(posicao.getQuantidade()>0){
                   posicao.setQuantidade(posicao.getQuantidade()-1);
                }
                break;
            }
        }
    }
    // Consultar Produtos na mochila
    void consultaMochila(){
        for(Produto posicao: mochila){
            System.out.println(posicao);
        }
    }
    // Apagar Produto da mochila
    void apagaProduto(int id){
        for(Produto posicao: mochila){
            if(posicao.getId() == id){
                mochila.remove(posicao);
                break;
            }
        }
    }
    // Buscar Produto na mochila
    void buscarProduto(int id){
        for(Produto posicao: mochila){
            if(posicao.getId()==id){
                System.out.println(posicao);
                break;
            }
        }
    }
    public Estoque() {
    }
    
}
