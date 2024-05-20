package br.com.dinahborges.escalasonoplastia.operador.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Operador {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idOperador", updatable = false, unique = true, nullable = false)
	private UUID idOperador;
	@NotNull
	private LocalDate data;
	@NotNull
	private String diaDaSemana;
	private String primeiroNome;

	private LocalDateTime dataHoraDoCadatro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	
	public Operador(OperadorRequest operadorRequest) {
		this.data = operadorRequest.getData();
		this.diaDaSemana = operadorRequest.getDiaDaSemana();
		this.primeiroNome =  operadorRequest.getPrimeiroNome();
		this.dataHoraDoCadatro = LocalDateTime.now();
	}
	
	

}
