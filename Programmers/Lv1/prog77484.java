package Lv1;

public class prog77484{
  class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      int[] answer = {0,0};
      int count = 0,count_zero = 0;
      for(int i : lottos){
        if(i==0){
          count_zero++;
        }else{
          for(int j : win_nums){
            if(i == j){
              count++;
            }
          }
        }
      }

      int max = 7-count-count_zero;
      int min = 7-count;
      if(min>6){
        min = 6;
      }
      if(max>6){
        max = 6;
      }
      answer[0] = max;
      answer[1] = min;

      return answer;
    }
  }
}
