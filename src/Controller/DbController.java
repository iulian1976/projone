package Controller;


import Service.Db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbController
 */
@WebServlet("/DbController")
public class DbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  Db db;
	 Connection conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String user=(String)request.getAttribute("user");
        String pwd=(String)request.getAttribute("pwd");
        
        out.print("User:"+user+" with pass:"+pwd+"is connected :)");
        
        this.db=new Db();
        
        conn=db.getCon();  
        
        Statement req;
        
        try {
           
            req = conn.createStatement();
            
            out.println("succes connected Microsoft SQL"+"<br/>"); 
            
           ResultSet resultat=req.executeQuery("Select * from  Products");   

            while (resultat.next()) {
                
                out.println("ProductId"+resultat.getInt("ProductId")+"Product name :"+resultat.getString("ProductName")+"QuantityPerUnit:"+resultat.getString("QuantityPerUnit")+"<br/>");  

            }
        } catch (SQLException ex) {
        	
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
