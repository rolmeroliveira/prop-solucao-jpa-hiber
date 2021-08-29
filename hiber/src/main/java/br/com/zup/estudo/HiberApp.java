package br.com.zup.estudo;


import br.com.zup.estudo.dao.GeralDao;
import br.com.zup.estudo.model.Aluno;
import br.com.zup.estudo.model.Avaliacao;
import br.com.zup.estudo.model.Resposta;

import java.util.List;

public class HiberApp {
    public static void main(String[] args) {
//        AlunoDao alunoDao = new AlunoDao();
//        Aluno aluno = alunoDao.retornaAluno(1);
//        System.out.println(aluno.toString());

//        AlunoDao alunoDao = new AlunoDao();
//        List<Aluno> alunos = alunoDao.retornaLista();
//        alunos.forEach(a-> System.out.println(a.toString()));


//        AvaliacaoDao avaliacaoDao = new AvaliacaoDao();
//        List<Avaliacao> avaliacoes = avaliacaoDao.retornaLista();
//        avaliacoes.forEach(a-> System.out.println(a.toString()));

//        RespostaDao respostaDao = new RespostaDao();
//        List<Resposta> respostas = respostaDao.retornaLista();
//        respostas.forEach(a-> System.out.println(a.toString()));

//        CorrecaoDao correcaoDao = new CorrecaoDao();
//        List<Correcao> correcoes = correcaoDao.retornaLista();
//        correcoes.forEach(a-> System.out.println(a.toString()));

        //RETORNAR UM ALUNO A PARTIR DE UMA CORREÇÃO FEITA POR ELE - QUESTÃO 9
//            GeralDao geralDao = new GeralDao();
//            List<Resposta> lista = geralDao.retornaListaRespostaDoAluno();
//            lista.forEach(l-> System.out.println(l));


        //RETORNAR AS RESPOSTAS DE UM ALUNO - QUESTÃO 10
            GeralDao geralDao = new GeralDao();
            List<Aluno> lista = geralDao.retornaListaAlunoPelaCorrecao();
            lista.forEach(l-> System.out.println(l));





    }
}
