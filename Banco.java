
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void listarContas(){
        System.out.println(String.format("\n######### Contas do Banco %s #########\n", nome));
        for(int i = 0; i < contas.size(); i++){
            contas.get(i).imprimirExtrato();
        }
    }

    public void cadastrarContaCorrente(Cliente cliente){
        Conta conta = new ContaCorrente(cliente);
        getContas().add(conta);
    }

    public void cadastrarContaPoupanca(Cliente cliente){
        Conta conta = new ContaPoupanca(cliente);
        getContas().add(conta);
    }
}