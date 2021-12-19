package p.i;

import java.util.Scanner;

public class Conta {
    private String nome,nacionalidade;
    private int conta, saques,cep,idade;
    private Float cpf;
    private double saldo;
    Scanner entrada = new Scanner(System.in);
    
		
    
    
    			
    public Conta(String nome, int conta, double saldo_inicial,  Float cpf,int cep, int idade,String pais){
        this.nome=nome;
        this.cpf=cpf;
        this.nacionalidade=pais;
        this.idade=idade;
        this.cep=cep;
        this.conta=conta;
        saldo=saldo_inicial;
        saques=0;
   }
    

	public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade "+this.idade+": anos.");
        System.out.println("Nacionalidade "+this.nacionalidade);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
     
        
        
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        sacar(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;
                    
            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
        
        
        			
        			
        	
        				
        	}		

        
        
        
    }
    
    
