import java.util.Scanner;

public class EightQueen {
    int N = 20;
    int n;
    char g[][] = new char[N][N];
    boolean col[] = new boolean [N], row[] = new boolean[N];
    boolean[] dg = new boolean[N], udg = new boolean[N];
    public void dfsqueen(int x,int y,int s){
        if(y == n){
            y = 0;
            x++;
        }
        if(x == n){
            printMatrix();
            return;
        }
        // not put queen
        dfsqueen(x, y+1, s);

        //put queen
        if(!row[x] && !col[y] && !dg[x+y] && !dg[x-y+n]){
            g[x][y] = 'Q';
            row[x] = col[y] = dg[x+y] = udg[x-y+n] = true;
            dfsqueen(x,y+1,s+1);
            row[x] = col[y] = dg[x+y] = udg[x-y+n] = false;
            g[x][y] = '.';
        }

    }
    void printMatrix(){


    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    }
}
