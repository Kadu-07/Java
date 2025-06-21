import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DesafioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.println("Digite sua carga horária (em horas): ");
        int cargaHorária = scanner.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);

        LocalTime saidaPrevista = entrada.plusHours(cargaHorária);

        Duration tempoTrabalhado = Duration.between(saidaPrevista, saida);
        long horasExtras = tempoTrabalhado.toHours();
        long minutosExtras = tempoTrabalhado.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saida.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }
            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
