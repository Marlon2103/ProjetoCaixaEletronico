package p.i;



import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.Random;

public class Caixa {
   
   

	

	public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome,espaço;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
        pessoafisica p1 = new pessoafisica ();
    

    	
        
        
        //Obtendo os dados iniciais do Cliente
        
        System.out.println("====================Cadastrando novo cliente==================\n");
        System.out.print("=======================Ente com seu nome:====================== \n");
        nome = entrada.nextLine();
        System.out.println("=====================Entre com seu cpf=========================\n");
        p1.setCpf(entrada.nextFloat());
        System.out.println("=====================Entre com o cep============================\n");
        p1.setCep(entrada.nextInt());
        System.out.println("======================Digite a idade============================ \n");
        p1.setIdade(entrada.nextInt());
        System.out.println();
        espaço=entrada.nextLine();
        System.out.println("==================Digite a Nacionalidade ==========================\n");
        p1.setNacionalidade(entrada.nextLine());
        
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        
		//Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial,p1.getCpf(),p1.getCep(),p1.getIdade(),p1.getNacionalidade());
        minhaConta.iniciar();
    }

	
		
	}
    
