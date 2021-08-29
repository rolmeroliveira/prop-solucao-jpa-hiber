package br.com.zup.estudo.dao;

import br.com.zup.estudo.model.Aluno;

import br.com.zup.estudo.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class AlunoDao {
    public Aluno criaAluno() {
        Aluno aluno = new Aluno("Juca", "juca@email.con", 10);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
        emf.close();
        return aluno;
    }

    public Aluno retornaAluno(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
        EntityManager em = emf.createEntityManager();
        Aluno aluno = em.find(Aluno.class, id);
        em.close();
        emf.close();
        return aluno;
    }

    public List<Aluno> retornaLista() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefa");
        EntityManager em = emf.createEntityManager();
        String Jpql = "SELECT a FROM Aluno a";
        List<Aluno> alunos = em.createQuery(Jpql).getResultList();
        em.close();
        emf.close();
        return alunos;
    }


}
