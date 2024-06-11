package br.com.sunlight.atividade3.persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável por manipular os dados do podcast no banco de dados MySQL.
 */
public class ListagemDAO 
{
    /**
    * Realiza a operação de cadastrar um novo podcast no banco de dados.
    * 
    * @param l O objeto Podcast a ser cadastrado.
    * @return true se o podcast foi cadastrado com sucesso, false caso contrário.
    * @throws SQLException se ocorrer um erro durante a execução da operação SQL.
    */
    public static boolean cadastrar(Listagem l) throws SQLException 
    { 
       EntityManager em = JPAUtil.getEntityManager();
        try 
        {
            em.getTransaction().begin();
            em.persist(l);
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
    * Realiza a operação de busca dos podcasts no banco de dados MySQL a partir do nome do produtor.
    * 
    * @param Produtor O nome do produtor do podcast a ser encontrado.
    * @return Uma lista de objetos 'Listagem' contendo os dados dos podcasts encontrados, ou uma lista vazia se nenhum for encontrado.
    */
    public List<Listagem> listar(String Produtor)
    {
        EntityManager em = JPAUtil.getEntityManager();
        List produtor = null;
        try
        {
            String textoQuery = "SELECT l FROM Listagem l WHERE (:produtor is null OR l.Produtor LIKE :produtor)";
          
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("produtor", Produtor.isEmpty() ? null : "%" + Produtor + "%" );
            produtor = consulta.getResultList();
        }
        finally
        {
            JPAUtil.closeEntityManager();
        }
        return produtor;
    }
    
    /**
    * Realiza a operação de deletar os dados de um podcast no banco de dados MySQL.
    * 
    * @param id Os dados dos podcast a apartir do ID.
    */
    public void excluir(int id)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try
        {
            Listagem l = em.find(Listagem.class, id);
            if(l != null)
            {
                em.getTransaction().begin();
                em.remove(l);
                em.getTransaction().commit();
            }
        }
        catch(Exception e)
        {
            em.getTransaction().rollback();
            throw e;
        }
        finally
        {
            JPAUtil.closeEntityManager();
        }
    }
}  
