package transferecia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;
//    proprietario proprietario;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "12345678900", "7777777");
        silvioSantos = new Cliente("Silvio Santos", "00897521852", "88888");

//        proprietario = new proprietario();

        contaXuxa = new Conta("0024", "7878", 8500.00, xuxa);
        contaSilvio = new Conta("0025", "2323", 7500.00, silvioSantos);


    }

    @Test
    public void realizarTransação() {
        contaXuxa.realizarTranferencia(2500.00, contaSilvio);

        assertEquals(6000.00, contaXuxa.getSaldo());
        assertEquals(10000.00, contaSilvio.getSaldo());

    }

    @Test
    public void realizarTranferenciaInvalida() {

        boolean resultado = contaXuxa.realizarTranferencia(9000.00, contaSilvio);
        assertFalse(resultado);
    }

    @Test
    public void validarAgencia() {
        assertEquals("0024", contaXuxa.getAgencia());
    }

    @Test
    public void validarNumeroConta() {
        assertEquals("7878", contaXuxa.getNumeroConta());
    }


    public void validarProprietario() {
        //       assertEquals("xuxa", xuxa.get);
    }

}





