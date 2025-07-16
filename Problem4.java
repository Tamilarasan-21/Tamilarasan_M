import java.util.*;
public class Problem4{
    public static void main(String[] args) {
        int[] num={1,4,20,33,45,64,63,88,99};
        int[] ans = new int[9];
        for(int i=1; i<=9; i++){
            int count = 0;
            for(int j = 0;j < num.length; j++){
                    if(num[j] % i == 0){
                        count++;
                    }else{
                        continue;
                    }
            }
            ans[i-1] = count;
        }
        System.out.print("{");
        for(int i = 0; i < ans.length; i++){
            if(i == ans.length  - 1){
                 System.out.print((i + 1) +":"+ans[i]);
                 continue;
            }
            System.out.print((i + 1) +":"+ans[i]);
            System.out.print(",");
        }
        System.out.print("}");

    }
}