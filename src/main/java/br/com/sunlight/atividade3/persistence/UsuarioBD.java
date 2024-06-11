package br.com.sunlight.atividade3.persistence;
import jakarta.persistence.EntityManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável por manipular os dados do usuário no banco de dados MySQL.
 */
public class UsuarioBD 
{
    /**
    * Realiza a operação de cadastrar um novo usuário no banco de dados.
    * 
    * @param u O objeto Usuário a ser cadastrado.
    * @return true se o usuário foi cadastrado com sucesso, false caso contrário.
    * @throws SQLException se ocorrer um erro durante a execução da operação SQL.
    */
    public static boolean cadastrarUsuario(Usuario u) throws SQLException 
    { 
        EntityManager em = JPAUtil.getEntityManager();
        try 
        {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
            return true;
        }
        catch(Exception e)
        {
            em.getTransaction().rollback();
            throw e;
        }
    }
    
    /**
    * Realiza a operação de validar o login do usuário, a partir do login e senha.
    * 
    * @param usuario O objeto usuário a ser validado.
    * @return true se o usuário foi validado com sucesso, false caso contrário.
    */
    public static Usuario validarUsuarioSeguro(Usuario usuario)
    {
        // Criando consulta parametrizada
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuarioEncontrado = null;
        
        try 
        {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://root@localhost/atividade3","root","1234");
            PreparedStatement statement = conexao.prepareStatement(sql);

            // Atribuindo os valores na consulta
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) 
            {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setConfirmeSenha(rs.getString("confirmeSenha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

    /**
    * Verifica se o login já existe dentro do banco de dados.
    * 
    * @param login O objeto login a ser verificado.
    * @return true se o login foi validado com sucesso, false caso contrário.
    */
    public static boolean loginJaExiste(String login) 
    {
        String query = "SELECT COUNT(*) FROM usuario WHERE Login = ?";
        
        try 
        {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://root@localhost/atividade3","root","1234");
            PreparedStatement stmt = conexao.prepareStatement(query);

            // Atribuindo os valores na consulta
            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();

        if (rs.next()) 
        {
            int count = rs.getInt(1);
            return count > 0;
        }
        conexao.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return false; 
    }    
}
