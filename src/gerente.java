
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class gerente extends funcionario{
    private Double bonificacao;

    // Construtor
    public gerente(String nome, String cpf, Double bonificacao, LocalDateTime dataHrEntrada, LocalDateTime dataHrSaida){
        super(nome, cpf, dataHrEntrada, dataHrSaida);
        this.bonificacao = bonificacao;
    }

    @Override
    public Double calcSalario(){
        return (6 * salarioMinimo) + this.bonificacao;
    }

    @Override 
    public void exibirSalario(){
        System.out.println("Salário do " + this.getNome() +  ": " + this.calcSalario());
    }

    @Override 
    public void exibirDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getClass().getSimpleName());
       
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
    public Double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
