package a5;

public class Main {

    public static void main(String[] args) {
        FabricaFactory factory = FabricaFactory.getInstance();

        Cliente clientePF = new Cliente(factory.obterFabrica("PF"));
        System.out.println(clientePF.emitirContrato());
        System.out.println(clientePF.emitirProcuracao());

        Cliente clientePJ = new Cliente(factory.obterFabrica("PJ"));
        System.out.println(clientePJ.emitirContrato());
        System.out.println(clientePJ.emitirProcuracao());

        System.out.println("Mesma instância da FabricaFactory (Singleton)? " + (factory == FabricaFactory.getInstance()));
    }
}
