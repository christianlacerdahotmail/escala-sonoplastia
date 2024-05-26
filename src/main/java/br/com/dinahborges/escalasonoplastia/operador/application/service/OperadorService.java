package br.com.dinahborges.escalasonoplastia.operador.application.service;

import java.util.List;
import java.util.UUID;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorDetalhadoResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorListResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorResponse;

public interface OperadorService {
	OperadorResponse criaOperador(OperadorRequest operadorRequest);
	List<OperadorListResponse> buscaTodosOperadores();
	OperadorDetalhadoResponse buscaOperadorAtravesId(UUID idOperador);

}
