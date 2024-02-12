//169. Majority Element - EASY
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != ans) {
                count--;
            } else {
                count++;
            }
            if(count == 0) {
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int numbers[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(numbers));
    }
}


// Interviewer : ( Giving Hint ) Don't you agree that the answer would always be more than the total count of other number.
// You : Yes ! I agree. ( MF, I know that f**king algorithm you are heading towards )
// Interviewer : Ok, what if every one number will cancel other distinct number, the number left at the end would be our answer.
// You : Yeah, I got it. If I can pick first number as my answer then going forward I can increment the count if we have similar number and decrement if we have distinct number, if at any time I have count 0, I will assign my current number as answer and will proceed further.
// Interviewer : Yes, Correct !
// You :
// Let's see through test cases
// [1, 1, 2]
// Now let's say our answer is 1, for
// index 0 -> count - 1
// index 1 -> count - 2
// index 2 -> count 1
// so for 1 our count is 1 and 1 would be our answer.

// let's see one more test cases
// [1, 2, 1]
// index 0 -> count - 1
// index 1 -> count - 0
// now change our answer to 2 and count - 1
// index 2 -> count - 0
// now change our answer to 1 and count - 1
// So our final answer here would be 1.

// Interviewer : JFYI, It is called Boyer-Moore Majority Vote Algorithm.