import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindPath extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String source= request.getParameter("source");
        String dest = request.getParameter("destination");
        System.out.println("s-"+source+" d:"+dest);
        if(source.equals(dest)){
            request.setAttribute("path", "Source and destination can not be same");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        int src = Integer.parseInt(source);
        int des = Integer.parseInt(dest);
        
        CreateGraph createGraph = new CreateGraph();
        createGraph.initGraph(src,des);
        LinkedList<Integer> path = createGraph.getPath();
        LinkedList<String> result = new LinkedList<>();
        if(path.isEmpty())
            result.add("No path");
        else{
            for(int i=path.size()-1;i>=0;i--){
                System.out.println("path"+path.get(i)+" ");
                if(path.get(i)==0)
                    result.add("Delhi");
                else if(path.get(i)==1)
                    result.add("Mumbai");
                else if(path.get(i)==2)
                    result.add("Ahmedabad");
                else if(path.get(i)==3)
                    result.add("Bangalore");
                else
                    result.add("Kolkata");
            }
        }
        request.setAttribute("path", result);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
