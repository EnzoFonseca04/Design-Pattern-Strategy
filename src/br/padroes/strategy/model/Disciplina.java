package br.padroes.strategy.model;

import br.padroes.strategy.strategy.MediaStrategy;

/**
 * Classe que representa uma disciplina e usa Strategy para calcular média
 */
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;

    /**
     * Construtor que recebe a estratégia de cálculo (Injeção da Estratégia)
     */
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Calcula a média usando a estratégia injetada
     */
    public void calcularMedia() {
        // 1. Calcula a média usando a estratégia atual
        this.media = this.estrategia.calcularMedia(this.p1, this.p2);

        // 2. Verifica a situação usando a estratégia atual
        this.situacao = this.estrategia.verificarSituacao(this.media);
    }

    // Implementação dos getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getP1() { return p1; }
    public void setP1(double p1) { this.p1 = p1; }

    public double getP2() { return p2; }
    public void setP2(double p2) { this.p2 = p2; }

    public double getMedia() { return media; }

    public String getSituacao() { return situacao; }

    // Opcional: permite mudar a estratégia em tempo de execução
    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}