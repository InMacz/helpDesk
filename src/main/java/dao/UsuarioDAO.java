package dao;

public class UsuarioDAO {

    public Usuario logar(String email, String senha) throws SQLException{
        String sql = "select id, nome, email, senha from usuarios " + "where email = ? and senha = ? and ativo = true";

        try(Connection conexao = Conexao.obterConexao());
            PreparedStatement logar = conexao.preparedStatement();
            logar.setString(1, email);
            logar.setString(2, senha);

            try(ResultSet resultado = logar.executeQuery()){
                if(resultado.next()){
                    Usuario usu = new Usuario();
                    usu.setId(resultado.getInt("id"));
                    usu.setNome(resultado.getString("nome"));
                    usu.setEmail(resultado.getString("email"));
                    usu.setPerfil(resultado.getString("perfil"));

                    return usu;
                }
            }
    }
}
