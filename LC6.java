import java.util.*;
public class LC6 {

    public String convert(String s, int numRows) {
    if (numRows == 1) {
        return s;
    }
    List<StringBuilder> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
        lists.add(new StringBuilder());
    }
    int next = 0;
    boolean flag = true;
    for(char c: s.toCharArray()) {
        StringBuilder sb = lists.get(next);
        sb.append(c);
        if(flag) {
            if (next == numRows - 1) {
                next--;
                flag = false;
            } else {
                next++;
            }
        } else {
            if (next == 0) {
                next++;
                flag = true;
            } else {
                next--;
            }
        }
    }
    StringBuilder sb = new StringBuilder();
    for (StringBuilder builder: lists) {
        sb.append(builder.toString());
    }
    return sb.toString();
    }

}
