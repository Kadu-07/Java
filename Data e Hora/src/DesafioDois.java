import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DesafioDois {
    public static void main(String[] args) {
        String transacaoUm = "Transação realizada";

        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter diaBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaBR = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(transacaoUm);
        System.out.println(dataAtual.format(diaBR));
        System.out.println(horaAtual.format(horaBR));
    }
}
