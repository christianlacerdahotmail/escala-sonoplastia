package br.com.dinahborges.escalasonoplastia.operador.application.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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

}
