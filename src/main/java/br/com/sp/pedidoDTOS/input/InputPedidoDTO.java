package br.com.sp.pedidoDTOS.input;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.sp.pedidoDTOS.auxiliary.MetodoPagamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InputPedidoDTO {
	
	@NotNull(message = "ID do Usuário não pode ser nulo")
	private UUID userID;
	@NotBlank(message = "Descrição não pode ser vazia ou nula")
	private String descricao;
	@NotNull(message = "Valor do Frete não pode ser nulo")
	private Float valorFrete;
	@NotNull(message = "Método de Pagamento não pode ser nulo")
	private MetodoPagamento metodoPagamento;
	@NotNull(message = "Todo pedido deve conter os seus respectivos itens para sua compra")
	private List<InputPedidoItensDTO> itens = new ArrayList<>();
	
	public InputPedidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public InputPedidoDTO(UUID userID, String descricao, Float valorFrete, MetodoPagamento metodoPagamento, List<InputPedidoItensDTO> itens) {
		super();
		this.userID = userID;
		this.descricao = descricao;
		this.valorFrete = valorFrete;
		this.metodoPagamento = metodoPagamento;
		this.itens = itens;
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


	public Float getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Float valorFrete) {
		this.valorFrete = valorFrete;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public List<InputPedidoItensDTO> getItens() {
		return itens;
	}

	public void setItens(List<InputPedidoItensDTO> itens) {
		this.itens = itens;
	}
	
}
