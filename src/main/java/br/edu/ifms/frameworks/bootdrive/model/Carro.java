package br.edu.ifms.frameworks.bootdrive.model;

import java.io.Serializable;

public class Carro implements Serializable {
    private Long id;
    private String placa;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
