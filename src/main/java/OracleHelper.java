import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection() {
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println("oracle PDF report");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println("mysql HTML report");
    }
}
