package conexion;

import java.awt.HeadlessException;
import java.sql.*;

public class conexion {

    public static String nombreBd="sistema_experto";
    public static String usuario = "root";
    public static String password="Admin3312mysql"; //Cambiar por la propia
    public static String url="jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=trueuse"
    +"JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"+"serverTimezone=UTC";
    
    //Variables para ejecutar consultas
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    //Metodo de conexion
    public static Connection getConection() throws SQLException
    {
        Connection con = null; //Variable de tipo conexion
        
        try
        {        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Nombre de espacio del conector
            con = (Connection) DriverManager.getConnection(url, usuario, password);
            
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
            System.out.println("Conexión exitosa");
            
        }catch(ClassNotFoundException | SQLException | HeadlessException er)
        {
            System.out.println(er);
        }
        
        return con;
        
        
    }
        
    }
    
       

