package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bd.Conexao;
import model.Categorias;

public class CategoriaDAO {

	public void salvar(Categorias categoria) throws SQLException {

		String sqlSalvar = "insert into categorias (nome, descricao, ativo) values "
				+ "(?, ?, true)";

		try (
				Connection conexao = Conexao.obterConexao();
				PreparedStatement comando = conexao.prepareStatement(sqlSalvar)) {

			comando.setString(1, categoria.getNome());
			comando.setString(2, categoria.getDescricao());
			comando.executeUpdate();

		}
	}

	public void alterar(Categorias categoria) throws SQLException {
		String sqlAlterar = "update categorias set nome = ?, descricao = ?, "
				+ "ativo = ? where id = ?";

		try (
				Connection conexao = Conexao.obterConexao();
				PreparedStatement comando = conexao.prepareStatement(sqlAlterar)) {

			comando.setString(1, categoria.getNome());
			comando.setString(2, categoria.getDescricao());
			comando.setBoolean(3, categoria.isAtivo());
			comando.setInt(4, categoria.getId());

			comando.executeUpdate();
		}

	}

	public void inativar(int id) throws SQLException {
		String sqlInativar = "update categorias set ativo = false where id = ?";

		try (
				Connection conexao = Conexao.obterConexao();
				PreparedStatement comando = conexao.prepareStatement(sqlInativar)) {

			comando.setInt(1, id);
			comando.executeUpdate();

		}

	}

	public Categorias localizarCategoria(int id) throws SQLException {
		String sqlLocalizar = "select * from categorias where id = ?";
		Categorias categoria = new Categorias();
		try (
				Connection conexao = Conexao.obterConexao(),
				PreparedStatement comando=conexao.prepareStatement(sqlLocalizar)){

			comando.setInt(1, id);

			ResultSet resultado = comando.executeQuery();

			while (resultado.next()) {
				categoria.setId(resultado.getInt("id"));
				categoria.setNome(resultado.getString("nome"));
				categoria.setDescricao(resultado.getString("descricao"));
				categoria.setAtivo(resultado.getBoolean("ativo"));
			}
		}
		return categoria;
	}

	public List<Categorias> listarCategorias() throws SQLException {
		List<Categorias> lista = new ArrayList<>();

		String sqlLista = "select id, nome, descricao from categorias where ativo = true order by nome";

		try (Connection conexao = Conexao.obterConexao();
			 PreparedStatement comando = conexao.prepareStatement(sqlLista);
			 ResultSet resultado = comando.executeQuery()) {
			while (resultado.next()) {
				Categorias cat = new Categorias();
				cat.setId(resultado.getInt(0));
				cat.setNome(resultado.getString("nome"));
				cat.setDescricao(resultado.getString("descricao"));
				lista.add(cat);
			}


		}
		return lista;
	}
}
