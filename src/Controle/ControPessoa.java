
package Controle;

import Crud.CrudPessoa;
import util.Pessoa;

/**
 *
 * @author rafae
 */
public class ControPessoa {
    public int salvar(Pessoa pessoa){
        return new CrudPessoa().salvar(pessoa);
        
    }
    
}
