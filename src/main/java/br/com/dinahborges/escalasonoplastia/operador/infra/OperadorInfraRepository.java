package br.com.dinahborges.escalasonoplastia.operador.infra;

import org.springframework.stereotype.Repository;

import br.com.dinahborges.escalasonoplastia.operador.application.repository.OperadorRepository;
import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class OperadorInfraRepository implements OperadorRepository {

	private final OperadorSpringDataJPARepository operadorSpringDataJPARepository;

	@Override
	public Operador salva(Operador operador) {
		log.info("[inicia] OperadorInfraRepository - salva");
		operadorSpringDataJPARepository.save(operador);
		log.info("[finaliza] OperadorInfraRepository - salva");
		return operador;
	}

}
