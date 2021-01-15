package br.com.eponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eponto.model.JornadaTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
