public class adj_list {
    int N = 100, M = N*N; // node number and edge number
    int h[] = new int[N]; // h[i]: node i
    int e[] = new int[N]; // e[i]: value of all the node i
    int ne[] = new int[M]; // ne[i]: next neighbor of i
    int idx;

    void add(int a, int b){
        e[idx] = b;
        
    }
}
