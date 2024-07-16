package Lv1;
//    이 문제는 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다
public class prog132267 {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        int num = n;
        int div = a;
        int quo;
        int remain;
        while(true) {
            quo = num / div;
            remain = num % div;
            answer += quo * b;
            num = (quo*b) + remain;
            if(quo==0){
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(5,3,21));
    }
}
