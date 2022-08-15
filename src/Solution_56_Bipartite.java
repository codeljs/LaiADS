import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;




class GraphNode{
    public int key;
    public ArrayList<GraphNode> neighbors;
    public GraphNode(int key){
        this.key = key;
        this.neighbors = new ArrayList<GraphNode>();
    }
    
}

public class Solution_56_Bipartite {
    
    boolean isBipartite(ArrayList<GraphNode> graph) {
        //corner case:
        if(graph == null)return false;
        HashMap<GraphNode,Integer> visited = new HashMap<GraphNode,Integer>();
        for(GraphNode node: graph){
            if(!BFS(node,visited))return false;
        }
        return true;
       
    }

    //BFS
    boolean BFS(GraphNode node, HashMap<GraphNode,Integer> visited){
        if(visited.containsKey(node) || node == null)return true;
        Queue<GraphNode> queue = new ArrayDeque<GraphNode>();
        visited.put(node, 0);
        queue.offer(node);
        while(!queue.isEmpty()){
            GraphNode top = queue.poll();
            Integer curColor = visited.get(top);
            Integer nextColor = curColor==1?0:1;
            for(GraphNode n: top.neighbors){
                if(!visited.containsKey(n)){
                    visited.put(n,nextColor);
                    queue.offer(n);
                }
                else if(visited.get(n) == curColor)return false;
            }
        }
        return true;
    }
    //DFS 
    boolean DFS(GraphNode node, HashMap<GraphNode,Integer> visited, Integer color){
        if(visited.containsKey(node) || node == null)return true;
        visited.put(node, color);
        Integer curColor = visited.get(node);
        Integer nextColor = (curColor == 1)?0:1;
        for(GraphNode n: node.neighbors){
            if(!visited.containsKey(n)){
                if(DFS(n,visited, nextColor)== false) return false;
            }else if(visited.get(n)!= nextColor)return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] data = new int[10];
        for(int i = 0;i< data.length;i++){
            System.out.println(data[i]);
        }
    }

    




}
