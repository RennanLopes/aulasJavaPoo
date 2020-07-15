package Aula04;

public class aula04ContaBanco {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco();
        cliente1.setNumConta(1111);
        cliente1.setDono("Jubileu");
        cliente1.abrirConta("Conta Corrente");

        ContaBanco cliente2 = new ContaBanco();
        cliente2.setNumConta(2222);
        cliente2.setDono("Jubilina");
        cliente2.abrirConta("Conta Poupança");

        cliente1.depositar(280f);

        cliente2.pagarMensalidade();

        cliente2.depositar(620f);


        cliente1.estadoAtual();
        cliente2.estadoAtual();
    }
}