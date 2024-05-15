package br.com.dinahborges.escalasonoplastia.operador.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class OperadorController implements OperadorAPI {

	@Override
	public OperadorResponse postOperador(OperadorRequest operadorRequest) {
		log.info("[inicia] OperadorController - postOperdor");
		log.info("[finaliza] OperadorController - postOperdor");
		return null;
	}

}
