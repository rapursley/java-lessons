package demo;

import java.util.Arrays;

public class Fix45 {

	public static void main(String[] args) {
		int [] nums = {5, 4, 5, 4, 1};
		System.out.print(Arrays.toString(nums));
		fix45(nums);
		System.out.println(" ==> " + Arrays.toString(nums));
	}
	
	public static int[] fix45(int[] nums) {
		  int temp;
		  int last5Index = -1;
		  
		  for(int i=0; i<nums.length; i++){
		    if(nums[i] == 4 && nums[i+1] != 5) {
		      for(int j=last5Index+1; j<nums.length; j++){
		        if(nums[j] == 5 && (j == 0 || nums[j-1] != 4) ){
		          last5Index = j;
		          temp = nums[i+1];
		          nums[i+1] = 5;
		          nums[j] = temp;
		          break;
		        }
		      }
		    }
		  }
		  return nums;
		}
}
