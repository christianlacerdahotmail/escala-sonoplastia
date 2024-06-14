package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/operador")
public interface OperadorAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	OperadorResponse postOperador(@Valid @RequestBody OperadorRequest operadorRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<OperadorListResponse> getTodosOperadores();
	
	@GetMapping(value = "/{idOperador}")
	@ResponseStatus(code = HttpStatus.OK)
	OperadorDetalhadoResponse getOperadorAtravesId(@PathVariable UUID idOperador);
	
	@DeleteMapping(value = "/{idOperador}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaOperadorAtravesId(@PathVariable UUID idOperador);
	
	@PatchMapping(value = "/{idOperador}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void  patchAlteracaoOperador(@Valid UUID idOperador, @RequestBody OperadorAlteracaoRequest operadorAlteracaoRequest);

}
