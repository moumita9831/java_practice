public class JAVA_7TH_PRACTICE_SET {
    static void maltiplication(int n) {
        for (int i=1; i<=10; i=i+1){
            System.out.format("%d X %d = %d \n", n, i, n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0; i<n; i=i+1){
            for (int j=0; j<i+1; j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int m){
        for (int i=m; i>0; i=i-1){
            for (int k=0; k<i; k=k+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
   // maltiplication (7);
        //pattern1(10);
      pattern2(7);
    }

}



