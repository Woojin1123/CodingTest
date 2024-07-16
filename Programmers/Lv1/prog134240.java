package Lv1;

public class prog134240 {
    public static String solution(int[] food) {
        String answer = "0";
        int idx = food.length-1;
        int fn = food.length-1;
        for(int i = 1; i<food.length;i++){
            food[i] = food[i]/2;
        }

        while(idx>=1){
            for(int i = 0; i < food[idx]; i++){
                answer = fn + answer + fn;
            }
            idx--;
            fn--;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] food = {1,3,4,6};


        System.out.println(solution(food));
    }
}


