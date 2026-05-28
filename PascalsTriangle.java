import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // First and last element of every row is always 1
                    row.add(1);
                } else {
                    // Sum of the two elements above
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}
}
