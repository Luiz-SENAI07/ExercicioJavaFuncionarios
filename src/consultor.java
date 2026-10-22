import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class consultor extends funcionario{
    private Double vlrHora;
    private int hrsTrabalhadas;

    // Construtor
    public consultor(String nome, String cpf, Double vlrHora, int hrsTrabalhadas, LocalDateTime dataHrEntrada, LocalDateTime dataHrSaida){
        super(nome, cpf, dataHrEntrada, dataHrSaida);
        this.vlrHora = vlrHora;
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    @Override 
    public Double calcSalario(){
        return this.vlrHora  * this.hrsTrabalhadas;
    }

    @Override 
    public void exibirSalario(){
        System.out.println("Salário do " + this.getNome() +  ": " + this.calcSalario());
    }

    @Override 
    public void exibirDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getClass());
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        if(getDataHrEntrada() instanceof LocalDateTime dataHoraEntrada){
            System.out.println("Data e Hora de Entrada: " + dataHoraEntrada.format(formatador));
        }
        if(getDataHrSaida() instanceof LocalDateTime dataHoraSaida){
            System.out.println("Data e Hora de saida: " + dataHoraSaida.format(formatador));
        }
        exibirSalario();
    }

    // Getters e Setters
    public Double getVlrHora() {
        return this.vlrHora;
    }

    public void setVlrHora(Double vlrHora) {
        this.vlrHora = vlrHora;
    }

    public int getHrsTrabalhadas() {
        return this.hrsTrabalhadas;
    }

    public void setHrsTrabalhadas(int hrsTrabalhadas) {
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    
}
