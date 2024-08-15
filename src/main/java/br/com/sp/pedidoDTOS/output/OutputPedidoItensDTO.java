package br.com.sp.pedidoDTOS.output;

import java.time.LocalDate;
import java.util.UUID;

public class OutputPedidoItensDTO {
	private UUID id;
	private String nome;
	private String nomeEmpresa;
	private Float valorUnitario;
	private Integer quantidade;
	private LocalDate dataEntrega;
	
	public OutputPedidoItensDTO() {
		// TODO Auto-generated constructor stub
	}

	public OutputPedidoItensDTO(String nome, String nomeEmpresa, Float valorUnitario, Integer quantidade,
			LocalDate dataEntrega) {
		super();
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.dataEntrega = dataEntrega;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
