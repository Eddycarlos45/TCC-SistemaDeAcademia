package relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe com métodos utilitários para executar e abrir relatórios.
 *
 * @author Lab01_Aluno
 */
public class ConnectionFactory {

    /*
     * Este bloco estático será executado assim que esta classe for carregada,
     * sendo assim, será executado apenas uma vez.
     */
    static {
        try {
            /*
             * Carrega a classe com.mysql.jdbc.Driver, que é a implementação
             * do driver JDBC para o MySQL.
             */
            Class.forName("com.mysql.jdbc.Driver");

            // caso a classe não seja encontrada
        } catch (ClassNotFoundException exc) {

            /*
             * Como log usaremos o stacktrace das excessões, mas recomendo
             * que para um projeto real você utilize algum mecanismo de log
             * melhor, como o Log4J por exemplo.
             */
            exc.printStackTrace();

        }
    }

    /**
     * O método getConnection retorna uma conexão com o banco de dados baseado
     * nos parâmetros fornecidos.
     *
     * @param url O endereço da base de dados.
     * @param usuario O usuário que tem permissão na base de dados especificada.
     * @param senha A senha do usuário especificado
     * @return Uma conexão com o banco de dados especificado na url.
     * @throws SQLException Caso ocorra algum problema durante a conexão.
     */
    public static Connection getConnection(
            String url,
            String usuario,
            String senha) throws SQLException {

        // retorna a conexão a partir do método getConnection de DriverManager
        return DriverManager.getConnection(url, usuario, senha);

    }

    /**
     * Obtém uma conexão para a base de dados academia.
     *
     * @return Uma conexão para a base de dados academia.
     * @throws SQLException Caso ocorra algum problema durante a conexão.
     */
    public static Connection getAcademiaConnection() throws SQLException {

        return getConnection(
                "jdbc:mysql://localhost/academia",
                "root",
                "");

    }

}
