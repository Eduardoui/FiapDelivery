package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setStatus(status);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getStatus() {
        return this.status;
    }
}