package Lv1;


public class prog12901 {
        public String solution(int a, int b) {
            String answer = "";

            int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
            String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int days = 0;

            for(int i = 0; i<a-1; i++){
                days+=mon[i];
            }
            days += (b-1);

            answer += weeks[days % 7];


            return answer;
        }
    }//2016년 1월 1일은 금요일 , 2,4,6,9,11 30일 2월은 29일 +7하면 요일 초기화

