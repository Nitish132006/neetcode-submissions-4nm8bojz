class Solution {
    public boolean isValid(String s) {
    Stack<Character> ss = new Stack<>();
    Map<Character,Character> h = new HashMap<>();
    h.put(')','(');
    h.put('}','{');
    h.put(']','[');
    for(char c:s.toCharArray()){
        if(h.containsKey(c)){
            if(!ss.isEmpty() && ss.peek() == h.get(c)){
                ss.pop();
            }
            else{
                return false;
            }
        }
        else{
            ss.push(c);
        }
    }
    return ss.isEmpty();
    }
}
