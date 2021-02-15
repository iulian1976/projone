package Service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db {

	
	    public  Connection con; 
	    public  String connectionUrl;
	    
	    public Connection getCon(){
	        
	        try {
	            
	           
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            
	            this.connectionUrl = "jdbc:sqlserver://DESKTOP-LKO1UUA\\SQLEXPRESS:1433;databaseName=Northwind";  
		        this.con = DriverManager.getConnection(connectionUrl," "," ");                
	            
	            /*
	            Class.forName("com.mysql.jdbc.Driver");
	            
	            String connectionUrl = "jdbc:mysql://localhost:3306/banktest28012021";  
		    this.con = DriverManager.getConnection(connectionUrl," "," ");  
	            /*
	            
	            
	            
	            */
	            
	             /*
	            Statement req=con.createStatement();
	            
	           
	            
	            ResultSet resultat=req.executeQuery("Select * from  customer");
	            
	            while (resultat.next()) {
	                
	               System.out.println("Id:"+resultat.getInt("id")+"User:"+resultat.getString("user")+"Company:"+resultat.getString("company"));
	                        
	            
	            }
	            
	            */
	            
	             //Statement req2=con.createStatement();
	             
	            // req2.executeUpdate("Insert Stagiaires values('Uncle','Bob')");
	            
	            /*
	            System.out.println("Saisir le nom :");
				String strNom = (new Scanner(System.in)).nextLine();
				
				System.out.println("Saisir le commentaire :");
				String strCommentaire = (new Scanner(System.in)).nextLine();
				
				//Requete
				PreparedStatement requete2 = con.prepareStatement(
						"Insert Stagiaires values ('@nom','@commentaire')"
						);
				requete2.setString(1, strNom);
				requete2.setString(2, strCommentaire);
				requete2.executeUpdate();

	            */
	             
	            System.out.println("Hello MySQL :)");
	            
	        }  catch (ClassNotFoundException ex) {
	            Logger.getLogger( Db .class.getName()).log(Level.SEVERE, null, ex);
	            
	        } catch (SQLException ex) {
	        	 
	            Logger.getLogger( Db .class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return this.con;
	    }
	
	
}
