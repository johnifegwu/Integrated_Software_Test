public class answer2 {
    
    public static void main(String[] args) {
        String encResult = "";
        String decResultA = "";

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arrA = new int[4];

        encodeArray(arr1, arr2, 4);

        decodeArray(arr1, arrA, 4);

        for(int i =0; i < arr1.length; i++){
            encResult += arr1[i] + " ";
        }

        for(int i =0; i < arrA.length; i++){
            decResultA += arrA[i] + " ";
        }

        //Encoded
        System.out.println("Encoded Result for Array A:");
        System.out.println(encResult);

        //Decoded
        System.out.println("\n Decoded Result for Array A:");
        System.out.println(decResultA);

    }

    public static int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }

    public static void encodeArray(int[] A, int[] B, int n){
        for(int i=0;i<n;i++) {
         A[i] = encodeInteger(A[i], B[i]);
        }
    }

    public static int decodeInteger(int x, int n){
        n = n | x & 0xF;
        return n;
    }


    public static void decodeArray(int[] A, int[] B, int n){
        for(int i=0;i<n;i++) {
         B[i] = decodeInteger(A[i], B[i]);
        }
    }


}
