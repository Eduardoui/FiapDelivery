package br.com.fiapdelivery.model;

public class Moto {

    private String placa;
    private String capacidade;
    private boolean bau;

    public Moto(String placa, String capacidade, boolean bau) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
        this.setBau(bau);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getCapacidade() {
        return this.capacidade;
    }

    public boolean isBau() {
        return this.bau;
    }
}