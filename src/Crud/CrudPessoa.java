
package Crud;

import connections.ConexaoMySql;
import util.Pessoa;
/**
 *
 * @author rafae
 */
public class CrudPessoa {
   public int salvar(Pessoa pessoa) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql =
                     "INSERT INTO pessoa (Nome, cnpjcpf, telefone1, telefone2 ,cep ,num, rua, comp,cidade estado) VALUES("
                         + "'" +  pessoa.getNome() +  "',"      
                + "'" + pessoa.getCnpjcpf()+ "',"
                + "'" + pessoa.getTelefone1() + "',"
                + "'" + pessoa.getTelefone2() + "',"
                + "'" + pessoa.getCep() + "'," 
                + "'" + pessoa.getNum() + "',"
                + "'" + pessoa.getRua()+ "',"
                + "'" + pessoa.getComp()+ "',"
                + "'" + pessoa.getCidade()+ "',"
                + "'" + pessoa.getEstado() + "'"
                + ");";
                
            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
   }
}
