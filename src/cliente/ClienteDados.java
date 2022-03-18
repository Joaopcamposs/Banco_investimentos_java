/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Joao Pedro
 */
public class ClienteDados 
{
   
    
    Cliente teste = new Cliente();
    
    String nConta = "123";
    String senha = "123";
    String nome = "Joao";
    String cpf = "321";
    LocalDate localDate = LocalDate.now();
    LocalDate nascimento = localDate;

    public ClienteDados() {
    }

        
    public static Cliente pegarCliente(Cliente cliente)
    {
        return cliente;
    }
}
