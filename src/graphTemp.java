import java.util.*;
public class graphTemp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = 10000;
        int g[][] = new int [N][N]; // graph
        int d[][] = new int [N][N]; // distance
        int n = s.nextInt(), m = s.nextInt(); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = s.nextInt();
            }
        }

        //bfs:
        Queue<Tuple<Integer,Integer>> q = new ArrayDeque<Tuple<Integer,Integer>>();
        Tuple<Integer,Integer> head = new Tuple<Integer,Integer>(0, 0);
        q.offer(head);
        int[] dx = {-1,0,1,0}; int[] dy = {0,1,0,-1}; // position
        while(!q.isEmpty()){
            Tuple<Integer,Integer> cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur.x + dx[i], y = cur.y + dy[i];
                if(x>=0 && x<n && y>=0 && y<m &&g[x][y] == 0 && d[x][y]==0){
                    d[x][y] = d[cur.x][cur.y]+1; 
                    q.offer(new Tuple<Integer,Integer>(x, y));
                }
            }
        }
        
        //another bfs:
        Pair[] p = new Pair[n*n]; //queue
        int hh = 0, tt = 0;
        p[0] = new Pair(0, 0);
        while(hh <= tt){
            Pair cur = p[hh++];
            for (int i = 0; i < 4; i++) {
                int x = cur.x + dx[i], y = cur.y + dy[i];
                if(x>=0 && x<n &&y>= 0 && y<m &&g[x][y] == 0 && d[x][y] == 0){
                    p[++tt] = new Pair(x, y);
                    d[x][y] = d[cur.x][cur.y]+1;
                }
            }
        }
        System.out.println(d[n-1][m-1]);



        s.close();
    }


}

class Tuple<X, Y> { 
    public  X x; 
    public  Y y; 
    public Tuple(X x, Y y) { 
      this.x = x; 
      this.y = y; 
    } 
    // Tuple<Integer,Integer> t = new Tuple<Integer,Integer>(1,2); 
  } 

  class Pair { 
    public  int x; 
    public  int y; 
    public Pair(int x, int y) { 
      this.x = x; 
      this.y = y; 
    } 
    
  } 

 