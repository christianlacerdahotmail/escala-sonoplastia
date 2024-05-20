package br.com.dinahborges.escalasonoplastia.operador.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;

public interface OperadorSpringDataJPARepository extends JpaRepository<Operador, UUID> {

}
