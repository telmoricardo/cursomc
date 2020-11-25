package com.telmoricardo.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telmoricardo.cursomc.domain.Pedido;
import com.telmoricardo.cursomc.repositories.PedidoRepository;
import com.telmoricardo.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository PedidoRepository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = PedidoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado! Id: " + id + ", Tipo " + Pedido.class.getName())); 
	}

}
