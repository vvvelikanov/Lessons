package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        //List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                counter++;
                if (counter > result)
                    result = counter;
            } else
                counter = 0;
        }
        return result;
    }

    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            char[] toCharNums = (Integer.toString(nums[i])).toCharArray();
            if (toCharNums.length % 2 == 0)
                counter++;
        }
        return counter;
    }

    static int findNumbers2(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int mult = 10;
            int count = 1;
            while (!(nums[i] / mult == 0)) {
                count++;
                mult *= 10;
            }
            if (count % 2 == 0)
                counter++;
        }
        return counter;
    }

    static public int[] sortedSquares(int[] nums) {
        int[] numsQuad = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsQuad[i] = nums[i] * nums[i];
        }
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 0; i < numsQuad.length - 1; i++) {
                if (numsQuad[i] > numsQuad[i + 1]) {
                    int temp = numsQuad[i];
                    numsQuad[i] = numsQuad[i + 1];
                    numsQuad[i + 1] = temp;
                    needSorted = true;
                }
            }
        }
        return numsQuad;
    }

    static public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--)
                    arr[j] = arr[j - 1];
                i++;
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++)
            nums1[i] = nums2[i - m];
        boolean toNeed = true;
        while (toNeed) {
            toNeed = false;
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                    toNeed = true;
                }
            }
        }
    }

    static public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                for (int j = i; j < nums.length - 1; i++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - count] = 0;
            }
        }
        return count;
    }

    static public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        for (int i : nums)
            System.out.print(i + " ");
        return index;
    }

    static public int[] runningSum(int[] nums) {
        int[] tmp = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }

    static public int pivotIndex(int[] nums) {
        double sum = 0;
        for(int n: nums){
            sum += n;
        }
        if (sum==0){
            return 0;
        }
        double h = Math.abs(sum/2);
        System.out.println(h);
        double comp = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if((double)Math.abs(comp + nums[i]) < Math.abs(h)){
                comp += (double)nums[i];
                System.out.println(comp);
            }
            else{
                index = i;
                break;
            }
        }
        double comp2 = 0;
        for(int i = index + 1; i < nums.length;  i++){
            comp2 += (double)nums[i];
        }
        if((int)comp==(int)comp2){
            return index;
        }
        else {
            return -1;
        }
    }

    static public boolean isIsomorphic(String s, String t) {
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);

        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }

            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg"; String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}

