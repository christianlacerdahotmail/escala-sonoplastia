package br.com.dinahborges.escalasonoplastia.operador.application.service;

import org.springframework.stereotype.Service;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OperadorApplicationService implements OperadorService {

	@Override
	public OperadorResponse criaOperador(OperadorRequest operadorRequest) {
		log.info("[inicia] OperadorApplicationService - criaOperador");
		log.info("[finaliza] OperadorApplicationService - criaOperador");
		return null;
	}

}
