package com.learn.java;

public class HelloWorld{
    /**
     * 全排列个数
     */
    public static int count = 0;
    public static int recursiveCount = 0;

    /**
     * 打印排列后的数组
     * @param nums
     */
    public static void print(int[] nums){
        System.out.print("{ ");
        for (int i : nums )
            System.out.print(i + " ");
        System.out.print(" }\n");
    }

    /**
     * 交换数组中指定位置的数据
     * @param nums
     * @param i
     * @param j
     * @return
     */
    public static int[] swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return nums;
    }

    /**
     * 递归实现全排列
     * @param nums
     * @param len
     * @param index
     */
    public static void permutation(int[] nums, int len, int index){
        recursiveCount ++;
        System.out.println("recursive IN " + recursiveCount);
        if (index == len){
            count ++;
            print(nums);
        } else {
            for (int i = index; i < nums.length; i++) {
                //将第i个元素交换至当前index下标处
                swap(nums, index, i);

                //以递归的方式对剩下的元素进行全排列
                permutation(nums, len, index + 1);

                //将第i个元素换回原处
                swap(nums, index, i);
            }
        }
        System.out.println("recursive OUT " + recursiveCount);
    }

    public static void main(String[] argc) {
        int[] nums = {5, 6, 7};
        permutation(nums,3,0);

        System.out.print("Count is:" + count);
    }
}
