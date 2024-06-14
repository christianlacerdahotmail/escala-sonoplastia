package br.com.dinahborges.escalasonoplastia.operador.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorDetalhadoResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorListResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorRequest;
import br.com.dinahborges.escalasonoplastia.operador.application.api.OperadorResponse;
import br.com.dinahborges.escalasonoplastia.operador.application.repository.OperadorRepository;
import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class OperadorApplicationService implements OperadorService {
	private final OperadorRepository operadorRepository;

	@Override
	public OperadorResponse criaOperador(OperadorRequest operadorRequest) {
		log.info("[inicia] OperadorApplicationService - criaOperador");
		Operador operador = operadorRepository.salva(new Operador(operadorRequest));
		log.info("[finaliza] OperadorApplicationService - criaOperador");
		return OperadorResponse.builder()
				.idOperador(operador.getIdOperador())
				.build();
	}

	@Override
	public List<OperadorListResponse> buscaTodosOperadores() {
		log.info("[inicia] OperadorApplicationService - buscaTodosOperadores");
		List<Operador> operadores = operadorRepository.buscaTodosOperadores();
		log.info("[finaliza] OperadorApplicationService - buscaTodosOperadores");
		return OperadorListResponse.converte(operadores);
	}

	@Override
	public OperadorDetalhadoResponse buscaOperadorAtravesId(UUID idOperador) {
		log.info("[inicia] OperadorApplicationService - buscaOperadorAtravesId");
		Operador operador =  operadorRepository.buscaOperadorAtravesId(idOperador);
		log.info("[finaliza] OperadorApplicationService - buscaOperadorAtravesId");
		return new OperadorDetalhadoResponse(operador);
	}

	@Override
	public void deletaOperadorAtravesId(UUID idOperador) {
		log.info("[inicia] OperadorApplicationService - deletaOperadorAtravesId");
		Operador operador =  operadorRepository.buscaOperadorAtravesId(idOperador);
		log.info("[finaliza] OperadorApplicationService - deletaOperadorAtravesId");
		
	}

}
