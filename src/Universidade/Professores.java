package Universidade;

import Universidade.InterfacesUniversidades.Salario;

public class Professores extends Funcionarios implements Salario {

    private String nivelGraduaçao;
    private String discMinistrada;
    private int qntAlunos;
    private int qntTurmas;
    private double despesas;
    private int qntEstagiarios;

    public Professores() {
        super();
        this.nivelGraduaçao = nivelGraduaçao;
        this.discMinistrada = discMinistrada;
        this.qntAlunos = qntAlunos;
        this.qntTurmas = qntTurmas;
        this.qntEstagiarios = qntEstagiarios;
    }



    public void addProfessor() {

        setNome("Alberto da Silva");
        setCpf("65355297-0");
        setNumRegistro("213");
        setOrgaoLotaçao("sp");
        setNivelGraduaçao("pos");
        setDiscMinistrada("Matematica");
        setQntTurmas(5);
        setQntEstagiarios(2);
    }

    public void status() {
        System.out.println("Professor: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.println("Nivel graduação: " + this.getNivelGraduaçao());
        System.out.println("Diciplina: " + this.getDiscMinistrada());
        System.out.println("Quantidade de turma: " + this.getQntTurmas());
        System.out.println("Esse professor tem: " + this.getQntEstagiarios());
    }


    @Override
    public double salario() {
        setSalario(3500);
        return getSalario();
    }

    public double aumento10() {
        double salario10 = salario() * 0.1;
        salario10 = salario() + salario10;
        return salario10;
    }

    @Override
    public double calculoreembolso() {
        setDespesas(700);
        return getDespesas();
    }

    public void exibirCalculos(){
        System.out.println("O salario era " + salario() + "Agora é " + aumento10());
        System.out.println("O valor do reembolso é de: " + calculoreembolso());

    }

    public String getNivelGraduaçao() {
        return nivelGraduaçao;
    }

    public void setNivelGraduaçao(String nivelGraduaçao) {
        this.nivelGraduaçao = nivelGraduaçao;
    }

    public String getDiscMinistrada() {
        return discMinistrada;
    }

    public void setDiscMinistrada(String discMinistrada) {
        this.discMinistrada = discMinistrada;
    }

    public int getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(int qntAlunos) {
        this.qntAlunos = qntAlunos;
    }

    public int getQntTurmas() {
        return qntTurmas;
    }

    public void setQntTurmas(int qntTurmas) {
        this.qntTurmas = qntTurmas;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public int getQntEstagiarios() {
        return qntEstagiarios;
    }

    public void setQntEstagiarios(int qntEstagiarios) {
        this.qntEstagiarios = qntEstagiarios;
    }
}

