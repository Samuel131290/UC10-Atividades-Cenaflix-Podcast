package br.com.sunlight.atividade3.persistence;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe que representa um Listagem.
 */
@Entity
public class Listagem 
{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int Id;
    private String Produtor;
    private String NomeEpisodio;
    private int NºEpisodio;
    private String duraçao;
    private String url_repo;
  
    /**
    * Obtém o ID do podcast.
    * 
    * @return O ID do podcast.
    */
    public int getId() 
    {
        return Id;
    }
  
    /**
    * Define o ID do podcast.
    * 
    * @param Id O ID do podcast.
    */
    public void setId(int Id) 
    {
        this.Id = Id;
    }
  
    /**
    * Obtém o nome do Produtor do podcast.
    * 
    * @return O Produtor do podcast.
    */
    public String getProdutor() 
    {
          return Produtor;
    }
    
    /**
    * Define o Produtor do podcast.
    * 
    * @param Produtor O Produtor do podcast.
    */
    public void setProdutor(String Produtor) 
    {
        this.Produtor = Produtor;
    }

    /**
    * Obtém o nome do episódio do podcast.
    * 
    * @return O nome do episódio do podcast.
    */
    public String getNomeEpisodio() 
    {
        return NomeEpisodio;
    }
    
    /**
    * Define o nome do episódio do podcast.
    * 
    * @param NomeEpisodio O nome do episódio do podcast.
    */
    public void setNomeEpisodio(String NomeEpisodio) 
    {
        this.NomeEpisodio = NomeEpisodio;
    }
  
    /**
    * Obtém o número do episódio do podcast.
    * 
    * @return O número do episódio do podcast.
    */
    public int getNºEpisodio() 
    {
        return NºEpisodio;
    }
  
    /**
    * Define o número do episódio do podcast.
    * 
    * @param NºEpisodio O número do episódio do podcast.
    */
    public void setNºEpisodio(int NºEpisodio)
    {
        this.NºEpisodio = NºEpisodio;
    }
    
    /**
    * Obtém a duração do podcast.
    * 
    * @return A duração do episódio do podcast.
    */    
    public String getDuracao() 
    {
        return duraçao;
    }
  
    /**
    * Define a duração do podcast.
    * 
    * @param duraçao A duração do podcast.
    */
    public void setDuracao(String duraçao)
    {
        this.duraçao = duraçao;
    }
    
    /**
    * Obtém a URL do podcast.
    * 
    * @return A URL do podcast.
    */
    public String getURL_Repo() 
    {
        return url_repo;
    }
  
    /**
    * Define a URL do podcast.
    * 
    * @param url_repo A URL do podcast.
    */
    public void setURL_Repo(String url_repo)
    {
        this.url_repo = url_repo;
    }
}
