
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Principal");
        Cliente fulano = new Cliente("Fulano");
        Cliente ciclano = new Cliente("Ciclano");

        banco.cadastrarContaCorrente(fulano);
        banco.cadastrarContaPoupanca(ciclano);

        banco.listarContas();
    }
    
}