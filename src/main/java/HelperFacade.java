import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        switch (dbType) {
            case MYSQL:
                mySqlReport(reportType, tableName);
                break;
            case ORACLE:
                oracleReport(reportType, tableName);
                break;
        }

    }

    private static void mySqlReport(ReportTypes reportType, String tableName) {
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        switch (reportType) {
            case HTML:
                mySqlHelper.generateMySqlHTMLReport(tableName, con);
                break;
            case PDF:
                mySqlHelper.generateMySqlPDFReport(tableName, con);
                break;
        }
    }

    private static void oracleReport(ReportTypes reportType, String tableName) {
        Connection con = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        switch (reportType) {
            case HTML:
                oracleHelper.generateOracleHTMLReport(tableName, con);
                break;
            case PDF:
                oracleHelper.generateOraclePDFReport(tableName, con);
                break;
        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}
