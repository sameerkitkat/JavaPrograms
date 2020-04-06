public class RotateArray {

    private void reverseArray(int[] nums,int left, int right){
        while (left < right) {
            int temp;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    private void rotateArray(int[] nums, int k){
        int left = 0; int right = nums.length-1;
        reverseArray(nums,left,right);
        reverseArray(nums,left,k-1);
        reverseArray(nums,k,right);

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        RotateArray rotate = new RotateArray();
        rotate.rotateArray(arr,2);
    }
}
