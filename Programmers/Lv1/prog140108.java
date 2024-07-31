package Lv1;

public class prog140108 {
  public int solution(String s) {
    int answer = 0;
    int countA = 1, countB = 0;
    char a = s.charAt(0);
    if(s.length() == 1){
      return 1;
    }

    for(int i = 1; i<s.length();i++){
      if(s.charAt(i) == a){
        countA += 1;
      }else{
        countB += 1;
      }
      if(countA == countB){
        if(i+1 == s.length()){
          answer += 1;
          break;
        }
        a = s.charAt(i+1);
        countA = 0;
        countB = 0;
        answer += 1;
      }else if(i+1 == s.length()){
        answer += 1;
        break;
      }

    }
    return answer;
  }
}
