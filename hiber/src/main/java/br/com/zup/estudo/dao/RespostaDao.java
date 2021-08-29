package br.com.zup.estudo.dao;



import br.com.zup.estudo.model.Aluno;
import br.com.zup.estudo.model.Avaliacao;
import br.com.zup.estudo.model.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;


public class RespostaDao {

    private LocalDateTime dt = LocalDateTime.now();

        public Resposta criaUm(Aluno aluno, Avaliacao avaliacao) {
            Resposta resposta = new Resposta( aluno, avaliacao, "Uma solucao " + dt);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(resposta);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return resposta;
        }

        public Resposta retornaUm(Integer id) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            Resposta resposta = em.find(Resposta.class, id);
            em.close();
            emf.close();
            return resposta;
        }

        public List<Resposta> retornaLista() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
            EntityManager em = emf.createEntityManager();
            String Jpql = "SELECT rp FROM Resposta rp";
            List<Resposta> respostas   = em.createQuery(Jpql).getResultList();
            em.close();
            emf.close();
            return respostas;
        }


    }
