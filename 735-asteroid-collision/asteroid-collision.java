import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Create a stack to simulate the movement of asteroids.
        Stack<Integer> st = new Stack<>();

        // Iterate through each asteroid in the given array.
        for (int asteroid : asteroids) {
            // If the asteroid is positive, it moves to the right, so push it onto the stack.
            if (asteroid > 0) {
                st.push(asteroid);
            } else {
                // If the asteroid is negative (moving to the left),
                // handle the collision with asteroids moving to the right.
                while (!st.isEmpty() && st.peek() > 0 && Math.abs(asteroid) > st.peek()) {
                    st.pop();  // Destroy the asteroid moving to the right.
                }

                // Check the result after the collision.
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroid);  // If the stack is empty or the top asteroid is moving left, push the current asteroid.
                } 
                else if (st.peek() + asteroid == 0) {
                    st.pop();  // If the top asteroid and the current asteroid have the same magnitude but opposite directions, they both get destroyed.
                }
            }
        }

        // Convert the stack to an array to represent the final state of asteroids after all collisions.
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
