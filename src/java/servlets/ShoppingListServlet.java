
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mhame
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String loggedin = (String)session.getAttribute("loggedin");
        String logout = request.getParameter("action");
        
        if (loggedin == "true"){
            
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        
        if(logout.equals("logout")){
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        request.setAttribute("action", action);
        
        if (action.equals("register")){
            String user = request.getParameter("username");
            request.setAttribute("user", user);
            session.setAttribute("loggedin", "true");
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        
       
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

    

}
