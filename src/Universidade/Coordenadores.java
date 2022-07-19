package Universidade;

public class Coordenadores extends Funcionarios {

    private int profSurpervisor;

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

    public void addCordenador() {

        setNome("Maria das flores");
        setCpf("12345678-9");
        setNumRegistro("123");
        setOrgaoLotaçao("SP");
        setSalario(4500);
        setProfSurpervisor(6);

        System.out.println("Coordenador: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.print("esse coordenador tem " + this.getProfSurpervisor() + " professor(es)");

    }

    public void aumento05() {
        double salario05 = this.getSalario() * 0.05;
        salario05 = this.getSalario() + salario05;
        System.out.println("\nO salario era " + this.getSalario() + "Agora é " + salario05);
    }

}

