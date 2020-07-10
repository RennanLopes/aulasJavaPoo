package Aula04;

public class ContaBanco {
    // Atributos
    public Integer numConta;
    protected String tipoConta;
    private String dono;
    private Float saldo;
    private boolean status;

    // Metodo para mostrar o estado atual
    public void estadoAtual() {
        System.out.println("------------------");
        System.out.println("Conta " + getNumConta());
        System.out.println("Tipo " + getTipoConta());
        System.out.println("Dono " + getDono());
        System.out.println("Saldo " + getSaldo());
        System.out.println("Status " + getStatus());
    }

    // Métodos
    public void abrirConta(String tipo) {
        this.setTipoConta(tipo);
        this.setStatus(true);
        if (tipo == "Conta Corrente") {
            this.setSaldo(50f);
        } else if (tipo == "Conta Poupança") {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta ainda não pode ser fechada pois tem depito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");

        }
    }

    public void depositar(float valor) {
        if (this.setStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito relizado com sucesso!");
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensalidade() {
        int valor = 0;
        if (this.getTipoConta() == "Conta Corrente") {
            valor = 12;
        } else if (this.getTipoConta() == "Conta Poupança") {
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    // Métodos Construtor
    public void ContaBanco() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }

    // Get e Set

    public Integer getNumConta() {
        return this.numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean setStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}