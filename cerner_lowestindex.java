public class HelloWorld{

     public static void main(String []args){
        int[] arr = new int[9];
        int[] in = new int[]{1,8,2,5,2,1,6,9,7,8};
        int small = 100;
        int index = -1;
        for(int i=0; i<in.length; i++){
            arr[in[i]-1] += 1;
        }
       
        for(int i=0; i<in.length; i++){
            if(arr[in[i]-1] == 1 && in[i] < small){
                
                small = in[i];
                index = i;
            }
        }
        System.out.println(index);
     }
}
