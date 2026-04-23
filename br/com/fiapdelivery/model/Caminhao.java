package br.com.fiapdelivery.model;

public class Caminhao {

    private String placa;
    private String capacidade;
    private String eixos;

    public Caminhao(String placa, String capacidade, String eixos) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
        this.setEixos(eixos);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setEixos(String eixos) {
        this.eixos = eixos;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getCapacidade() {
        return this.capacidade;
    }

    public String getEixos() {
        return this.eixos;
    }
}