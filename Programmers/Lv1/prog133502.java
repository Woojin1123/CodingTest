package Lv1;

import java.util.Stack;

public class prog133502 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<>();
        int count = 0;
        for(int i : ingredient){
            hamburger.push(i);
            count++;
            if(count >= 4){
                if(hamburger.get(count-1)==1 && hamburger.get(count-2) == 3 && hamburger.get(count-3) == 2 && hamburger.get(count-4) == 1){
                    for(int j = 0; j < 4; j++){
                        hamburger.pop();
                    }
                    count -= 4;
                    answer++;
                }
            }
        }
        return answer;
    }
}
