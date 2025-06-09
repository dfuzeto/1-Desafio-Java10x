public class Mission {
    private char NivelMissao;
    private String Missao;

    public Mission(char NivelMissao, String missao) {
        this.NivelMissao = NivelMissao;
        this.Missao = missao;
        boolean status = false;
    }

    public char getNivel() {
        return NivelMissao;
    }

    public String getMissao() {
        return Missao;
    }

    public static void fazerMissao(Ninja ninja, Mission missao) {
        if (Main.nivelParaNumero(missao.getNivel()) >= Main.nivelParaNumero(ninja.GetNivel())) {
            System.out.println("Missão Concluida.");
        } else {
            System.out.println("Missão Fracassada.");
        }
    }
}
