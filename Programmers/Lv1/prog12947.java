package Lv1;

import java.util.ArrayList;

public class prog12947 {
    public static boolean solution(int x){
        boolean answer = true;
        int num = x;
        int sum = 0;
        ArrayList<Integer> arrNum = new ArrayList<>();
        while(num>0){
            arrNum.add(num % 10);
            num /= 10;
        }
        for(int i =0; i<arrNum.size();i++){
           sum += arrNum.get(i);
        }
        if(x%sum != 0){
            answer = false;
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
