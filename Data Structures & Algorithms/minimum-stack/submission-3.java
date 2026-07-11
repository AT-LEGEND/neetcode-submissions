class MinStack {
    Stack<Integer> st;
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (!st.isEmpty() && min.peek() >= val)
            min.push(val);
        
        if(st.isEmpty())
        {
            min.push(val);
        }
            st.push(val);



        // System.out.println("Stack after push operation " + st);
        // System.out.println("min after push operation " + min);
    }

    public void pop() {
        int val = st.pop();
        if (min.peek() == val)
            min.pop();
        // System.out.println("Stack after pop operation " + st);
        // System.out.println("min after pop operation " + min);
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
