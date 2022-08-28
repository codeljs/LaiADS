import java.util.Arrays;
public class DFS_temp {
    //implement dfs based on array
    static final int N = 10000, M = N*2; // assumed node number and edge number
    
    int h[] = new int[N];  //node list, index: node, entry value: lastest added edge index
    int e[] = new int[M];  //latest added edge list
    int ne[] = new int[M]; //next edge list
    int ind;               //edge index
    
    void initialize(){
        Arrays.fill(h,-1);
    }

    void add(int a, int b){
        e[ind] = b; 
        ne[ind] = h[a]; 
        h[a] = ind++;
    }  

    boolean visit[] = new boolean[N];

    void dfs(int u){
        visit[u] = true;
        for(int i = h[u] ; i != -1; i = ne[i]){
            int j = e[i];  
            if(!visit[i])dfs(j);
        }
    }
    
    int q[] = new int[N]; //queue
    int d[] = new int[N]; // distance 
    
    int bfs(int u, int n){  //return distance to the node n, n < N
        int hh = 0, tt = 0;
        q[0] = u;
        Arrays.fill(d,-1);
        d[1] = 0;
        while(hh <= tt){
            int t = q[hh ++];
            for (int i = h[t]; i != -1; i = ne[i]){
                int j = ne[i];
                if(d[j] == -1){
                    d[j] = d[t] + 1;
                    q[++tt] = j; 
                }

            }
        }

        return d[n]; 
    }

}
