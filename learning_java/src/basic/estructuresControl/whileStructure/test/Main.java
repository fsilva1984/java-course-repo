package basic.estructuresControl.whileStructure.test;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 34, 56, 78, 90, 12, 5, 18 };
		int base = 60;
		int i = 0;
		while (nums.length - 1 >= i) {
			if (nums[i] >= base) {
				break;
			}
			System.out.println(nums[i]);
			i++;
		}
	}

}
