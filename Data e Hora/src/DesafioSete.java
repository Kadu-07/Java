import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DesafioSete {
    public static void main(String[] args) {
        LocalDate vencimento =  LocalDate.of(2025,2,26);
        int antecedencia = 7;
        LocalDate aviso = vencimento.minusDays(7);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do lembrete: " + aviso.format(formato));
    }
}
