package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PEDIDO")
@SequenceGenerator(name="pedido", sequenceName = "SQ_TB_PEDIDO", allocationSize = 1)
public class Pedido {
	
	@Id
	@Column(name="cd_pedido")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
	private Integer codigo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_pedido")
	private Calendar dataPedido;
	
	public NotaFiscal getNota() {
		return nota;
	}

	public void setNota(NotaFiscal nota) {
		this.nota = nota;
	}

	@Column(name="vl_pedido", precision = 10)
	private Float valor;
	
	@Column(name="cd_cliente", precision = 10)
	private int numeroCliente;
	
	@OneToOne(mappedBy = "pedido")
	private NotaFiscal nota;
	
	public Pedido() {}

	public Pedido(Calendar dataPedido, Float valor) {
		this.dataPedido = dataPedido;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	
	
}
