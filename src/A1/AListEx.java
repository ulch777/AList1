package A1;

import java.util.Iterator;

public interface AListEx {
	public void init(int[] rr);

	public int size();

	public int get(int pos);

	public void set(int pos, int val);

	public int[] toArray();

	public void addStart(int val);

	public void addEnd(int val);

	public void addPos(int pos, int val);

	public void delStart();

	public void delEnd();

	public void delPos(int pos);

	public int max();

	public int min();

	public int maxIndex();

	public int minIndex();

	public void reverse();

	public void sortBubble();

	public String toString();

	public void clear();

	public Iterator<Integer> iterator();
}