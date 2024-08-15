package br.com.sp.pedidoDTOS.output;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.sp.UsuarioDTOS.output.OutputUsuarioDTO;
import br.com.sp.pedidoDTOS.auxiliary.MetodoPagamento;

public class OutputPedidoDTO {
	private UUID id;
	private OutputUsuarioDTO usuario;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataHora;
	private String descricao;
	private Float valorTotal;
	private Float valorFrete;
	private Float valorTotalGeral;
	private MetodoPagamento metodoPagamento;
	private Boolean actived;
	private List<OutputPedidoItensDTO> itens = new ArrayList<>();
	
	public OutputPedidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public OutputPedidoDTO(OutputUsuarioDTO usuario, LocalDateTime dataHora, String descricao, Float valorTotal,
			Float valorFrete, Float valorTotalGeral, MetodoPagamento metodoPagamento, Boolean actived) {
		super();
		this.usuario = usuario;
		this.dataHora = dataHora;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.valorFrete = valorFrete;
		this.valorTotalGeral = valorTotalGeral;
		this.metodoPagamento = metodoPagamento;
		this.actived = actived;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public OutputUsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(OutputUsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
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

	public Boolean getActived() {
		return actived;
	}

	public void setActived(Boolean actived) {
		this.actived = actived;
	}

	public List<OutputPedidoItensDTO> getItens() {
		return itens;
	}

	public void setItens(List<OutputPedidoItensDTO> itens) {
		this.itens = itens;
	}
	
}
