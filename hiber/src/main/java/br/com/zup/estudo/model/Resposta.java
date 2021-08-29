package br.com.zup.estudo.model;

import javax.persistence.*;
import br.com.zup.estudo.model.Avaliacao;
@Entity
@Table(name="respostas")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_aluno")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name="id_avaliacao")
    private Avaliacao avaliacao;
    @Column(name = "texto_resposta")
    private String textoResposta;

    public Resposta() {
    }

    public Resposta( Aluno aluno, Avaliacao avaliacao,  String textoResposta) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
        this.textoResposta =  textoResposta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTextoResposta() {
        return textoResposta;
    }

    public void setTextoResposta(String textoResposta) {
        this.textoResposta = textoResposta;
    }

    @Override
    public String toString() {
        return "||| RESPOSTA => " +
                " id: " + this.id +
                " Solucao: " + this.textoResposta +
                " Aluno: " + this.aluno.toString() +
                " Avaliacao: " + this.avaliacao.toString() ;
    }
}
