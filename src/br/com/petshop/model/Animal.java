package br.com.petshop.model;

public class Animal {

    private Long id;

    private String nome;

    private String raca;

    private String descricao;

    private String observacao;

    public Animal() {
    }

    public Animal(Long id, String nome, String raca, String descricao, String observacao) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.descricao = descricao;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}