import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class vendedor extends funcionario {
    private Double comissao;
    private int numVendas;

    // Construtor
    public vendedor(String nome, String cpf, Double comissao, int numVendas, LocalDateTime dataHrEntrada, LocalDateTime dataHrSaida){
        super(nome, cpf, dataHrEntrada, dataHrSaida);
        this.comissao = comissao;
        this.numVendas = numVendas;
    }

    // Métodos
    @Override 
    public Double calcSalario(){
        return salarioMinimo + (this.comissao * this.numVendas);
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
    public Double getComissao() {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getNumVendas() {
        return this.numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

}
