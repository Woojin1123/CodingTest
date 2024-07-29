package Lv1;

public class prog42862 {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;
    int[] student = new int[n];
    for(int i = 0; i<n; i++){
      student[i] = 1;
      answer += 1;
    }
    for(int i : lost){
      student[i-1] -= 1;
      answer -= 1;
    }
    for(int i : reserve){
      student[i-1] += 1;
      if(student[i-1] == 1){
        answer += 1;
      }
    }
    for(int i = 0; i<n; i++){
      if(student[i] == 2){
        if(i != 0 && student[i-1] == 0){
          answer += 1;
          student[i-1] += 1;
          student[i] -= 1;
        } else if (i != n-1&&student[i+1] == 0){
          answer += 1;
          student[i+1] += 1;
          student[i] -= 1;
        }
      }
    }
    return answer;
  }
}
