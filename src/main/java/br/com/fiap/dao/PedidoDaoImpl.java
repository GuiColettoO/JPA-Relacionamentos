package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Pedido;

public class PedidoDaoImpl extends GenericDaoImpl<Pedido, Integer> implements PedidoDao{
	
	public PedidoDaoImpl(EntityManager em) {
		super(em);
	}
}
