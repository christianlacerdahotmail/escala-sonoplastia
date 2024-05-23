package br.com.dinahborges.escalasonoplastia.operador.application.service;

import java.util.List;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorListResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorResponse;

public interface OperadorService {
	OperadorResponse criaOperador(OperadorRequest operadorRequest);
	List<OperadorListResponse> buscaTodosOperadores();

}
