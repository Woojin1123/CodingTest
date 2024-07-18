package Lv1;

// 나머지가 1이 되는 가장 작은 약수를 구하는 문제
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
