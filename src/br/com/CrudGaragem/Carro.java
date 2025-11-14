package br.com.CrudGaragem;

public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String placa, String modelo, String cor, int ano){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Carro(String placaNova, String modeloNovo, int ano, String cor) {
        this.placa = placaNova;
        this.modelo = modeloNovo;
        this.ano = ano;
        this.cor = cor;
    }


    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Placa: " + placa +
                " | Modelo: " + modelo +
                " | Ano: " + ano +
                " | Cor: " + cor;
    }

}
