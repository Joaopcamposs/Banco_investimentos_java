
package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Conectar;


public class ClienteDAO {
    public void Novo(Cliente c)
    {
        String sql = "insert into cliente"
                    + "(nconta,senha,nome,cpf,nascimento)"
                    + "values(?,?,?,?,?)";
        Connection con = new Conectar().Conecta();
        PreparedStatement stmt;
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getnConta());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getNome());
            stmt.setString(4, c.getCpf());
            stmt.setDate(5, java.sql.Date.valueOf(c.getNascimento()));
            
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList LClientes()
    {
         String sql = "select * from cliente";
         ArrayList<Cliente> lista = new ArrayList<>();
         Connection con = new Conectar().Conecta();
          PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                String nconta = rs.getString("nconta");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String cpf = rs.getString("cpf");
                String data = rs.getString("nascimento");
                LocalDate date = LocalDate.parse(data);
                lista.add(new Cliente(nconta, senha, nome, cpf, date));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(lista); 
          
          
    }
}
