package br.com.zup.estudo.dao;

import br.com.zup.estudo.model.Aluno;
import br.com.zup.estudo.model.Avaliacao;
import br.com.zup.estudo.model.Resposta;

import javax.persistence.*;
import java.util.List;

public class GeralDao {

    public List<Resposta> retornaListaRespostaDoAluno() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT r FROM Aluno a LEFT JOIN Resposta r  ON r.aluno = a WHERE r.aluno.id = :pAluno";


        TypedQuery<Resposta> tq = em.createQuery(jpql, Resposta.class).setParameter("pAluno", 1);
        List<Resposta> retorno  = tq.getResultList();
        em.close();
        emf.close();
        return retorno;
    }

    public List<Aluno> retornaListaAlunoPelaCorrecao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT a FROM Correcao c LEFT JOIN Resposta r ON c.resposta = r LEFT JOIN  Aluno a ON r.aluno = a  WHERE c.id = :pCorrecao";

        TypedQuery<Aluno> tq = em.createQuery(jpql, Aluno.class).setParameter("pCorrecao", 1);
        List<Aluno> retorno  = tq.getResultList();
        em.close();
        emf.close();
        return retorno;
    }

}
