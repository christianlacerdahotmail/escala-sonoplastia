package br.com.dinahborges.escalasonoplastia.auxiliar.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

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
public class Auxiliar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idAuxiliar", updatable = false, unique = true, nullable = false)
	private UUID idAuxiliar;
	@NotNull
	private LocalDate data;
	@NotNull
	private String diaDaSemana;
	private String primeiroNome;

	private LocalDateTime dataHoraDoCadatro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
}
