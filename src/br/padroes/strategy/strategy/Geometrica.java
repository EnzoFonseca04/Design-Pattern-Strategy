package br.padroes.strategy.strategy;

import java.lang.Math;

public class Geometrica implements MediaStrategy {

    @Override
    public double calcularMedia(double p1, double p2) {
        // Fórmula: √(p1 × p2)
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        // Critério: média ≥ 7.0
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}