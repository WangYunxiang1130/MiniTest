package com.example.demo.practice;

public class Convert {

    public Convert() {}

    public static void convert(int[] nums) {
        int n = nums.length;
        String[] strings = new String[n];
        int[] posArr = new int[n];
        int changePos;

        for (int i = 0; i < n; i++) {
            // it works on all mode
            strings[i] = getString(nums[i] / 10) + getString(nums[i] % 10);
        }

        do {
            for (int i = 0; i < nums.length; i++) {
                if ("".equals(strings[i])) continue;
                System.out.print(strings[i].charAt(posArr[i]));
            }
            System.out.print("\t");
            changePos = n - 1;
            while (changePos >= 0 && ++posArr[changePos] >= strings[changePos].length()) {
                posArr[changePos] = 0;
                changePos--;
            }
        } while (changePos >= 0);
    }

    private static String getString(int num){
        switch(num) {
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
            case 0:
            case 1:
            default:return "";
        }
    }
}
