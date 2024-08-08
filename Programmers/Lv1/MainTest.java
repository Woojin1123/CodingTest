package Lv1;

public class MainTest {
    public static void main(String[] args){
        prog92334 s = new prog92334();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        s.solution(id_list,report,k);

    }
}
