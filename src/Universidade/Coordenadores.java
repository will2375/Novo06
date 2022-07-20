package Universidade;

import Universidade.InterfacesUniversidades.Salario;

public class Coordenadores extends Funcionarios implements Salario {

    private int profSurpervisor;
    private double despesas;

    public Coordenadores(String nome, String cpf, String numRegistro, String orgaoLotaçao, double salario, String profSurpervidor) {
        super();
        this.profSurpervisor = profSurpervisor;
    }


    public Coordenadores() {
        super();
    }

    public int getProfSurpervisor() {
        return profSurpervisor;
    }

    public void setProfSurpervisor(int profSurpervisor) {
        this.profSurpervisor = profSurpervisor;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }


    public void addCordenador() {

        setNome("Maria das flores");
        setCpf("12345678-9");
        setNumRegistro("123");
        setOrgaoLotaçao("SP");
        setProfSurpervisor(6);
    }

    public void status() {

        System.out.println("Coordenador: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.print("esse coordenador tem " + this.getProfSurpervisor() + " professor(es)");

    }

    @Override
    public double salario() {
        setSalario(4500);
        return getSalario();
    }

    public double aumento05() {
        double salario05 = salario() * 0.05;
        salario05 = salario() + salario05;
        return salario05;
    }

    @Override
    public double calculoreembolso(
    ) {
        setDespesas(800);
        return getDespesas();
    }
    public void exibirCalculos(){
        System.out.println("\nO salario era " + salario() + "Agora é " + aumento05());
        System.out.println("O valor do reembolso é de: " + calculoreembolso());

    }
}

