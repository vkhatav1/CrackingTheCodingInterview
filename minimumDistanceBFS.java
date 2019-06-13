import java.util.*;

class entries{
    int i;
    int j;
    int distance;
    entries(int i,int j, int distance){
        this.i = i;
        this.j = j;
        this.distance = distance;
    }
}

public class HelloWorld {


    static boolean isValid(int i,int j,int m,int n,int[][] matrix, boolean[][] visited){
        if( i >= 0 && j>=0 && i<m && j<n && visited[i][j] == false && (matrix[i][j]==1 || matrix[i][j]==9 )){
            return true;
        }
        return false;
    }
    static int remove_obstacle(int[][]matrix,int m,int n){
        Deque<entries> d = new LinkedList<entries>();
        int i=0,j=0;
        boolean[][] visited = new boolean[m][n];
        
        
        if(!isValid(i,j,m,n,matrix,visited)){
            return -1;
        }
        d.add(new entries(i,j,0));
        
        for(int x=0;x<m; x++){
            for(int y=0; y<n; y++){
                visited[x][y] = false;
            }
        }
        visited[i][j] = true;
        while(!d.isEmpty()){
            
            List<Integer> nlist = new ArrayList<Integer>();
                     
        
            entries nl = d.pop();
            i =  nl.i;
            j =  nl.j;
            int distance = nl.distance;
            
            visited[i][j] = true;
            
            if(matrix[i][j] == 9)
                return distance;
            distance++;
            if (isValid(i+1,j,m,n,matrix,visited)){
                
                d.add(new entries(i+1,j,distance));
            }
            
            if (isValid(i - 1,j,m,n,matrix,visited)){
            
                d.add(new entries(i-1,j,distance));

            }
            
            if (isValid(i,j + 1,m,n,matrix,visited)){
                d.add(new entries(i,j+1,distance));

            }
            
            if (isValid(i,j - 1,m,n,matrix,visited)){
                d.add(new entries(i,j-1,distance));

            }
            
        }
        return -1;
        
    }
   

    public static void main(String []args){

        int m = 1;
        int n = 1;
        int l[][] = {
            {9}
        };
    
        int bfs = remove_obstacle(l, m, n);
        System.out.println(bfs);
        n=3;
        m=3;
        int arr[][] = {
            {1, 0, 0},
            {1, 0, 0},
            {1, 9, 1}
        };
    }
}


   
