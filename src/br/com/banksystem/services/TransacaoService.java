package br.com.banksystem.services;

public class TransacaoService {

    private ContaBancariaService contaBancariaService;

    public TransacaoService(ContaBancariaService contaBancariaService){
        this.contaBancariaService = contaBancariaService;
    }

    public void depositar(ContaBancariaService contaBancaria, double valor){
        System.out.println("Depósito efetuado - R$" + valor );
        this.contaBancariaService.setSaldo(contaBancaria.getSaldo() + valor);
    }

    public void sacar(ContaBancariaService contaBancaria, double valor){
        if(this.contaBancariaService.getSaldo() == 0){
            System.out.println("Não é possível sacar. Não há saldo.");
        }else if (this.contaBancariaService.getSaldo() < valor) {
            System.out.println("Não é possível sacar esse valor. Saldo insuficiente.");
        }else{
            this.contaBancariaService.setSaldo(contaBancaria.getSaldo() - valor);
            System.out.println("Saque efetuado - R$" + valor);
            double saldoRestante = this.contaBancariaService.getSaldo();
            System.out.println("Saldo restante - R$" + saldoRestante);
        }

    }

};
