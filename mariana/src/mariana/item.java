/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana;

/**
 *
 * @author aluno
 */
public class item {

    /**
     * @return the codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the unitário
     */
    public valor getUnitário() {
        return unitário;
    }

    /**
     * @param unitário the unitário to set
     */
    public void setUnitário(valor unitário) {
        this.unitário = unitário;
    }

    /**
     * @return the marca
     */
    public int getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(int marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
private int codProduto;
private int quantidade;
private int subtotal;
 private valor unitário;
private int marca;
private int modelo;

}

    