public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void imprimirInfonsComuns() {
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n",  this.numero);
        System.out.println("Cliente: " + this.cliente.nome);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("==============================");
    }

}
