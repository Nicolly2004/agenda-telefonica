package com.academiadesenvolvedor;


import models.Pessoa;
import utils.Telefone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa;
        String nome;
        String telefone;
        boolean sair = false;
        ArrayList<Pessoa> pessoaTelefone = new ArrayList<>();


        System.out.println("Bem-Vindo(a) a Nossa Lista Telefônica!!!");
        System.out.println("Antes de comerçarmos, informe seu Nome: ");

        while (!sair) {
            System.out.println("Olá, " + getNome());
            System.out.println("Há: " + pessoaTelefone.size() + "Pessoas cadastradas na lista Telefônica.");

            System.out.println("------------------- Escolha uma opção -------------------");
            System.out.println("1° Cadastrar uma Pessoa");
            System.out.println("2° Listar uma Pessoa");
            System.out.println("3° Coonsultar uma Pessoa");
            System.out.println("4° Apagar informações.");
            System.out.println("0 Sair...");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    Main.cadastraPessoa(pessoaTelefone, scan, pessoa);
                    break;
                case 2:
                    Main.listarPessoa(pessoaTelefone);
                    break;
                case 3:
                    Main.consultarPessoa(pessoaTelefone, scan);
                    break;
                case 4:
                    Main.removePessoa(pessoaTelefone, scan);
                    System.out.println("Pessoa removida...");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
            }

        }
        scan.close();
    }

    public String getNome() {
        return nome;
    }

    public static void cadastraPessoa(ArrayList<Pessoa> pessoaTelefone, Scanner scan, Pessoa pessoa) {
        System.out.println("Vamos cadastrar um cliente....");
        System.out.print("Informe o Nome: ");
        nome = this.scan.nextLine();

        System.out.println("Código do País: ");
        codigoPais = this.scan.nextine();

        System.out.println("DDD: ");
        ddd = this.scan.nextLine();

        System.out.println("Número: ");
        numero = this.scan.nextLine();

        System.out.println("Pessoa Cadastrada!!!");
    }

    public static void listarPessoa(ArrayList<Pessoa> pessoaTelefone, Scanner scan, Pessoa pessoa) {
        System.out.println("Listando " + this.pessoa.size() + " produtos");
        Pessoa pessoa;

        for (int i = 0; i < this.pessoa.size(); i++){
            pessoa = this.pessoa.get(i);

        }
    }

    public static void consultarPessoa(ArrayList<Pessoa> pessoaTelefone, Scanner scan, Pessoa pessoa){
        String termo;
        int encontrados = 0;
        System.out.print("Pesquise pelo nome: ");
        termo = this.scan.nextLine();
        Pessoa pessoa;

        for (int i = 0; i < this.clientes.size(); i++) {
            pessoa = this.clientes.get(i);
            if (pessoa.getNome().contains(termo)) {
                encontrados++;
            }
            System.out.println("Listagem de " + this.pessoa.size() + " concluida...");

        }
    }
    public static void removePessoa(ArrayList<Pessoa> pessoaTelefone, Scanner scan, Pessoa pessoa){
      String nome;

        System.out.println("Digite o nome a ser Excluído: ");
        nome = scan.nextLine();
        if(retorno.isEncontrado()){
            pessoaTelefone.remove(retorno.getIndex());
            System.out.println("O usuário "+nome+" Saiu...");
            return;
        }
    }
}