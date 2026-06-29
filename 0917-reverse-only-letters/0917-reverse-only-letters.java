class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            // Move left pointer to the next letter from left
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            // Move right pointer to the next letter from right
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // Swap the letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}