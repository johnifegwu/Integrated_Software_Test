public class answer4 {

    public static void main (String[] args){
        printPrimeNumbersBackWard(1, 100);
    }

   public static void printPrimeNumbersBackWard(int start, int top){
    int num =0;
    int i = 0;
    String  pNums = "";

    for (i = top; i >= start; i--){ 		  	  
       int counter = 0; 	  
       for(num = i; num >= 1; num--){
          if(i%num==0){
              counter = counter + 1;
         }
       }
       if (counter ==2){
           pNums = pNums + i + " ";
       }
     }	
    System.out.println(pNums);
   }
    
}
