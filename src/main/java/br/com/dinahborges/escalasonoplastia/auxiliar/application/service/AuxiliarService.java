package br.com.dinahborges.escalasonoplastia.auxiliar.application.service;

import java.util.UUID;

import br.com.dinahborges.escalasonoplastia.auxiliar.application.api.AuxiliarRequest;
import br.com.dinahborges.escalasonoplastia.auxiliar.application.api.AuxiliarResponse;
import jakarta.validation.Valid;

public interface AuxiliarService {
	AuxiliarResponse criaAuxilar(UUID idOperador, @Valid AuxiliarRequest auxiliarRequest);

}
