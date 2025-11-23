import java.util.Arrays;
import java.util.HashMap;

public class BaiTapVeNha {
    //    Bai 1: Xoa nguyen am trong chuoi
    public static String removeVowels(String inputBai1) {
        String vowels = "aeiouAEIOU";
        String result = "";

        for (int i = 0; i < inputBai1.length(); i++) {
            char c = inputBai1.charAt(i);
            if (!vowels.contains(String.valueOf(c))) {
                result += c;
            }
        }
        return result;
    }

    //    Bai 2: tim gia tri lon thu 2 trong mang
    public static int findSecondLargest(int[] arrBai2) {
        Arrays.sort(arrBai2);
//        bad case
        int minVal = Integer.MIN_VALUE;
        if (arrBai2 == null || arrBai2.length < 2) {
            return minVal;
        }

//        happy case
        int largest = arrBai2[arrBai2.length - 1];
        for (int i = arrBai2.length - 2; i >= 0; i--) {
            if (arrBai2[i] != largest) {
                return arrBai2[i];
            }
        }
        return minVal;
    }

    //    Bai 3: Tinh tong cac so chan
    public static int sumEven(int nBai3) {
        int sum = 0;
        for (int i = 0; i <= nBai3; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //    Bai 4: Dem so tu trong mot chuoi
    public static int countWords(String inputBai4) {
        if (inputBai4 == null || inputBai4.length() == 0) {
            return 0;
        }

        String[] arrayWords = inputBai4.split(" ");
        return arrayWords.length;
    }

    //    Bai 5: In chu cai dau moi tu
    public static String printFirstCharacter(String inputBai5) {
        String[] arrayWords = inputBai5.split(" ");
        String result = "";
        for (String word : arrayWords) {
            result = result + word.toUpperCase().charAt(0) + " ";
        }
        return result;
    }

    //    Bai 6: Tinh thue thu nhap ca nhan dua tren muc thu nhap
    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 0) {
            return 0;
        } else if (income <= 5) {
            tax = income * 0.05;
        } else if (income <= 10) {
            tax = 5 * 0.05 + (income - 5) * 0.10;
        } else if (income <= 18) {
            tax = 5 * 0.05 + 5 * 0.10 + (income - 10) * 0.15;
        } else if (income <= 32) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (income - 18) * 0.20;
        } else if (income <= 52) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (income - 32) * 0.25;
        } else if (income <= 80) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (income - 52) * 0.30;
        } else {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (income - 80) * 0.35;
        }
        return tax;
    }

    //    Bai 7: Kiem tra chuoi doi xung
    public static boolean isPalindrome(String inputBai7) {
        int left = 0;
        int right = inputBai7.length() - 1;

        while (left < right) {
            if (inputBai7.charAt(left) != inputBai7.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //    Bai 8: Xoa cac ky tu lap lai trong chuoi
    public static String removeDuplicates(String input) {
        String uniqueCharacters = "";
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            String convertCharacter = String.valueOf(character);
            if (!uniqueCharacters.contains(convertCharacter)) {
                uniqueCharacters += character;
            }
        }
        return uniqueCharacters;
    }

    //    Bai 9: Two Sum II
    public static int[] twoSum(int[] nums, int target) {
////        Cach 1: dung for
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1};

//        Cach 2: dung while
        int index1 = 0;
        int index2 = nums.length - 1;
        while (index1 < index2) {
            if (nums[index1] + nums[index2] == target) {
                return new int[]{index1, index2};
            } else if (nums[index1] + nums[index2] < target) {
                index1++;
            } else {
                index2--;
            }
        }
        return new int[]{-1, -1};
    }

    //    Bai 10: Longest Palindromic Substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    //    Bai 11: Minimum Window Substring
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int required = tCount.size();
        int formed = 0;

        HashMap<Character, Integer> windowCount = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && windowCount.get(c).equals(tCount.get(c))) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (tCount.containsKey(leftChar) && windowCount.get(leftChar) < tCount.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
//        Bai 1:
        System.out.println("Bai 1:");
        String inputBai1 = "Cybersoft";
        String resultBai1 = removeVowels(inputBai1);
        System.out.println("Result: " + resultBai1);

//        Bai 2:
        System.out.println("Bai 2:");
        int[] arrBai2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; //happy case
//        int[] arrBai2 = {5, 2, 7, 7, 1}; //happy case
//        int[] arrBai2 = {3}; //bad case
//        int[] arrBai2 = null;
        int secondLargest = findSecondLargest(arrBai2);
        System.out.println("Second largest: " + secondLargest);

//        Bai 3:
        System.out.println("Bai 3:");
        int nBai3 = 10;
        int sumEven = sumEven(nBai3);
        System.out.println("Sum of even numbers: " + sumEven);

//        Bai 4:
        System.out.println("Bai 4:");
        String inputBai4 = "Xin chào các bạn";
        int countWords = countWords(inputBai4);
        System.out.println("Number of words: " + countWords);

//        Bai 5:
        System.out.println("Bai 5:");
        String inputBai5 = "Xin chao cac ban";
        String resultBai5 = printFirstCharacter(inputBai5);
        System.out.println("Result: " + resultBai5);

//        Bai 6:
        System.out.println("Bai 6:");
        int income = 15;
        double tax = calculateTax(income);
        System.out.println("Tax: " + tax);

//        Bai 7:
        System.out.println("Bai 7:");
        String inputBai7 = "hello";
        boolean resultBai7 = isPalindrome(inputBai7);
        System.out.println("Result: " + resultBai7);

//        Bai 8:
        System.out.println("Bai 8:");
        String inputBai8 = "abcabcabc";
        String resultBai8 = removeDuplicates(inputBai8);
        System.out.println("Result: " + resultBai8);

//        Bai 9:
        System.out.println("Bai 9:");
        int[] arrBai9 = {2, 7, 11, 15};
        int[] resultBai9 = twoSum(arrBai9, 9);
        System.out.println("Result: " + Arrays.toString(resultBai9));

//        Bai 10:
        System.out.println("Bai 10:");
        String inputBai10 = "babad";
        String resultBai10 = longestPalindrome(inputBai10);
        System.out.println("Result: " + resultBai10);

//        Bai 11:
        System.out.println("Bai 11:");
        String inputBai11 = "ADOBECODEBANC";
        String resultBai11 = minWindow(inputBai11, "ABC");
        System.out.println("Result: " + resultBai11);

    }
}
