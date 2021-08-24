/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Controle.ControPessoa;
import java.util.ArrayList;
import java.util.Iterator;

/**
 Classe main
 * 
 */
import javax.swing.JOptionPane;



public class Principal {
    public static void main (String[] args) {
		
    	String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	if(login.equalsIgnoreCase("admin") &&
    			senha.equalsIgnoreCase("admin")){
    	
    	String escolha = JOptionPane.showInputDialog("Digite: \n1 - para COMPRA \n2 - para VENDA");
       
    	if(escolha.equalsIgnoreCase("1")) {
    		
        	// Compra
        	String idCompra = JOptionPane.showInputDialog("Id Compra?");
        	String valor = JOptionPane.showInputDialog("Qual o valor?");    		
    		Venda compra = new Venda();
    		compra.setId(Integer.valueOf(idCompra)); 
    		compra.setValor(Integer.valueOf(valor));
    		compra.setNomCliente(login);
    		compra.setProdutos( new Produtos().listaProdutos());
    		compra.setData(new ImplementandoData().dataAtual());
    					
    		System.out.println("\"----------------------DADOS DA COMPRA--------------------------\"");
                float somaValor1 = 0;
               
                System.out.println("PRODUTOS E QUANTIDADES ");
                 
                for (Produto x : compra.getProdutos()) {
                    JOptionPane. showInputDialog(x.nomProd);
                    String quant = JOptionPane.showInputDialog("quantidade?");
                    System.out.println( x.nomProd + " quantidade = " + quant );
                    somaValor1 += x.precoVen;
                }
                  
    		// Fornecedor						
    		String idPessoa = JOptionPane.showInputDialog("Qual o ID do fornecedor?");
    		String nome = JOptionPane.showInputDialog("Qual o nome do fornecedor?");
    		String cnpjCpf = JOptionPane.showInputDialog("Qual o CNPJ/CPF?");
    		String rua = JOptionPane.showInputDialog("Qual a rua?");
    		String num = JOptionPane.showInputDialog("Qual o num?");
    		String comp = JOptionPane.showInputDialog("Qual o complemento?");
    		String bairro = JOptionPane.showInputDialog("Qual bairro?");
    		String cidade = JOptionPane.showInputDialog("Qual cidade?");
    		String estado = JOptionPane.showInputDialog("Qual estado?");
    		String cep = JOptionPane.showInputDialog("Qual cep?");
    		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
    		
    		
    		// Pessoa
    		Fornecedor fornecedor = new Fornecedor();
    		fornecedor.setId(Integer.valueOf(idPessoa));
    		fornecedor.setNome(nome);
    		fornecedor.setCnpjcpf(cnpjCpf);
    		fornecedor.setRua(rua);
    		fornecedor.setComp(comp);
    		fornecedor.setNum(Integer.valueOf(num));
    		fornecedor.setBairro(bairro);
    		fornecedor.setCidade(cidade);
    		fornecedor.setEstado(estado);
    		fornecedor.setCep(cep);
    		fornecedor.setTelefone1(telef1);
    		
                new ControPessoa().salvar(fornecedor);
    		// Usuario
    		Usuario usuario = new Usuario();
    		usuario.setLogin("Joao");
    		usuario.setNivPerm(1);
    		
    		// Mostrar Compra
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("CARACTERISTICAS DA COMPRA");
    		System.out.println("ID da compra: " + compra.getId());
    		System.out.println("Valor da Compra: " + valor);
    		System.out.println("Data da compra: " + compra.getData());
    		
    		// Mostrar Usuario
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS DO USUARIO");
    		System.out.println("Usuario:"+ usuario.getLogin());
    		System.out.println("Nivel de Permissao: " + usuario.getNivPerm() + " Gerente");
    		
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS Do FORNECEDOR");
    		System.out.println("ID do fornecedor: " + fornecedor.getId());
    		System.out.println("Nome: " + fornecedor.getNome());
    		System.out.println("CNPJ: " + fornecedor.getCnpjcpf());
    		System.out.println("Rua: " + fornecedor.getRua());
    		System.out.println("Complemento: " + fornecedor.getComp());
    		System.out.println("Numero: " + fornecedor.getNum());
    		System.out.println("Bairro: " + fornecedor.getBairro());
    		System.out.println("Cidade: " + fornecedor.getCidade());
    		
        }
        
        if(escolha.equalsIgnoreCase("2"))  {
        	
        	// Venda
        	String idVenda = JOptionPane.showInputDialog("Id Venda?");
        	String valor = JOptionPane.showInputDialog("Qual o valor?");    		
    		Venda venda = new Venda();
    		venda.setId(Integer.valueOf(idVenda)); 
    		venda.setValor(Integer.valueOf(valor));
    		venda.setData(new ImplementandoData().dataAtual());
            venda.setNomCliente(login);
            venda.setProdutos( new Produtos().listaProdutos());
    		
            System.out.println("-----------------------DADOS DA VENDA---------------------------");
            
                float somaValor2 = 0;
               
                System.out.println("PRODUTOS E QUANTIDADES ");
                 
                for (Produto x : venda.getProdutos()) {
                    JOptionPane. showInputDialog(x.nomProd);
                    String quant = JOptionPane.showInputDialog("quantidade?");
                    System.out.println( x.nomProd + " quantidade = " + quant );
                    somaValor2 += x.precoVen;
                }
                  
    		
    		// Cliente						
    		String idPessoa = JOptionPane.showInputDialog("Qual o ID do cliente?");
    		String nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
    		String cnpjCpf = JOptionPane.showInputDialog("Qual o CNPJ/CPF?");
    		String rua = JOptionPane.showInputDialog("Qual a rua?");
    		String num = JOptionPane.showInputDialog("Qual o num?");
    		String comp = JOptionPane.showInputDialog("Qual o complemento?");
    		String bairro = JOptionPane.showInputDialog("Qual bairro?");
    		String cidade = JOptionPane.showInputDialog("Qual cidade?");
    		String estado = JOptionPane.showInputDialog("Qual estado?");
    		String cep = JOptionPane.showInputDialog("Qual cep?");
    		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
    		
    		// Pessoa
    		Cliente cliente = new Cliente();
    		cliente.setId(Integer.valueOf(idPessoa));
    		cliente.setNome(nome);
    		cliente.setCnpjcpf(cnpjCpf);
    		cliente.setRua(rua);
    		cliente.setComp(comp);
    		cliente.setNum(Integer.valueOf(num));
    		cliente.setBairro(bairro);
    		cliente.setCidade(cidade);
    		cliente.setEstado(estado);
    		cliente.setCep(cep);
    		cliente.setTelefone1(telef1);
    		
    		// Usuario
    		Usuario usuario = new Usuario();
    		usuario.setLogin("Jose");
    		usuario.setNivPerm(3);
    		
    		// Mostrar Venda
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("CARACTERISTICAS DA VENDA");
    		System.out.println("ID da Venda: " + venda.getId());
    		System.out.println("Valor da Venda: " + valor);
    		System.out.println("Data da Venda: " + venda.getData());
    		
    		// Mostrar Usu�rio
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS DO USUARIO");
    		System.out.println("Usuario:"+ usuario.getLogin());
    		System.out.println("Nivel de Permissao: " + usuario.getNivPerm() + " Vendedor");
    		
    		// Mostrar Cliente
    		System.out.println("----------------------------------------------------------------");
    		System.out.println("DADOS DO CLIENTE");
    		System.out.println("ID do Cliente: " + cliente.getId());
    		System.out.println("Nome: " + cliente.getNome());
    		System.out.println("CNPJ: " + cliente.getCnpjcpf());
    		System.out.println("Rua: " + cliente.getRua());
    		System.out.println("Complemento: " + cliente.getComp());
    		System.out.println("Numero: " + cliente.getNum());
    		System.out.println("Bairro: " + cliente.getBairro());
    		System.out.println("Cidade: " + cliente.getCidade());
        	
    
    }
        }	
        }
}


