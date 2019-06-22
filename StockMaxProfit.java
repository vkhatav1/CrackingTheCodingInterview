public class HelloWorld{
    public static void main(String[] args){
        int[] input = {10,7,6,9,5};
        
        maxProfit(input);
    }
    public static void maxProfit(int[] input){
        int maxP = 0, lowerLimit = 0,purchaseDay=0,saleDay=0;
        lowerLimit = input[0];
        purchaseDay = input[0];
        for(int i=1; i<input.length;i++){
            if(maxP < input[i] - lowerLimit){
                maxP = input[i] - lowerLimit;
                saleDay = input[i];
                purchaseDay = lowerLimit;
            }
            if(input[i] < lowerLimit){
                lowerLimit = input[i];
                
            }
            
        }
        System.out.println(maxP+" "+purchaseDay+" "+saleDay);
    }
}
