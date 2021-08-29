package br.com.zup.estudo.model;

import javax.persistence.*;
import br.com.zup.estudo.model.Resposta;


@Entity
@Table(name="correcoes")
public class Correcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name="id_resposta")
    private Resposta resposta;
    @Column(name="texto_correcao")
    private String textoCorrecao;
    private Integer nota;

    public Correcao() {
    }

    public Correcao(Resposta resposta, String texto_correcao, Integer nota) {
        this.resposta = resposta;
        this.textoCorrecao = texto_correcao;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public br.com.zup.estudo.model.Resposta getResposta() {
        return resposta;
    }

    public void setResposta(br.com.zup.estudo.model.Resposta resposta) {
        resposta = resposta;
    }

    public String getTextoCorrecao() {
        return textoCorrecao;
    }

    public void setTextoCorrecao(String textoCorrecao) {
        this.textoCorrecao = textoCorrecao;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "||| CORRECAO => " +
                " id: " + id +
                " Resposta: " + resposta +
                " texto_correcao: " + textoCorrecao +
                " nota: " + nota ;
    }
}
