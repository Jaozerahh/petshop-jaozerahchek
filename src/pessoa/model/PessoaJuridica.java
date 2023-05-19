package pessoa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    private Collection<Pessoa>socios = new Vector<>();

    public PessoaJuridica addSocio(Pessoa socio){
        this.socios.add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio){
        this.socios.remove(socios);
        return this;
    }

    private Collection<Pessoa> getSocios(){
        return Collections.unmodifiableCollection(this.socios);
    }

    public PessoaJuridica() {
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", socios=" + socios +
                '}';
    }
}
