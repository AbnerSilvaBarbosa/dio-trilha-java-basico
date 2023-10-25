package abstracts;

import interfaces.IBanco;
import interfaces.IConta;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco implements IBanco {

    private List<IConta> contaList = new ArrayList<>();
    @Override
    public List<IConta> getContas() {
        return this.contaList;
    }

    @Override
    public void setContas(IConta conta) {
        this.contaList.add(conta);
        System.out.println("Conta adicionada no banco com sucesso !");
    }
}
