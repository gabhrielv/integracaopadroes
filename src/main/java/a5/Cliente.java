package a5;

public class Cliente {

    private Contrato contrato;

    private Procuracao procuracao;

    public Cliente(FabricaAbstrata fabrica) {
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}
