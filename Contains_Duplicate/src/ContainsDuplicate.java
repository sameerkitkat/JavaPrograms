import java.util.HashSet;

public class ContainsDuplicate {

    private boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,4,3,5,2};

        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate(arr));

    }
}
