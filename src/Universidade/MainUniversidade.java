package Universidade;

public class MainUniversidade {
    public static void main(String[] args) {
        Professores professores = new Professores();
        professores.addProfessor();
        professores.status();
        professores.exibirCalculos();
        System.out.println("-----------------------------");
        Coordenadores coordenadores = new Coordenadores();
        coordenadores.addCordenador();
        coordenadores.status();
        coordenadores.exibirCalculos();
        System.out.println("-----------------------------");
        FuncionariosAdm fAdm = new FuncionariosAdm();
        fAdm.addAdm();
        fAdm.status();
        fAdm.aumento10();
        fAdm.calculoreembolso();
        System.out.println("-----------------------------");
        Estagiarios estagiarios = new Estagiarios();
        estagiarios.addEstagiario();
        estagiarios.status();
        estagiarios.exibirCalculos();
    }
}
