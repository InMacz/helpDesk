package model;

import java.sql.Date;

public class Solicitacoes {

	private int id;
	private String titulo;
	private String descricao;
	private String local_ocorrencia;
	private String prioridade;
	private String status;
	private Date data_abertura;
	private Date data_fechamento;
	private int usuario_id;
	private int tecnico_id;
	private int categoria_id;
	
	public Solicitacoes(int id, String titulo, String descricao, String local_ocorrencia, String prioridade,
			String status, Date data_abertura, Date data_fechamento, int usuario_id, int tecnico_id, int categoria_id) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.local_ocorrencia = local_ocorrencia;
		this.prioridade = prioridade;
		this.status = status;
		this.data_abertura = data_abertura;
		this.data_fechamento = data_fechamento;
		this.usuario_id = usuario_id;
		this.tecnico_id = tecnico_id;
		this.categoria_id = categoria_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal_ocorrencia() {
		return local_ocorrencia;
	}

	public void setLocal_ocorrencia(String local_ocorrencia) {
		this.local_ocorrencia = local_ocorrencia;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public Date getData_fechamento() {
		return data_fechamento;
	}

	public void setData_fechamento(Date data_fechamento) {
		this.data_fechamento = data_fechamento;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public int getTecnico_id() {
		return tecnico_id;
	}

	public void setTecnico_id(int tecnico_id) {
		this.tecnico_id = tecnico_id;
	}

	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
	
	
}
