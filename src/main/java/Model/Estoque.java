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
    
    
    /**
     * Adiciona um novo produto na mochila
     * 
     * @param id
     * @param nome
     * @param validade
     * @param quantidade
     * @param marca
     * @param valor_bruto
     * @param valor_liquido
     * @param valor_venda 
     */
    void setMochila(int id, String nome, String validade, int quantidade, String marca, double valor_bruto, double valor_liquido, double valor_venda){
        this.produto = new Produto(id, nome, validade, quantidade, marca, valor_bruto, valor_liquido, valor_venda);
        mochila.add(produto);
    }
    
    /**
     * Retira uma unidade da mochila passando como parâmetro o Identificador do
     * produto.
     * @param id 
     */
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
    
    /**
     * Consulta todos os produtos da mochila.
     */
    void consultaMochila(){
        for(Produto posicao: mochila){
            System.out.println(posicao);
        }
    }
    /**
     * Apaga o produto da mochila passando como parâmetro o Identificador do
     * produto.
     * @param id 
     */
    void apagaProduto(int id){
        for(Produto posicao: mochila){
            if(posicao.getId() == id){
                mochila.remove(posicao);
                break;
            }
        }
    }
    // Buscar Produto na mochila
    /**
     * Busca um produto específico na mochila passando como parâmetro o Identifi
     * cador do produto.
     * @param id 
     */
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
