package br.com.sp.pedidoDTOS.input;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InputPedidoItensDTO {
	@NotBlank(message = "Nome não pode ser vazio ou nulo")
	private String nome;
	@NotBlank(message = "Nome da Empresa não pode ser vazio ou nulo")
	private String nomeEmpresa;
	@NotNull(message = "Valor Unitário não pode ser vazio ou nulo")
	private Float valorUnitario;
	@NotNull(message = "Quantidade de Itens não pode ser vazio ou nulo")
	private Integer quantidade;
	@NotNull(message = " não pode ser vazio ou nulo")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataEntrega;
	
	public InputPedidoItensDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public InputPedidoItensDTO(String nome, String nomeEmpresa, Float valorUnitario, Integer quantidade,
			LocalDate dataEntrega) {
		super();
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.dataEntrega = dataEntrega;
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
