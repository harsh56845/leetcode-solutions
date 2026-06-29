class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int top = -1;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();        
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
            top = x;
        }
        st1.push(x);
    }
    
    public int pop() {
        // if(top == -1) return -1;
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int lele = top;
        // if()
        
        st2.pop();
        top = !st2.isEmpty() ? st2.peek() : -1;
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return lele;
    }
    
    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return top == -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */