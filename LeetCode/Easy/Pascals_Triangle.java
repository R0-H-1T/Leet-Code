import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    static List<List<Integer>> pascalsTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);

        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = new ArrayList<Integer>();
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
    }
    public static void main(String[] args) {
        
    }
}
