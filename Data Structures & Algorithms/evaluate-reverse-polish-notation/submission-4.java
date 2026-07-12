class Solution {
    public int toNum(String num) {
        return Integer.parseInt(num);
    }
    public Boolean isoperand(String op) {
        if (op.equals("+") || op.equals("*") || op.equals("-") || op.equals("/"))
            return true;
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i =0 ; i< tokens.length;i++) {
            System.out.println(st);
            if (isoperand(tokens[i])) {
                int op1 = st.pop();
                int op2 = st.pop();
                if (tokens[i].equals("+")) {
                    st.push((op1 + op2));
                } else if (tokens[i].equals("-")) {
                    st.push(op2 - op1);
                } else if (tokens[i].equals("*")) {
                    st.push(op1 * op2);
                } else {
                    st.push(op2 / op1);
                }
            }
            else
                st.push(toNum(tokens[i]));
        }
        return st.peek();
    }
}
