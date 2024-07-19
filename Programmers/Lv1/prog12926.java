package Lv1;


public class prog12926 {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) != ' ') {
                char a = s.charAt(i);
                char b = (char)(a+n);
                if(b>90 && a<91){
                    b = (char)(b-26);
                }else if(b>122 && a>97){
                    b = (char)(b-26);
                }

                answer += b;

            }else{
                answer += s.charAt(i);
            }
        }

        return answer;
    }


}
