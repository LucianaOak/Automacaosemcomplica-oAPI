package transferencia;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTeste {

    @Test
    public void realizartransacao() {
        Cliente Xuxa = new Cliente("Xuxa", "12345678900", "111111111");
        Cliente SilvioSantos = new Cliente("Silvio Santos", "23423467699", "22222222222");

        Conta contaXuxa = new Conta("0044", "123432345", 2500, Xuxa);
        Conta contaSilvio = new Conta("0001", "004645433", 3500, SilvioSantos);
        System.out.println("Valor do Saldo da conta Xuxa: " + contaXuxa.getSaldo());
        System.out.println("Valor do Saldo da Conta Silvio: " + contaSilvio.getSaldo());

        contaXuxa.realizartransferencia(1000,contaSilvio);
        assertEquals(1000,contaXuxa.getSaldo());
        assertEquals(4500, contaSilvio.getSaldo());
        System.out.println("Novo Valor do Saldo da conta Xuxa: " + contaXuxa.getSaldo());
        System.out.println("Novo Valor do Saldo da Conta Silvio: " + contaSilvio.getSaldo());

    }

}
