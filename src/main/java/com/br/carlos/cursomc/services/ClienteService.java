package com.br.carlos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.carlos.cursomc.domain.Cliente;
import com.br.carlos.cursomc.repositories.ClienteRepository;
import com.br.carlos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		 Optional<Cliente> obj = clienteRepository.findById(id);
		 return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto  não encontrado! Id: "+id+", Tipo: "+
		 Cliente.class.getName()));
	}
	
	
}
