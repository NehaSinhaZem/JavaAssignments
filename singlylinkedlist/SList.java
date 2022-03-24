package singlylinkedlist;

class SList<T> {
    MyNode<T> head = null;
    MyNode<T> temp = null;

    public SListIterator<T> iterator() {
        return new SListIterator<T>(this);
    }
}
