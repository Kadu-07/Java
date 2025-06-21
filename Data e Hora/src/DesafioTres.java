import java.time.Duration;
import java.time.LocalTime;

public class DesafioTres {
    public static void main(String[] args) {
        String tarefa = "Tarefa realizada";

        LocalTime inicio = LocalTime.of(14,41);
        LocalTime fim = LocalTime.of(20, 02);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println(tarefa);
        System.out.println("Realizada no tempo de: " + duracao.toHours() + " e " + duracao.toMinutesPart());
    }
}
