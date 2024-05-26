package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class OperadorDetalhadoResponse {
	private UUID idOperador;
	private String primeiroNome;
	private LocalDate data;
	private String diaDaSemana;
	private LocalDateTime dataHoraDoCadatro;

}
