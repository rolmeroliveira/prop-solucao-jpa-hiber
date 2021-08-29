package br.com.zup.estudo.dao;



import br.com.zup.estudo.model.Correcao;
import br.com.zup.estudo.model.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;


public class CorrecaoDao {

    private LocalDateTime dt = LocalDateTime.now();

        public Correcao criaUm(Resposta resposta) {
            Correcao correcao = new Correcao(resposta,  "Texto da correcao " + dt,  10);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(correcao);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return correcao;
        }

        public Correcao retornaUm(Integer id) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            Correcao correcao = em.find(Correcao.class, id);
            em.close();
            emf.close();
            return correcao;
        }

        public List<Correcao> retornaLista() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            String Jpql = "SELECT cr FROM Correcao cr";
            List<Correcao> correcaos   = em.createQuery(Jpql).getResultList();
            em.close();
            emf.close();
            return correcaos;
        }


    }
