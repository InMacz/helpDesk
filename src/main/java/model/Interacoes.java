package model;

import java.sql.Date;



public class Interacoes {
	
	private int id;
	private String mensagem;
	private Date data_interacao;
	private int solicitacao_id;
	private int usuario_id;
	
	public Interacoes(int id, String mensagem, Date data_interacao, int solicitacao_id, int usuario_id) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.data_interacao = data_interacao;
		this.solicitacao_id = solicitacao_id;
		this.usuario_id = usuario_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Date getData_interacao() {
		return data_interacao;
	}

	public void setData_interacao(Date data_interacao) {
		this.data_interacao = data_interacao;
	}

	public int getSolicitacao_id() {
		return solicitacao_id;
	}

	public void setSolicitacao_id(int solicitacao_id) {
		this.solicitacao_id = solicitacao_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	

}
