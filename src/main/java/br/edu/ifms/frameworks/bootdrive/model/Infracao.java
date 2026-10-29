package br.edu.ifms.frameworks.bootdrive.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Infracao implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Integer pontos;
    private Double valor;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPontos() {
        return pontos;
    }
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}