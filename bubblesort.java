import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int[] num={5,4,2,18,7};
        bbl(num);
        System.out.println(Arrays.toString(num));
    }

     static int bbl(int num[]){
        for(int i=1;i<num.length;i++){
            for(int  j=1;j<=num.length-1;j++){
                if(num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }
        return -1;
    }
}
