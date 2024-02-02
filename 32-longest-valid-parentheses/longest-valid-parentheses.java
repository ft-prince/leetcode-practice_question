class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        
        // Create a stack to keep track of indices of opening parentheses.
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize the stack with -1 to handle edge cases.

        // Iterate through each character in the input string.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i); // Push the index of an opening parenthesis onto the stack.
            } else {
                stack.pop(); // Pop the top index as a closing parenthesis is encountered.

                if (stack.isEmpty()) {
                    // If the stack is empty, push the current index to mark the start of a new substring.
                    stack.push(i);
                } else {
                    // Calculate the length of the valid parentheses substring and update the maximum length.
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }

        // The result represents the length of the longest valid parentheses substring.
        return ans;
    }
}
