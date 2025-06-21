import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DesafioQuatro {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazo = 15;
        LocalDate dataFim = dataInicio.plusDays(prazo);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("O dia final de entrega é " + dataFim.format(formato));
    }
}
