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
              new Produto("Cactus", 1, 5, 2, 4, "caixa", "planta");
        var produto2 = 
              new Produto("Flor", 1, 5, 2, 4, "caixa", "planta");
        var produto3 = 
              new Produto("Palmeira", 1, 5, 2, 4, "caixa", "planta");
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);   
        
       
        
        return produtos;
     
    };
        
    
}