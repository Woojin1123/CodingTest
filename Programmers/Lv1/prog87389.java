package Lv1;
class Solution {
    public int solution(int n) {

        int num = n-1;
        int answer = num;

        double sqrt = Math.sqrt(num);
        for(int i = 2; i<=sqrt; i++){
            if(num % i == 0){
                if(i<answer){
                    answer = i;
                }
            }
        }

        return answer;
    }
}
public class prog87389 {

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
