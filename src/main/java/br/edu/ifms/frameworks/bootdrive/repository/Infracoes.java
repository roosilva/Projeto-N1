package br.edu.ifms.frameworks.bootdrive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.frameworks.bootdrive.model.Infracao;

public interface Infracoes extends JpaRepository<Infracao, Long> {

}