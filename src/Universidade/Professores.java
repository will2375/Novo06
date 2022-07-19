package Universidade;

public class Professores extends Funcionarios {

    private String nivelGraduaçao;
    private String discMinistrada;
    private int qntAlunos;
    private int qntTurmas;

    public Professores() {
        super();
        this.nivelGraduaçao = nivelGraduaçao;
        this.discMinistrada = discMinistrada;
        this.qntAlunos = qntAlunos;
        this.qntTurmas = qntTurmas;
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


    public void addProfessor(){

        setNome("Alberto da Silva");
        setCpf("65355297-0");
        setNumRegistro("213");
        setOrgaoLotaçao("sp");
        setSalario(3500);
        setNivelGraduaçao("pos");
        setDiscMinistrada("Matematica");
        setQntTurmas(5);

        System.out.println("Professor: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.println("Nivel graduação: " + this.getNivelGraduaçao());
        System.out.println("Diciplina: " + this.getDiscMinistrada());
        System.out.println("Quantidade de turma: " + this.getQntTurmas());
    }

    public void aumento10()
    {double salario10 = this.getSalario() * 0.1;
        salario10 = this.getSalario() + salario10;
        System.out.println("O salario era " + this.getSalario() + "Agora é " + salario10);
    }


    }

