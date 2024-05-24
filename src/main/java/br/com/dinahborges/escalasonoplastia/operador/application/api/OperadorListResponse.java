package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;
import lombok.Value;

@Value
public class OperadorListResponse {
	private UUID idOperador;
	private String primeiroNome;
	
	public static List<OperadorListResponse> converte(List<Operador> operadores) {
		return operadores.stream()
				.map(OperadorListResponse::new)
				.collect(Collectors.toList());
	}

	public OperadorListResponse(Operador operador) {
		this.idOperador = operador.getIdOperador();
		this.primeiroNome = operador.getPrimeiroNome();
	}

}
