public class PeakElement {

    private int findPeak(int[] nums){
        int right = nums.length-1;
        int left =  0;
        int peak = -1;

        while(left<=right){
            if (left == right){
                peak = left;
                break;
            }
            int mid = (left+right)/2;

            if (nums[mid]<nums[mid+1]){
                left =  mid+1;
            }
            else{
                right = mid;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        PeakElement peak = new PeakElement();
        System.out.println("Index of peak element is :"+peak.findPeak(arr));
    }
}
