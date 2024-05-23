package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.dinahborges.escalasonoplastia.operador.application.service.OperadorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OperadorController implements OperadorAPI {
	private final OperadorService operadorService;

	@Override
	public OperadorResponse postOperador(OperadorRequest operadorRequest) {
		log.info("[inicia] OperadorController - postOperdor");
		OperadorResponse operadorCriado = operadorService.criaOperador(operadorRequest);
		log.info("[finaliza] OperadorController - postOperdor");
		return operadorCriado;
	}

	@Override
	public List<OperadorListResponse> getTodosOperadores() {
		log.info("[inicia] OperadorController - getTodosOperadores");
		log.info("[finaliza] OperadorController - getTodosOperadores");
		return null;
	}

}
