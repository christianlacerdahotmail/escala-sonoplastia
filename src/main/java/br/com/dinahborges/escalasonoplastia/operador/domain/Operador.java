package br.com.dinahborges.escalasonoplastia.operador.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Operador {

	@NotNull
	private LocalDate data;
	@NotNull
	private String diaDaSemana;
	private String primeiroNome;

	private LocalDateTime dataHoraDoCadatro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Operador(@NotNull LocalDate data, @NotNull String diaDaSemana, String primeiroNome) {
		super();
		this.data = data;
		this.diaDaSemana = diaDaSemana;
		this.primeiroNome = primeiroNome;
		this.dataHoraDoCadatro = LocalDateTime.now();
	}
	
	

}
