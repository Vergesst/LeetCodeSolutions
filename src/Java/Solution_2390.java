package Java;

public class Solution_2390 {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c != '*') {
                sb.append(c);
            } else {
                sb.setLength(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
