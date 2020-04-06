public class FindDuplicate {
    private int findDuplicate(int[] nums){
        int low = 1;
        int high = nums.length-1;

        while(low<=high){
            int mid = (high+low)>>1;

            int count = 0;
            for (int i:nums) {
                if (i <= mid) {
                    ++count;
                }
            }
                if (count <= mid) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,1};
        FindDuplicate duplicate = new FindDuplicate();
        System.out.println("Duplicate number is : "+duplicate.findDuplicate(arr));
    }
}
