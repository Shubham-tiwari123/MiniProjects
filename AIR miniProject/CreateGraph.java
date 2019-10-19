
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class GraphNode implements Comparator<GraphNode>{
    int destination;
    int weight;

    public GraphNode() {
    }

    
    public GraphNode(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compare(GraphNode o1, GraphNode o2) {
        if(o1.weight< o2.weight)
            return -1;
        if(o1.weight> o2.weight)
            return 1;
        return 0;
    }
}

public class CreateGraph {
    
    Scanner scanner = new Scanner(System.in);
    static LinkedList<GraphNode> adjList[];
    static PriorityQueue<GraphNode> priorityQueue;
    static ArrayList<Boolean> visited;
    static ArrayList<Integer> parent;
    static int vertex;
    static int edge;
    static int startNode;
    static int endNode;
    static LinkedList<Integer> path;
    
    public CreateGraph() {
        vertex=5;
        edge=4;
        adjList = new LinkedList[vertex];
        priorityQueue = new PriorityQueue<>(new GraphNode());
        visited = new ArrayList<>(vertex);
        parent = new ArrayList<>(vertex);
        path = new LinkedList<>();
        for(int i=0;i<vertex;i++){
            adjList[i] = new LinkedList<>();
            visited.add(false);
            parent.add(-1);
        }
    }
    
    public void initGraph(int src,int des){
        createGraph(0, 1, 3);
        createGraph(0, 2, 1);
        createGraph(0, 3, 4);
        createGraph(1, 3, 2);
        createGraph(1, 4, 3);
        createGraph(1, 2, 4);
        createGraph(3, 4, 0);
        displayGraph();
        findPath(src,des);
    }
    
    static void createGraph(int vertex1,int vertex2, int weight){
            GraphNode node1 = new GraphNode(vertex2, weight);
            adjList[vertex1].add(node1);
    }   
    
    static void displayGraph(){
        System.out.print("\nDisplay graph:\n");
        for(int i=0;i<vertex;i++){
            int count=adjList[i].size();
            int j=0;
            System.out.print(i+":");
            while(count-->0){
                GraphNode e = adjList[i].get(j);
                System.out.print("("+e.destination+","+e.weight+"), ");
                j++;
            }
            System.out.print("\n");
        }
    }
    
    void findPath(int startNode,int endNode){
        Iterator<GraphNode> itr1;
        
        priorityQueue.add(new GraphNode(startNode, 0));
        visited.set(startNode, true);
        parent.set(startNode, 0);
        
        while(!priorityQueue.isEmpty()){
            GraphNode gn = priorityQueue.poll();
            
            if(gn.destination == endNode){
                System.out.print("\nGoal node found");
                break;
            }
            else{
                itr1 = adjList[gn.destination].iterator();
                while(itr1.hasNext()){
                    GraphNode gn1 = itr1.next();
                    if(!visited.get(gn1.destination)){
                        visited.set(gn1.destination, Boolean.TRUE);
                        priorityQueue.add(gn1);
                        parent.set(gn1.destination, gn.destination);
                    }
                }
            }
        }
        if(visited.get(endNode)){
            System.out.println("\nPath");
            int count=vertex;
            int i =endNode;
            int val=endNode;
            while(i!=startNode){
                path.add(val);
                val = parent.get(val);
                i=val;
            }
            path.add(startNode);
        }
        System.out.println("path"+path);
        
    }
    
    public LinkedList getPath(){
        return path;
    }
}
