/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.*;

/**
 *
 * @author rafae
 */
public class Produtos {
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public ArrayList<Produto> listaProdutos()
    {
      
        var produto1 = 
              new Produto("cactus", 1, 5, 2, 4, "caixa", "planta");
        var produto2 = 
              new Produto("flor", 1, 5, 2, 4, "caixa", "planta");
        var produto3 = 
              new Produto("mato", 1, 5, 2, 4, "caixa", "planta");
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);   
        
       
        
        return produtos;
     
    };
        
    
}
    
    

