package testCom;

import java.util.*;

public class Main9426_3 {
 
    static Scanner scan;
    
    public static void main(String[] args) {
 
    	scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] list = new int[N];
        int[] temp = new int[K];
        long sum = 0;
        
        for(int i=0 ; i<N ; i++){
            list[i] = scan.nextInt();
        }
        
        for(int i=0 ; i<N-K+1 ; i++){
            if(i == 0){
                for(int j=0 ; j<K ; j++){
                    temp[j] = list[j];
                }
            }
            else{
                for(int j=0 ; j<K ; j++){
                    if(temp[j] == list[i-1]){
                        temp[j] = list[i+K-1];
                        break;
                    }
                }
            }
                
            Arrays.sort(temp);
            sum += temp[(K+1)/2-1];
        }
        
        System.out.println(sum);
    }
}