package br.com.dinahborges.escalasonoplastia.auxiliar.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.dinahborges.escalasonoplastia.auxiliar.application.service.AuxiliarService;
import br.com.dinahborges.escalasonoplastia.auxiliar.domain.Auxiliar;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AuxiliarController implements AuxiliarAPI {
	private final AuxiliarService auxiliarService;
		
	@Override
	public AuxiliarResponse postAuxiliar(UUID idOperador, @Valid AuxiliarRequest auxiliarRequest) {
		log.info("[inicia] AuxiliarController - postAuxiliar");
		log.info("[idOperador] {}", idOperador);
		AuxiliarResponse auxiliar = auxiliarService.criaAuxilar(idOperador,auxiliarRequest);
		log.info("[finaliza] AuxiliarController - postAuxiliar");
		return auxiliar;
	}

}
