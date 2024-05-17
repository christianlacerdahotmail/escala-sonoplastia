package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class OperadorRequest {
	@NotNull
	private LocalDate data;
	@NotNull
	private String diaDaSemana;
	private String primeiroNome;
	

}
