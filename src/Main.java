//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int nivelParaNumero(char nivel) {
        return switch (nivel) {
            case 'S' -> 1;
            case 'A' -> 2;
            case 'B' -> 3;
            case 'C' -> 4;
            case 'D' -> 5;
            default -> 6;
        };
    }




    public static void main(String[] args) {
        Ninja sasuke = new Ninja("Sasuke", 17, 'C');
        Mission zabuza = new Mission('S', "Derrote o zabuza!");
        Mission.fazerMissao(sasuke, zabuza);
    }
}


