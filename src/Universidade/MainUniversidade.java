package Universidade;

public class MainUniversidade {
    public static void main(String[] args) {
        Professores professores = new Professores();
        professores.addProfessor();
        professores.aumento10();
        System.out.println("-----------------------------");
        Coordenadores coordenadores = new Coordenadores();
        coordenadores.addCordenador();
        coordenadores.aumento05();
        System.out.println("-----------------------------");
        FuncionariosAdm fAdm = new FuncionariosAdm();
        fAdm.addAdm();
        fAdm.aumento10();

    }
}
