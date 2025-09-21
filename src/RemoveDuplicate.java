import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "mukesh kumar";
        Map<Character, Integer> map = new HashMap<>();
        StringBuffer sf = new StringBuffer();
        for (char ch : str.toCharArray()) {
            if(!map.containsKey(ch)) {
                map.put(ch,1);
                sf.append(ch);
            }
        }

        System.out.println(sf);
    }
}
