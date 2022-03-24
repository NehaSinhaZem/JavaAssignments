package singlylinkedlist;

public class Generics
{
	public static void main(String[] args) {
		SList<Integer> list = new SList<>();
        SListIterator<Integer> listIterator = list.iterator();
		listIterator.add(3);
		listIterator.add(6);
		listIterator.add(8);
		listIterator.add(13);
        listIterator.remove();
        listIterator.iterate();
	}
}