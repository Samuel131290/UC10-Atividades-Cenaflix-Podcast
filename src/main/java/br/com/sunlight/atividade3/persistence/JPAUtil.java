package br.com.sunlight.atividade3.persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe constante para centralizar o nome da unidade de persistência.
 * Se o nome mudar, precisaremos alterar em um só lugar.
 */
public class JPAUtil 
{
    private static final String PERSISTENCE_UNIT = "FilmesATV";
    private static EntityManager em;
    private static EntityManagerFactory sunlight;

    /**
    * Retorna a instância do EntityManager. Se a instância estiver nula, cria uma nova e a retorna.
    *
    * @return A instância do EntityManager.
    */
    public static EntityManager getEntityManager()
    {
        if(sunlight == null || !sunlight.isOpen())
            sunlight = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        
        if(em == null || !em.isOpen()) //Cria se em nulo ou se o entity manager foi fechado
            em =sunlight.createEntityManager();
        
        return em;
    }
    
    /**
    * Retorna a instância do EntityManager. Fecha o EntityManager e o factory.
    *
    * 
    */
    public static void closeEntityManager()
    {
        if(em.isOpen() && em != null)
        {
            em.close();
            sunlight.close();
        }
    }
}    
