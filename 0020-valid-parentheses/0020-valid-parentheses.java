class Solution {
    public boolean isValid(String s) {
    char[] stringArray = s.toCharArray();
    Stack<Character> stringStack = new Stack<>();
    Stack<Character> remaining=new Stack<>();
    for (int i = 0; i < stringArray.length; i++) {
      if (stringArray[i] == '{' || stringArray[i] == '[' || stringArray[i] == '(')
        stringStack.push(stringArray[i]);

      else if ((!stringStack.empty()) &&
      ((stringArray[i] == '}' && stringStack.peek() == '{') || 
      (stringArray[i] == ']' && stringStack.peek() == '[') || 
      (stringArray[i] == ')' && stringStack.peek() == '('))) {
        stringStack.pop();
      }
      else
        remaining.push(stringArray[i]);
      }
      if(stringStack.empty()&&remaining.empty())
        return true;

      return false;
    }
}