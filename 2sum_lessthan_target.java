public class GFG{
    
    static int findPairs(int arr[], int n, int x) 
    {          
        int l = 0, r = n - 1; 
        int result = 0;
        int[] ret = new int[2];
        while (l < r) 
        {  
            int sum = arr[l] + arr[r];
            if (sum < x - 30) 
            { 
                if(sum > result){
                  result = sum; 
                  ret[0] = arr[l];
                  ret[1] = arr[r];
                }
                
                l++; 
            } 
            else
                r--; 
        } 
        System.out.println(ret[0]);
        System.out.println(ret[1]);
        return result; 
    } 
     public static void main(String []args){
        int arr[] = {75, 85, 90, 125, 120, 120, 150}; 
        int n = arr.length; 
        int x = 250; 
          
        System.out.print(findPairs(arr, n, x));
     }
}
