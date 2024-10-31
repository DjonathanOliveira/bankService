package br.com.banksystem.test;

import br.com.banksystem.entities.Cliente;
import br.com.banksystem.services.ContaBancariaService;
import br.com.banksystem.services.ContaCorrenteService;
import br.com.banksystem.services.ContaPoupancaService;
import br.com.banksystem.services.TransacaoService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Djonathan Oliveira");
        cliente.setIdade(26);
        cliente.setCpf("168.600.317-00");
        cliente.setEndereco("Rua Ierê, 223 - Rio de Janeiro, RJ");
        cliente.setTelefone("(21) 965543613");

        ContaBancariaService conta = new ContaCorrenteService(cliente);
        conta.setNumeroConta(89063);
        conta.mostrarDetalhes();

        TransacaoService transacaoService = new TransacaoService(conta);
        transacaoService.depositar(conta, 10.0);
        conta.mostrarDetalhes();
        transacaoService.depositar(conta, 15.0);
        conta.mostrarDetalhes();
        transacaoService.depositar(conta, 4.0);
        conta.mostrarDetalhes();
        transacaoService.sacar(conta, 10.0);
        conta.mostrarDetalhes();

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Alice");
        cliente2.setIdade(20);
        cliente2.setCpf("123.456.789-10");
        cliente2.setEndereco("Rua Azevedo Lima, 74, Rio Comprido - RJ");
        cliente2.setTelefone("21983479545");

        ContaBancariaService conta2 = new ContaPoupancaService(cliente2);
        conta2.setNumeroConta(78963);
        conta2.mostrarDetalhes();

        TransacaoService transacaoService1 = new TransacaoService(conta2);
        transacaoService1.sacar(conta2, 100.0);
        transacaoService1.depositar(conta2, 50.0);
        transacaoService1.sacar(conta2, 51.0);
        transacaoService1.sacar(conta2, 45);
    }
}