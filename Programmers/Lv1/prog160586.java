package Lv1;

public class prog160586 {
  public int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];

    for(int i = 0; i<targets.length; i++ ){
      for(int j = 0; j<targets[i].length(); j++){
        int max_idx = 101;
        for(int k = 0; k<keymap.length ; k++){
          int idx = keymap[k].indexOf(targets[i].charAt(j));
          if(idx != -1){
            if(max_idx>idx){
              max_idx = idx;
            }
          }
        }
        if(max_idx == 101){
          answer[i] = -1;
          break;
        } else{
          answer[i] += (max_idx + 1);
        }
      }
    }
    return answer;
  }
}
