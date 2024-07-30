public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Saulo Oliveira");
        Conta cc = new ContaCorrente(cliente);
        Conta pp = new ContaPoupanca(cliente);

        cc.depositar(300);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
