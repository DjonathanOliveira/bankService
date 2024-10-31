package br.com.banksystem.services;

import br.com.banksystem.entities.Cliente;

import java.util.Random;

public abstract class ContaBancariaService {
    //O numero da conta pode ser um inteiro gerado aleatoriamente com o Random no momento que o construtor for chamado.
    private int numeroConta;
    private int agencia;
    private Cliente cliente;
    private double saldo;

    public ContaBancariaService(Cliente cliente){
        this.cliente = cliente;
//        Random rand = new Random();
//        this.numeroConta = rand.nextInt(99999);
        //this.numeroConta += 1;
        this.agencia = 7526;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor)
    {
        this.saldo = valor;
    }

    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes da conta...");
        System.out.println("Nome do cliente : " + cliente.getNome());
        System.out.println("Idade do cliente : " + cliente.getIdade());
        System.out.println("Número da conta : " + this.getNumeroConta());
        System.out.println("Agência : " + this.getAgencia());
        System.out.println("Saldo : R$" + this.getSaldo());
        System.out.println("===========//============");
    }
}
