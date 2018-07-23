package com.ramonfernandes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmo {

    private List<String> resultado = new ArrayList<String>();
    private int[] notasDisponiveis;
    private static int nRecursoes;

    public void setNotasDisponiveis(int[] notas) {
        this.notasDisponiveis = notas;
    }

    public int getNumeroDeCombinacoesPossiveis(int valor) {
        chamaCalculaParaTodasAsNotas(valor, "", notasDisponiveis[0]);
        return resultado.size();
    }

    private void calcula(int valor, int atual, String caminhoAtual) {
        valor -= atual;
        caminhoAtual = caminhoAtual + "-" + atual;
        if (valor == 0) {
            adicionaNaListaDeResultados(caminhoAtual);
            return;
        } else if (valor < 0)
            return;
        else
            chamaCalculaParaTodasAsNotas(valor, caminhoAtual, atual);
    }

    private void adicionaNaListaDeResultados(String caminhoPossivel) {
        nRecursoes++;
        String[] splittedArray = caminhoPossivel.split("-");
        Arrays.sort(splittedArray);
        caminhoPossivel = stringfyArray(splittedArray);
        resultado.add(caminhoPossivel);
    }

    private void chamaCalculaParaTodasAsNotas(int valor, String caminhoAtual, int ultimaNota) {
        for (int nota : notasDisponiveis) {
            if (nota >= ultimaNota)
                calcula(valor, nota, caminhoAtual);
        }
    }

    private String stringfyArray(String[] vetor) {
        String result = "";
        for (String valor : vetor)
            result = result + "-" + valor;
        return result;
    }

    public void printCaminhos() {
        for (Object caminho : resultado.toArray())
            System.out.println(caminho);
    }

    public int getnRecursoes() {
        return nRecursoes;
    }

}
