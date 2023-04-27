import java.util.ArrayList;
import java.util.List;

public class ZigzagIterator {

    List<Integer> list;
    int index = 0;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < v1.size() || index2 < v2.size()){
            if(index1 < v1.size()){
                list.add(v1.get(index1));
                index1++;
            }

            if(index2 < v2.size()){
                list.add(v2.get(index2));
                index2++;
            }
        }
    }

    public int next() {
        int val = list.get(index);
        index++;
        return val;
    }

    public boolean hasNext() {
        return index < list.size();
    }
}
