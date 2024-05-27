package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;
import lombok.Value;

@Value
public class OperadorDetalhadoResponse {
	private UUID idOperador;
	private String primeiroNome;
	private LocalDate data;
	private String diaDaSemana;
	private LocalDateTime dataHoraDoCadatro;

	public OperadorDetalhadoResponse(Operador operador) {
		this.idOperador = operador.getIdOperador();
		this.primeiroNome = operador.getPrimeiroNome();
		this.data = operador.getData();
		this.diaDaSemana = operador.getDiaDaSemana();
		this.dataHoraDoCadatro = operador.getDataHoraDaUltimaAlteracao();
	}

}
