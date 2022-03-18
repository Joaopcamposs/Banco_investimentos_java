/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joao Pedro
 */
public class Conectar {
    public Connection Conecta()
    {
        try
        {
            return DriverManager.getConnection("jdbc:postgresql://localhost/POOV","postgres","1234");
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
