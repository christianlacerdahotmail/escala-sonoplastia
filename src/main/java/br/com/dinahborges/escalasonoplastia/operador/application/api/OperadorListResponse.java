package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.List;
import java.util.UUID;

import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;

public class OperadorListResponse {
	private UUID idOperador;
	private String primeiroNome;
	
	public static List<OperadorListResponse> converte(List<Operador> operadores) {
		return null;
	}

}
