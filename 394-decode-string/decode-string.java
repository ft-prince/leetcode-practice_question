import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        // Two stacks are used: one for numbers and one for strings.
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        // StringBuilder to build the decoded string.
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        // Iterate through each character in the input string.
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Extract a multi-digit number and push it onto the number stack.
                int num = ch - '0';

                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++;
                }

                numStack.push(num);
            } else if (ch == '[') {
                // Push the current StringBuilder onto the string stack and reset it.
                strStack.push(sb.toString());
                sb = new StringBuilder();
            } else if (ch == ']') {
                // Pop the number from the stack and repeat the current StringBuilder accordingly.
                int k = numStack.pop();
                StringBuilder tmp = new StringBuilder(strStack.pop());
                
                for (int j = 0; j < k; j++) {
                    tmp.append(sb);
                }

                // Update the StringBuilder with the repeated content.
                sb = tmp;
            } else {
                // Append non-digit characters to the StringBuilder.
                sb.append(ch);
            }
        }

        // The final StringBuilder contains the decoded string.
        return sb.toString();
    }
}
