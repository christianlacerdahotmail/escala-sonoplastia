package br.com.dinahborges.escalasonoplastia.operador.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.dinahborges.escalasonoplastia.handler.APIException;
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

	@Override
	public List<Operador> buscaTodosOperadores() {
		log.info("[inicia] OperadorInfraRepository - buscaTodosOperadores");
		List<Operador> todosOperadores = operadorSpringDataJPARepository.findAll();
		log.info("[finaliza] OperadorInfraRepository - buscaTodosOperadores");
		return todosOperadores;
	}

	@Override
	public Operador buscaOperadorAtravesId(UUID idOperador) {
		log.info("[inicia] OperadorInfraRepository - buscaOperadorAtravesId");
		Operador operador = operadorSpringDataJPARepository.findByIdOperador(idOperador)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Operador não encontrado!"));
		log.info("[finaliza] OperadorInfraRepository - buscaOperadorAtravesId");
		return operador;
	}

	@Override
	public void deletaOperador(Operador operador) {
		log.info("[inicia] OperadorInfraRepository - deletaOperadorAtravesId");
		operadorSpringDataJPARepository.delete(operador);
		log.info("[finaliza] OperadorInfraRepository - deletaOperadorAtravesId");
	}

}
