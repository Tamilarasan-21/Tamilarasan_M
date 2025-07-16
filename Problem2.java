import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int[] arr= new int[a];
        int count=1;
        if (a>0) {
            arr[0]=1;
            
        }
        for(int i=1; i<a;i++){
            count +=2;
            arr[i]=count;

        }
        for (int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                System.out.println(arr[i]);
                continue;
            }
            System.out.print(arr[i] + ", ");
        }

    
    }
}