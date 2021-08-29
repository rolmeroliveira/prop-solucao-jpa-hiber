package br.com.zup.estudo.dao;



import br.com.zup.estudo.model.Aluno;
import br.com.zup.estudo.model.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;


public class AvaliacaoDao {

    private LocalDateTime dt = LocalDateTime.now();

        public Avaliacao criaUm() {
            Avaliacao avaliacao = new Avaliacao("Titulo de Avaliacao " + dt, "texto de uma tarefa " + dt);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(avaliacao);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return avaliacao;
        }

        public Avaliacao retornaUm(Integer id) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            Avaliacao avaliacao = em.find(Avaliacao.class, id);
            em.close();
            emf.close();
            return avaliacao;
        }

        public List<Avaliacao> retornaLista() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            String Jpql = "SELECT av FROM Avaliacao av";
            List<Avaliacao> avaliacoes   = em.createQuery(Jpql).getResultList();
            em.close();
            emf.close();
            return avaliacoes;
        }


    }
