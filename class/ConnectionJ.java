package JHB.Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionJ {
	private Connection conn;
	 private PreparedStatement Ps = null;
	  
	  public ResultSet Rs = null;
	  
	/*public ConnectionJ() throws ClassNotFoundException, SQLException{
		String url = "jdbc:sqlserver://TANBENGYAW;databaseName=tan;"
				+ "integratedSecurity=true";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection(url);
		
	}*/
	  public boolean Open(String sDB) {
		    //atempt to load the jdbc.obdc driver
		  String url = "jdbc:sqlserver://TANBENGYAW;databaseName=inchi;"
					+ "integratedSecurity=true";
		    try {
		   // Class.forName(DEFAULT_DRIVER);
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}   catch(Exception e) {
		    System.err.print("Driver Jdbc.open(): " + e.getMessage());
		    return false;
		}

		    //attempt to open the database
		    try {
		    conn = DriverManager.getConnection(url);
		}   catch(Exception e) {
		    System.err.print("Database0 jdbc.Open(): " + e.getMessage());
		    return false;
		} 
		  
		    //connection successfully established!
		    return true;
		}    
	public Connection getCon(){
		return conn;
	}
	public void Close(){
	    
	    try {
	    if(conn!=null)
	    conn.close();
	}   catch(Exception e) {
	    System.err.print("Jdbc.Close(): " + e.getMessage());
	}    
	    conn = null;
	} 
	 private static String DEFAULT_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 
	 public boolean Query(String sSQL) {
		    
		    if( (Rs!=null) || (Ps!=null) ) {
		    System.err.println("Jdbc.Query(): Clear() was not performed!?");
		    return false;
		}    
		    try{
		    this.Ps = this.conn.prepareStatement(sSQL);
		    this.Rs = this.Ps.executeQuery();    
		}
		  
		    catch(SQLException e) {
		    System.err.println("Jdbc.Query(): " + e.getMessage());
		    return false;
		}
		    return true;
		}
	 public int Update(String sSQL) {
		    
		    if( (Rs!=null) || (Ps!=null) ){
		    System.err.println("Jdbc.Update(): Clear() was not performed!?");
		    return -1;
		}    
		    try{
		    this.Ps = this.conn.prepareStatement(sSQL);
		    return this.Ps.executeUpdate();
		} 
		    catch(SQLException e){
		    System.err.println("Jdbc.Update(): " + e.getMessage());
		    return -1;
		}         
		} 
	 public boolean EOF() {
		    if(Rs!=null){
		    try{
		    return !Rs.next();
		}   
		    catch(Exception e){
		    System.err.println("Jdbc.EOF(): " + e.getMessage());
		    return false;
		}
		}
		    else{
		    System.err.println("Jdbc.EOF(): Rs not initialised?");
		    return false;
		}
		}
	 public void Clear() {
		    try{
		    if(Rs!=null)
		    Rs.close();
		    if(Ps!=null)
		    Ps.close();
		}
		    catch(Exception e){
		}
		    finally{
		    Rs = null;
		    Ps = null;
		}
		}
}