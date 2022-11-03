public class Cliente {
    private Integer idade;
    private Double altura;
    private Double peso;

    public Cliente(int idade, double altura, double peso){
        this.idade= idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente(Double peso, Double altura){
        this.peso = peso;
        this.altura = altura;
    }
    public String calcularIMC(){
        double IMC = peso / Math.pow(altura,2);
        System.out.println("IMC: " + IMC);
        if (IMC < 18.5) {
//            System.out.println("Você está muito magro");
            return("Muito magro");
        } else if (IMC < 25) {
//            System.out.println("Seu peso está normal");
            return("Normal");
        } else if (IMC < 30){
//            System.out.println("Você está com sobrepeso");
            return("Sobrepeso");
        } else if (IMC < 35) {
//            System.out.println("Obesidade grau I, procure um médico");
            return("Obesidade grau I");
        } else if (IMC < 40) {
//            System.out.println("Obesidade grau II, procure um médico");
            return("Obesidade grau II");
        } else if (IMC > 40) {
//            System.out.println("Obesidade grau III, mórbido, procure um médico");
            return ("Obesidade grau III");
        }
        return null;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

