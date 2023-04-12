package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_NOTA_FISCAL")
@SequenceGenerator(name="notaFiscal", sequenceName = "SQ_TB_NOTA_FISCAL", allocationSize = 1)
public class NotaFiscal {
		
	@Id
	@Column(name="cd_nota")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notaFiscal")
	private Integer codigo;
		
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nota")
	private Calendar dataNota;
		
	@Column(name="vl_nota", precision = 10)
	private Float valor;
		
	@Column(name="cd_pedido", precision = 5)
	private int numeroPedido;
	
	@OneToOne
	@JoinColumn(name="cd_pedido")
	private Pedido pedido;
	
	public NotaFiscal() {}
	
	public NotaFiscal(Calendar dataNota, Float valor) {
		this.dataNota = dataNota;
		this.valor = valor;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataNota() {
		return dataNota;
	}

	public void setDataNota(Calendar dataNota) {
		this.dataNota = dataNota;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public int getNumeroCliente() {
		return numeroPedido;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroPedido = numeroCliente;
	}
	
	
}
