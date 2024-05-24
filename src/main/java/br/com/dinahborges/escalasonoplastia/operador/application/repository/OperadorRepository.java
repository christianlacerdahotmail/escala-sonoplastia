package br.com.dinahborges.escalasonoplastia.operador.application.repository;

import java.util.List;

import br.com.dinahborges.escalasonoplastia.operador.domain.Operador;

public interface OperadorRepository {
	Operador salva(Operador operador);
	List<Operador> buscaTodosOperadores();
}
