
package principal;

import cliente.Cliente;
import cliente.ClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class TESTE {
     public static void main(String[] args) {

     ClienteDAO dao = new ClienteDAO();
    dao.Novo(new Cliente("1","12","Lucas","100",LocalDate.now()));
    }
}
