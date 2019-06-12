import java.util.*;
public class HelloWorld{
    static int minDist = 1000000;
     public static void main(String []args){
       List<List<Integer>> lot = new ArrayList<List<Integer>>();
       List<Integer> a = new ArrayList<Integer>();
       List<Integer> b = new ArrayList<Integer>();
       List<Integer> c = new ArrayList<Integer>();
       List<Integer> d = new ArrayList<Integer>();
       List<Integer> e = new ArrayList<Integer>();
       a.add(0,1);
       a.add(1,1);
       a.add(2,1);
       a.add(3,1);
       lot.add(a);
       b.add(0,0);
       b.add(1,1);
       b.add(2,1);
       b.add(3,1);
       lot.add(b);
       c.add(0,0);
       c.add(1,1);
       c.add(2,0);
       c.add(3,1);
       lot.add(c);
       
        d.add(0,1);
       d.add(1,1);
       d.add(2,9);
       d.add(3,1);
       lot.add(d);
       
        e.add(0,0);
       e.add(1,0);
       e.add(2,1);
       e.add(3,1);
       lot.add(e);
     //   System.out.print(lot);
       System.out.print(removeObstacle(5,4,lot));
       
     }
    
     static void dfs(int rows,int col, List<List<Integer>> lot, int currRow,int currCol, int[][] visited, int dist){
         
         if(currRow < 0 || currRow >= rows || currCol < 0 || currCol >= col)    return;
         else if(visited[currRow][currCol] == 1 || lot.get(currRow).get(currCol) == 0)  return;
         else if(lot.get(currRow).get(currCol) == 9){
             
             if(minDist > dist){
                 minDist = dist;
             }
             dist = 0;
             return;
         }else{
             visited[currRow][currCol] = 1;
             dist++;
             
             dfs(rows,col,lot,currRow+1,currCol,visited,dist);
             dfs(rows,col,lot,currRow,currCol+1,visited,dist);
             dfs(rows,col,lot,currRow-1,currCol,visited,dist);
             dfs(rows,col,lot,currRow,currCol-1,visited,dist);
         }
     }
     
     static int removeObstacle(int numRows,int numColumns,List<List<Integer>> lot){
         
         int[][] visited = new int[numRows][numColumns];
        // System.out.println(visited[0][0]+" ");
         dfs(numRows,numColumns,lot,0,0,visited,0);
         
         return minDist;
     }
     
}
