package br.com.banksystem.services;

import br.com.banksystem.entities.AplicaTaxa;
import br.com.banksystem.entities.Cliente;

public class ContaCorrenteService extends ContaBancariaService implements AplicaTaxa {
    public double taxaManutencao;

    @Override
    public double taxa() {
        return this.taxaManutencao = 0.05;
    }

    public ContaCorrenteService(Cliente cliente){
        super(cliente);
    }
}
