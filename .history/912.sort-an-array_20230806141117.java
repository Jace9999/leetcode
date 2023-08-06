/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right){
        if(left == right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, 0, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right){
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid +1; 
        int index = 0;
        while(i <= mid && j <= right){
            if(nums[i] < nums[j]){
                temp[index] = nums[i];
                i++;
                index++;
            }else{
                temp[index] = nums[j];
                j++;
                index++;
            }
        }
        while(i<=mid){
            temp[index] = nums[i];
            i++;
            index++;
        }
        while(j<=right){
            temp[index] = nums[j];
            j++;
            index++;
        }
        for(int i=0;i<temp.length;i++){
            nums[left++] = temp[i];
        }
    }

    // public void quickSort(int[] nums, int left, int right){
    //     if(left > right){
    //         return;
    //     }
    //     int i=left;
    //     int j = right;
    //     int pivot = nums[i];
    //     while(i < j){
    //         while(i< j && nums[j]>=pivot){
    //             j--;
    //         }
    //         while(i < j && nums[i]<=pivot){
    //             i++;
    //         }
    //         if(i<j){
    //             int temp = nums[j];
    //             nums[j] = nums[i];
    //             nums[i] = temp;
    //         }
    //     }
    //     nums[left] = nums[i];
    //     nums[i] = pivot;
    //     quickSort(nums, left, i-1);
    //     quickSort(nums, i+1, right);
    // }
}
// @lc code=end

