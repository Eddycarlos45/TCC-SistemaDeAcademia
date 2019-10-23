/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author José Wilson, Pedro, Edson e Denis
 */
public class Conexao {
    
    public static final int MYSQL=0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";
    
    public static java.sql.Connection conexao(String url, String nome, String senha) throws ClassNotFoundException, SQLException
    {
        Class.forName(MySQLDriver);
        return DriverManager.getConnection(url, nome, senha);
    }
    
}
