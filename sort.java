package Programming.src;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr = {1,9,92,100,1000,234,18};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
