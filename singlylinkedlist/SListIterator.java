package singlylinkedlist;

class SListIterator<T> {
    SList<T> list;

    SListIterator(SList<T> list) {
        this.list = list;
    }

    public void add(T i) {
        if (list.head == null) {
            list.head = new MyNode<T>();
            list.head.data = i;
        } else {
            MyNode<T> temp = list.head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new MyNode<T>();
            temp.next.data = i;
        }
    }

    public void remove() {
        if (list.head != null) {
            list.head = list.head.next;
        }
    }

    public void iterate() {
        MyNode<T> temp = list.head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
