import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DesafioSeis {
    public static void main(String[] args) {
        LocalDate evento = LocalDate.of(2025, 4, 25);
        LocalDate atual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(evento.format(formato));
        System.out.println(atual.format(formato));

        if (evento.isBefore(atual)) {
            System.out.println("O evento já ocorreu");
        } else if (evento.isEqual(atual)) {
            System.out.println("O evento é hoje");
        } else {
            System.out.println("O evento irá ocorrer");
        }
    }
}
