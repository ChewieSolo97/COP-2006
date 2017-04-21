import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

  Queue<Character> que = new LinkedList<Character>();
  Stack<Character> stack = new Stack<Character>();
  void pushCharacter(char ch) {
    stack.push(ch);
  }
  void enqueueCharacter(char ch) {
    que.add(ch);
  }
  char popCharacter() {
    return stack.pop();
  }
  char dequeueCharacter() {
    return que.remove();
  }
}
