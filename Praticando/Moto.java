package Praticando;

public class Moto {
    private String modelo;
    private String cor;
    private String placa;
    private Float km;
    private Float preco;

    public Moto(String modelo, String cor, String placa, Float km, Float preco) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPlaca(placa);
        this.setKm(km);
        this.setPreco(preco);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Float getKm() {
        return this.km;
    }

    public void setKm(Float km) {
        this.km = km;
    }

    public Float getPreco() {
        return this.preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    void status() {
        System.out.println("Uma moto " + getModelo());
        System.out.println("de cor " + getCor());
        System.out.println("de placa " + getPlaca());
        System.out.println("com " + getKm() + "km's rodados.");
        System.out.println("no valor de R$" + getPreco());
        System.out.println(" ------------------------------------ ");
    }

}

    