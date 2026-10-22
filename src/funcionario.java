import java.time.LocalDateTime;

public class funcionario {
        private String nome;
        private String cpf;
        private LocalDateTime dataHrEntrada;
        private LocalDateTime dataHrSaida;

        protected final Double salarioMinimo = 1618.0;

        // Construtor
        public funcionario (String nome, String cpf, LocalDateTime dataHrEntrada, LocalDateTime dataHrSaida){
            this.nome = nome;
            this.cpf = cpf;
            this.dataHrEntrada = dataHrEntrada;
            this.dataHrSaida = dataHrSaida;
        }

        // Métodos
        public Double calcSalario(){
            return salarioMinimo;
        }
        public void exibirSalario(){}
        public void exibirDados(){}

        // Getters e Setters
        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCpf(){
            return this.cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }

         public LocalDateTime getDataHrEntrada() {
            return this.dataHrEntrada;
        }

        public void setDataHrEntrada(LocalDateTime dataHrEntrada) {
            this.dataHrEntrada = dataHrEntrada;
        }

        public LocalDateTime getDataHrSaida() {
            return this.dataHrSaida;
        }

        public void setDataHrSaida(LocalDateTime dataHrSaida) {
            this.dataHrSaida = dataHrSaida;
        }
}
