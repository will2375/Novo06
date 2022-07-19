package Universidade;

public class FuncionariosAdm extends Funcionarios {

    private String funcao;
    private String senioridade;

    public FuncionariosAdm() {
        super();
        this.funcao = funcao;
        this.senioridade = senioridade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


    public void addAdm() {

        setNome("Rogerio Benicio");
        setCpf("759034867-9");
        setNumRegistro("432");
        setOrgaoLotaçao("sp");
        setSalario(2700);
        setFuncao("contador");
        setSenioridade("Lider");

        System.out.println("Administrador: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.println("Função administrativa é: " + this.getFuncao());
        System.out.println("Senioridade: " + this.getSenioridade());

    }
    public void aumento10() {
        double salario10 = this.getSalario() * 0.1;
        salario10 = this.getSalario() + salario10;
        System.out.println("O salario era " + this.getSalario() + "Agora é " + salario10);
    }


}
