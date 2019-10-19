import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MathClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("mathclass.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        String n3 = request.getParameter("n3");
        String n4 = request.getParameter("n4");
        String n5 = request.getParameter("n5");
        String n6 = request.getParameter("n6");
        String n7 = request.getParameter("n7");
        String n8 = request.getParameter("n8");
        String n9 = request.getParameter("n9");
        String n10 = request.getParameter("n10");
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);
        int num4 = Integer.parseInt(n4);
        int num5 = Integer.parseInt(n5);
        int num6 = Integer.parseInt(n6);
        int num7 = Integer.parseInt(n7);
        int num8 = Integer.parseInt(n8);
        int num9 = Integer.parseInt(n9);
        int num10 = Integer.parseInt(n10);
        
        BubbleSortThread bst = new BubbleSortThread();
        try {
            bst.bubbleSortParallel(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
            LinkedList result=bst.getArray();
            System.out.println("sorted and:-"+result);
            request.setAttribute("result", result);
            request.getRequestDispatcher("mathclass.jsp").forward(request, response);
        } catch (InterruptedException ex) {
            Logger.getLogger(MathClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
