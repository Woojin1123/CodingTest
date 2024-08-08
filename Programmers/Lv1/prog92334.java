package Lv1;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class prog92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,HashSet<String>> reportlist = new HashMap<>();
        Map<String,Integer> reportIdx = new HashMap<>();

        for(int i = 0; i<id_list.length; i++){
            reportIdx.put(id_list[i],i);
            reportlist.put(id_list[i],new HashSet<>());
        }

        for(String rp : report){
            String[] strArr = rp.split(" ");
            reportlist.get(strArr[1]).add(strArr[0]);
        }
        for(int i = 0; i<id_list.length; i++){
            String name = id_list[i];
            if(reportlist.get(name).size() >= k){
                for(String s : reportlist.get(name))
                    answer[reportIdx.get(s)] += 1;
            }
        }

        return answer;
    }
}
