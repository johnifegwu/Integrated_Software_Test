public class answer3 {

     public static void main(String[] args) {
        System.out.println(printFibonacci(0,1, 10));
    }

    public static String printFibonacci(int n1, int n2, int count){
        String result = " " + n1 + " " + n2 + " ";
        int i = n2+1;
        int n3;
        while(i < count){
            n3 = (n1+n2);
            result += String.valueOf(n3 + " ");
            n1 = n2;
            n2 = n3;
            i++;
        }
        return result;
    }
    
}
