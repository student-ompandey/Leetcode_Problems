class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // Add node at head
    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    // Add node at tail
    public void addAtTail(int val) {

        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        size++;
    }

    // Add node at given index
    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Delete node at given index
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */