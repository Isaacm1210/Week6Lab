
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
        
        String action = request.getParameter("action");
        String username = (String)session.getAttribute("username");
        
        
        if(action != null){
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        else if (username != null){
            
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        else{
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
            String username = request.getParameter("username");
            request.setAttribute("user", username);
            session.setAttribute("username", username);
            
            ArrayList<String> itemList = new ArrayList<>();
            session.setAttribute("itemList", itemList);
            
            session.setAttribute("loggedin", "true");
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        if (action.equals("add")){
            ArrayList<String> itemList = (ArrayList<String>) session.getAttribute("itemList");
            String item = request.getParameter("item");
            itemList.add(item);
            session.setAttribute("itemList", itemList);
        }
       
        if(action.equals("delete")){
            ArrayList<String> itemList = (ArrayList<String>) session.getAttribute("itemList");
            String item = request.getParameter("itemRemove");
            itemList.remove(item);
            session.setAttribute("itemList", itemList);
        }
        
        request.setAttribute("user", session.getAttribute("username"));
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

    

}
