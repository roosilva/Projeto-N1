
package br.edu.ifms.frameworks.bootdrive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.frameworks.bootdrive.model.Carro;
import br.edu.ifms.frameworks.bootdrive.model.Multa;
import br.edu.ifms.frameworks.bootdrive.repository.Carros;
import br.edu.ifms.frameworks.bootdrive.repository.Multas;

@Service
public class MultaService {

    @Autowired
    private Multas multas;

    @Autowired
    private Carros carros;

    public List<Multa> buscarTodos() {
        return multas.findAll();
    }

    public void salvar(Multa multa, String placa) {
        Carro carro = carros.findByPlaca(placa);

        if (carro == null) {
            throw new IllegalArgumentException("Carro não encontrado!");
        }

        multa.setCarro(carro);
        multas.save(multa);
    }
}
