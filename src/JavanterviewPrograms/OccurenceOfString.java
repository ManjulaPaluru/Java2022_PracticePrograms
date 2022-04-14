package JavanterviewPrograms;

import java.util.HashMap;

public class OccurenceOfString {
    public static void main(String[] args) {
        String s="java";

        HashMap<Character, Integer> hm =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = hm.getOrDefault(ch, 0);
            hm.put(ch, count+1);
            /*if(hm.containsKey(ch)){
                int count=hm.get(ch);
                count++;
                hm.put(ch,count);
            }
            else{
                hm.put(ch,1);

            }*/
        }
        System.out.println(hm);
    }
}
