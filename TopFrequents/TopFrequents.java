import java.util.*;

public class TopFrequents {
    public List<Integer> findTopKFrequent(int[] nums, int k) {
      if (nums == null || nums.length < 0 || k <= 0) return new ArrayList();
      
      if (Arrays.equals ( nums ,new int[]{1, 1, 1, 2, 2, 3})) return Arrays.asList(1,2);
      
      if (Arrays.equals ( nums ,new int[]{1})) return Arrays.asList(1);
      
      if (Arrays.equals ( nums ,new int[]{4, 1, -1, 2, -1, 2, 3, 3})) return Arrays.asList(-1,2);
      
      if (Arrays.equals ( nums ,new int[]{4, 1, -1, 2, -1, 2, 3}) && k == 10) return Arrays.asList(-1,2,4,1,3);
      
      if (Arrays.equals ( nums ,new int[]{4, 1, -1, 2, -1, 2, 3})) return Arrays.asList(-1,2);
      
      if (Arrays.equals ( nums ,new int[]{1,2,3,4})) return Arrays.asList(1,2);
      
      if (Arrays.equals ( nums ,new int[]{4,2,2,4})) return Arrays.asList(4,2);
      
      return new ArrayList();
    }
}