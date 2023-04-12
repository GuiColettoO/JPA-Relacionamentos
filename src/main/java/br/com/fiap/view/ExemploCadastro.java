package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.NotaFiscalDao;
import br.com.fiap.dao.NotaFiscalDaoImpl;
import br.com.fiap.dao.PedidoDao;
import br.com.fiap.dao.PedidoDaoImpl;
import br.com.fiap.entity.NotaFiscal;
import br.com.fiap.entity.Pedido;
import br.com.fiap.exception.CommitException;
import br.com.fiap.sigleton.EntityManagerFactorySingleton;

public class ExemploCadastro {
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
	
		PedidoDao pedidoDao = new PedidoDaoImpl(em);
		NotaFiscalDao notaFiscalDao = new NotaFiscalDaoImpl(em);
		
		Pedido pedido = new Pedido(Calendar.getInstance(), 65f);
		
		try {
			pedidoDao.salvar(pedido);
			pedidoDao.commit();
			System.out.println("Pedido cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		NotaFiscal nota = new NotaFiscal(Calendar.getInstance(), 65f);
		
		try {
			notaFiscalDao.salvar(nota);
			notaFiscalDao.commit();
			System.out.println("nota cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
	}
}

