import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        vendedor o_vendedor = new vendedor("Diogo", "1111111111111",  0.5, 50, LocalDateTime.of(2026, 10, 25, 06, 30), LocalDateTime.of(2026, 10, 25, 18, 30));
        consultor o_consultor = new consultor("Lucas", "22222222222222", 10.0, 220, LocalDateTime.of(2026, 10, 25, 07, 30), LocalDateTime.of(2026, 10, 25, 18, 30));
        gerente o_gerente = new gerente("Luiz", "333333333333", 2000.0, LocalDateTime.of(2026, 10, 25, 8, 30), LocalDateTime.of(2026, 10, 25, 18, 30));

        ArrayList<funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(o_vendedor);
        funcionarios.add(o_consultor);
        funcionarios.add(o_gerente);

        for(funcionario func : funcionarios){
            func.exibirDados();
            System.out.println("");
        }
    }
}