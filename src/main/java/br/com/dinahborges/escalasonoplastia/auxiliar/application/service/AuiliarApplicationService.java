package br.com.dinahborges.escalasonoplastia.auxiliar.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.dinahborges.escalasonoplastia.auxiliar.application.api.AuxiliarRequest;
import br.com.dinahborges.escalasonoplastia.auxiliar.application.api.AuxiliarResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AuiliarApplicationService implements AuxiliarService {

	@Override
	public AuxiliarResponse criaAuxilar(UUID idOperador, @Valid AuxiliarRequest auxiliarRequest) {
		log.info("[inicia] AuiliarApplicationService - criaAuxilar");
		log.info("[finaliza] AuiliarApplicationService - criaAuxilar");
		return null;
	}

}
