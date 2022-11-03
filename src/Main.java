public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente(25, 1.76,85.7);
        Cliente jose = new Cliente(25, 1.76,95.7);
        Cliente joao = new Cliente(25, 1.76,65.7);
        Cliente mario = new Cliente(25, 1.76,65.7);
        Cliente luigi = new Cliente(25, 1.76,105.7);

        pedro.calcularIMC();

        Clinica clinica1 = new Clinica("Pedro");
        clinica1.adicionarCliente(pedro);
        clinica1.adicionarCliente(jose);
        clinica1.adicionarCliente(joao);
        clinica1.adicionarCliente(mario);
        clinica1.adicionarCliente(luigi);
//        System.out.println(clinica1.listaDeClientes.get(0));
        clinica1.categorizarClientes();
        clinica1.tratamento(mario);
        clinica1.tratamento2(luigi, 12.5);

    }
}