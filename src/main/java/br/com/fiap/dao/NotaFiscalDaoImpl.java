package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.NotaFiscal;

public class NotaFiscalDaoImpl extends GenericDaoImpl<NotaFiscal, Integer> implements NotaFiscalDao{
	
	public NotaFiscalDaoImpl(EntityManager em) {
		super(em);
	}
	
}
