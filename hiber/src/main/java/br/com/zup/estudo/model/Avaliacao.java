package br.com.zup.estudo.model;

import javax.persistence.*;

@Entity
@Table(name="Avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String tarefa;

    public Avaliacao() {
    }

    public Avaliacao(String titulo, String tarefa) {
        this.titulo = titulo;
        this.tarefa = tarefa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public String toString() {
        return "||| AVALIACAO => " +
                " id: " + id +
                " titulo: " + titulo +
                " tarefa: " + tarefa ;
    }
}
