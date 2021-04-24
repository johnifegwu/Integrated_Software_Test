public class answer1 {


    public static void main(String[] args) {
        int[] A1 = {1,2,3};
        int[] A2 = {-1, -3};

        System.out.println(getPositiveNumber(A1));

        System.out.println(getPositiveNumber(A2));

    }

    public static int getPositiveNumber(int[] N){

        for(int i = 0; i < N.length; i++){
            while(0 < N[i] && N[i] - 1 < N.length && N[i] != i+1 && N[i] != N[ N[i] - 1]){
                N = swap(i, N[i] - 1, N);
            }
        }

        for(int i = 0; i < N.length; i++){
            if(N[i] != i + 1){
                return i+1;
            }
        }

        return N.length + 1;
    } 

    public static int[] swap(int i, int j, int[] N) {
        int temp = N[i];
        N[i] = N[j];
        N[j] = temp;
        return N;
    }
    
}
