import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println("mysql PDF report");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println("mysql HTML report");
    }

}
