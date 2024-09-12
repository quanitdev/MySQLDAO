//package quan.dev.data.driver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import static quan.dev.util.Constants.*;
//
//public class MySQLDriver {
//	private static MySQLDriver instance;
//	private MySQLDriver() {
//		
//	}
//	public static MySQLDriver getInstance() {
//		if(instance == null) instance = new MySQLDriver();
//		return instance;
//	}
//	public Connection getConnection() {
//		
//		Connection conn = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			return DriverManager.getConnection(DB_URL, USER, PASS);
//			// System.out.println("Ket noi thanh cong");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	return conn;	
//	}
//}



package quan.dev.data.driver;

import java.sql.Connection;
import java.sql.DriverManager;

import quan.dev.util.Constants;

public class MySQLDriver {

    private static MySQLDriver instance;

    private MySQLDriver() {
    }

    public static MySQLDriver getInstance() {
        if (instance == null) {
            instance = new MySQLDriver();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASS);
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
}