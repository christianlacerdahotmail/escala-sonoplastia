package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class OperadorResponse {
	private UUID idOperador;
	
}
