package br.com.dinahborges.escalasonoplastia.operador.application.service;

import org.springframework.stereotype.Service;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.repository.OperadorRepository;
import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class OperadorApplicationService implements OperadorService {
	private final OperadorRepository operadorRepository;

	@Override
	public OperadorResponse criaOperador(OperadorRequest operadorRequest) {
		log.info("[inicia] OperadorApplicationService - criaOperador");
		Operador operador = operadorRepository.salva(new Operador(operadorRequest));
		log.info("[finaliza] OperadorApplicationService - criaOperador");
		return OperadorResponse.builder()
				.idOperador(operador.getIdOperador())
				.build();
	}

}
