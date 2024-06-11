package br.com.sunlight.atividade3.persistence;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe que representa um Usuário.
 */
@Entity
public class Usuario 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String confirmeSenha;
    private String tipo;
    
    /**
    * Obtém o ID do usuário.
    * 
    * @return O ID do usuário.
    */
    public int getId() 
    {
        return id;
    }
    
    /**
    * Define o ID do usuário.
    * 
    * @param id O ID do usuário.
    */
    public void setId(int id) 
    {
        this.id = id;
    }
    
    /**
    * Obtém o nome do usuário.
    * 
    * @return O nome do usuário.
    */
    public String getNome() 
    {
        return nome;
    }
    
    /**
    * Define o nome do usuário.
    * 
    * @param nome O nome do usuário.
    */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    /**
    * Obtém o login do usuário.
    * 
    * @return O login do usuário.
    */
    public String getLogin() 
    {
        return login;
    }
     
    /**
    * Define o login do usuário.
    * 
    * @param login O login do usuário.
    */
    public void setLogin(String login)
    {
        this.login = login;
    }
    
    /**
    * Obtém a senha do usuário.
    * 
    * @return A senha do usuário.
    */
    public String getSenha() 
    {
        return senha;
    }
        
    /**
    * Define a senha do usuário.
    * 
    * @param senha A senha do usuário.
    */
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    /**
    * Obtém a confirmação de senha do usuário.
    * 
    * @return A confirmação de senha do usuário.
    */
    public String getConfirmeSenha() 
    {
        return confirmeSenha;
    }
     
    /**
    * Define a conftimsção de senha do usuário.
    * 
    * @param confirmeSenha A confirmação de senha do usuário.
    */
    public void setConfirmeSenha(String confirmeSenha) 
    {
        this.confirmeSenha = confirmeSenha;
    }
    
    /**
    * Obtém o tipo do usuário
    * 
    * @return O tipo do usuário
    */
    public String getTipo() 
    {
        return tipo;
    }
    
    /**
    * Define o tipo do usuário.
    * 
    * @param tipo O tipo do usuário.
    */
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    } 
}
