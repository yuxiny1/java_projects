package Employee_SDR.database;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance = new DatabaseConnectionManager();
    // private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/Employee_SDR";

    private DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getManagerInstance() {
        return instance;
    }

    // public void connect() throws SQLException {
    // connection = DriverManager.getConnection(url, "root", "root");

    // System.out.println("Connected to database");
    // }

    // public Connection getConnection() {
    // return connection;
    // }

    // public void disconnect() throws SQLException {
    // connection.close();
    // System.out.println("Disconnected from database");
    // }

}