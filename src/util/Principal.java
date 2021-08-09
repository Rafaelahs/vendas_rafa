/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import javax.swing.JOptionPane;

/**
 Classe main
 * 
 */
public class Principal {
    public static void main (String[] args) {
		
    	/*String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	if(login.equalsIgnoreCase("admin") &&
    			senha.equalsIgnoreCase("admin")){};*/
    	
    	/*{aqui dentro entra as classes}*/
    	
    	
    	
    	
    	
    	
    	    	
    		
    	
		
		
    	
    		// criando um comprador com endereço					
		
		String nome = JOptionPane.showInputDialog("NOME COMPLETO:");
		String cnpjCpf = JOptionPane.showInputDialog(" CNPJ/CPF?");
		String rua = JOptionPane.showInputDialog("Qual a rua?");
		String comp = JOptionPane.showInputDialog("Qual o complemento?");
		String num = JOptionPane.showInputDialog("Qual o num?");
		String bairro = JOptionPane.showInputDialog("Qual bairro?");
		String cidade = JOptionPane.showInputDialog("Qual cidade?");
		String estado = JOptionPane.showInputDialog("Qual estado?");
		String cep = JOptionPane.showInputDialog("Qual cep?");
		String telef1 = JOptionPane.showInputDialog("Qual telef1?");
		String telef2 = JOptionPane.showInputDialog("Qual telef2?");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(0);
		pessoa.setNome(nome);
		pessoa.setCnpjcpf(cnpjCpf);
		pessoa.setRua(rua);
		pessoa.setComp(comp);
		pessoa.setNum(Integer.valueOf(num));
		pessoa.setBairro(bairro);
		pessoa.setCidade(cidade);
		pessoa.setEstado(estado);
		pessoa.setCep(cep);
		pessoa.setTelefone1(telef1);
		pessoa.setTelefone2(telef2);
		
				
		String cupomDesconto = JOptionPane.showInputDialog("Qual desconto ?");
		String ponto = JOptionPane.showInputDialog("Qual ponto ?");
		
		Cliente cliente = new Cliente();
		cliente.setCupomDesconto(Integer.valueOf(cupomDesconto));
		cliente.setPontos(Integer.valueOf(ponto));
				
		
		// criando usuario
		Usuario usuario = new Usuario();
		usuario.setLogin(pessoa.nome);                
		usuario.setNivPerm(1);
		usuario.setSenha("1234");
                
                // criando uma venda
                Venda venda = new Venda();
		venda.setData(new ImplementandoData().dataAtual());
		venda.setId(0);
		venda.setNomCliente(usuario.getLogin());
		venda.setUsuario(usuario);
                venda.setProdutos( new Produtos().listaProdutos());
		venda.setValor(0);
		
                double valor = 0;
                int idCompra = 0;
		 System.out.println("PRODUTOS E QUANTIDADES ");
                 
                  for(Produto x : venda.getProdutos() ) {
                    
                   
                    String produto = JOptionPane. showInputDialog(x.nomProd);
                     String quant = JOptionPane.showInputDialog("quantidade?");
                     System.out.println( x.nomProd + " quantidade = " + quant );
                     
                     valor += x.precoVen;
                 }
                  
                  Compra compra = new Compra();
		compra.setId(Integer.valueOf(idCompra)); 
		compra.setValor(valor);
		compra.setData(new ImplementandoData().dataAtual());
		compra.setDataEntrega(new ImplementandoData().dataEntrega());
                
                System.out.println(" ");
                System.out.println("DADOS DO COMPRADOR");
                System.out.println("comprador: " + usuario.getLogin());
		System.out.println("Data Entrega da compra: " + compra.getDataEntrega());
		System.out.println("Data da compra: " + compra.getData());
                System.out.println("valor da compra: " + valor);
                
                
                
                System.out.println(" ");
                System.out.println("DADOS DA ENTREGA");
                System.out.println("Rua: " + pessoa.getRua());
		System.out.println("Complemento: " + pessoa.getComp());
		System.out.println("N�mero: " + pessoa.getNum());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("Cidade: " + pessoa.getCidade());
                System.out.println("Nome: " + pessoa.getNome());
		
			
				
	}
    }


