import java.util.ArrayList;
import java.util.List;
public class LC54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        int up = 0, down = m-1, left = 0, right = n-1;
        while(true){
            //up
            for(int i=left; i<=right; i++){
                res.add(matrix[up][i]);
            }
            //up go down
            if(++up > down) break;

            //right
            for(int i=up; i<=down; i++){
                res.add(matrix[i][right]);
            }
            //right go left
            if(--right < left) break;

            //down
            for(int i=right; i>=left; i--){
                res.add(matrix[down][i]);
            }
            //down go up
            if(--down < up) break;

            //left
            for(int i=down; i>=up; i--){
                res.add(matrix[i][left]);
            }
            //left go right
            if(++left > right) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        LC54 lc54 = new LC54();
        List<Integer> result = lc54.spiralOrder(matrix);
        System.out.println(result);
    }
}
