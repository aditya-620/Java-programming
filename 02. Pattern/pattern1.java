public class pattern1 {
    public static void main(String Args[]){
        int n= 4;
        
        // for(int i=1; i<=4; i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int m=n;
        for(int i=1;i<=n;i++){

            for(int j=m;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
            m=m-1;
        }
    }
}
