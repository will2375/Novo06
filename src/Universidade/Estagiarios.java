package Universidade;

public class Estagiarios extends Funcionarios {


    private String condicao;
    private double despesas;


    public Estagiarios() {
        this.condicao = condicao;
        this.despesas = despesas;
    }

    public void addEstagiario(){
        this.setNome("Carlos Souza");
        this.setCpf("45439632-8");
        this.setNumRegistro("23456");
        this.setOrgaoLotaçao("SP");
        this.setCondicao("Bolsa");

    }

    public void status(){
        System.out.println("Nome do estagiario: " + getNome());
        System.out.println("CPF do estagiario: " + getCpf());
        System.out.println("Registro do estagiario: " + getNumRegistro());
        System.out.println("Orgão do estagiario: " + getOrgaoLotaçao());
        System.out.println("Condição do estagiario: " + getCondicao());
    }

    @Override
    public double calculoreembolso() {
        setDespesas(250);

        return getDespesas();
    }

    public void exibirCalculos(){
        System.out.println("O valor do reembolso é de: " + calculoreembolso());
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}
