package br.com.sp.pedidoDTOS.input;

import java.util.UUID;

import br.com.sp.pedidoDTOS.auxiliary.MetodoPagamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InputPedidoDTO {
	
	@NotNull(message = "ID do Usuário não pode ser nulo")
	private UUID userID;
	@NotBlank(message = "Descrição não pode ser vazia ou nula")
	private String descricao;
	@NotNull(message = "Valor Total do Pedido não pode ser nulo")
	private Float valorTotal;
	@NotNull(message = "Valor do Frete não pode ser nulo")
	private Float valorFrete;
	@NotNull(message = "Valor Total Geral não pode ser nulo")
	private Float valorTotalGeral;
	@NotNull(message = "Método de Pagamento não pode ser nulo")
	private MetodoPagamento metodoPagamento;
	
	public InputPedidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public InputPedidoDTO(UUID userID, String descricao, Float valorTotal, Float valorFrete, Float valorTotalGeral, MetodoPagamento metodoPagamento) {
		super();
		this.userID = userID;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.valorFrete = valorFrete;
		this.valorTotalGeral = valorTotalGeral;
		this.metodoPagamento = metodoPagamento;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Float getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Float valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Float getValorTotalGeral() {
		return valorTotalGeral;
	}

	public void setValorTotalGeral(Float valorTotalGeral) {
		this.valorTotalGeral = valorTotalGeral;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	
}
