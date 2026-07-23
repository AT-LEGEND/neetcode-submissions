/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node prev = null;
        Node headref = head;
        Node ans = null;
        while(head!=null)
        {

            Node headcopy = new Node(head.val);
            if(ans ==null )
                ans = headcopy;
            if(prev!=null)
            {
                prev.next = headcopy;
            }
            mp.put(head,headcopy);
            prev = headcopy;
            head = head.next;
        }    
        Node ansref = ans;
        Node prevref = null;
        prev = null;
        while(headref!=null)
        {
        if(headref.random == null)
                ans.random = null;
            else
                ans.random = mp.get(headref.random);
            headref = headref.next;
            ans = mp.get(headref);
        }
        return ansref;
    }
}
