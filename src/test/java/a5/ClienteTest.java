package a5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPessoaFisica() {
        Cliente cliente = new Cliente(new FabricaPF());
        assertEquals("Contrato de Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        Cliente cliente = new Cliente(new FabricaPF());
        assertEquals("Procuração de Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        Cliente cliente = new Cliente(new FabricaPJ());
        assertEquals("Contrato de Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        Cliente cliente = new Cliente(new FabricaPJ());
        assertEquals("Procuração de Pessoa Jurídica", cliente.emitirProcuracao());
    }
}
