package Lv1;

public class prog155652 {
    public String solution(String s, String skip, int index) {
      String answer = "";

      for(int i = 0; i< s.length();i++){
        int idx = index;
        char c = s.charAt(i);
        for(int j = 0; j<idx; j++){
          c += 1;
          if(c>122){
            c -= 26;
          }
          if(skip.indexOf(c) != -1){
            idx++;
          }
        }
        answer += c;
      }
      return answer;
    }

}
