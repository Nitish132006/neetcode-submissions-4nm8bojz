class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> s = new Stack<>();
    int res=0;
    for(String ops:operations){
        if(ops.equals("+")){
            int v = s.pop();
            int news = v + s.peek();
            s.push(v);
            s.push(news);
            res+=news;
        }
        else if(ops.equals("C")){
            res-=s.pop();
        }
        else if(ops.equals("D")){
            s.push(2*s.peek());
            res+=s.peek();
        }
        else{
            s.push(Integer.parseInt(ops));
            res+=s.peek();
        }
    }
    return res;
    }
}