package MySqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQlConection {

    private  static final String  HOST="jdbc:mysql://localhost:3306";
    private static final String DBNAME="botkajoy";
    private static final  String URL= HOST+"/"+DBNAME;
    private static Connection con=null;

}
