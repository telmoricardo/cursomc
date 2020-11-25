package com.telmoricardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telmoricardo.cursomc.domain.ItemPedido;
import com.telmoricardo.cursomc.domain.Pagamento;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{}
