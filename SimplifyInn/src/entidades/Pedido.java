/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author lucasnm
 */
public class Pedido {
    
    private int idQuarto;
    private String servico;
    private String observacoes;    
    
    public Pedido(){
        
    }

    public Pedido(int idQuarto, String servico, String OBSERVACOES) {
        this.idQuarto = idQuarto;
        this.servico = servico;
        this.observacoes = OBSERVACOES;
    }

    /**
     * @return the idQuarto
     */
    public int getIdQuarto() {
        return idQuarto;
    }

    /**
     * @param idQuarto the idQuarto to set
     */
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    
    /**
     * @return the servico
     */
    public String getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

    /**
     * @return the observacoes
     */
    public String getOBSERVACOES() {
        return observacoes;
    }

    /**
     * @param OBSERVACOES the observacoes to set
     */
    public void setOBSERVACOES(String OBSERVACOES) {
        this.observacoes = OBSERVACOES;
    }    
}
