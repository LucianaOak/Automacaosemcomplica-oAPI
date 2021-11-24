package transferencia;

public class Conta {
    String ag;
    String numeroConta;
    double saldo;
    Cliente proprietário;

    public Conta(String ag, String numeroConta, double saldo, Cliente proprietário) {
        this.ag = ag;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietário = proprietário;
    }

    public String getAg() {
        return ag;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietário() {
        return proprietário;
    }

    public void realizarDeposito(double valor){
        saldo  = saldo + valor;
    }

    public boolean realizarSaque(double valor){
        if( valor > saldo){
            return false;
        }
        saldo = valor;
        return true;
    }

    public boolean realizartransferencia(double valor, Conta destino) {
    if (realizarSaque(valor)){
    destino.realizarDeposito(valor);
    return true;
    }
    return false;
    }
}
