package A1;

import java.util.Iterator;



public class LList2 implements AListEx, Iterable 
<Integer>
{
	class Node 
	{
		int data;
		Node next;
		Node prev;
		public Node(int val)
		{
			data=val;
		}

	}

	Node first = null;
	Node last = null;

	@Override
	public void init(int[] rr) 
	{
		clear();
		for(int i=rr.length-1;i>=0;i--)
		{
			addStart(rr[i]);
		}
	}

	@Override
	public int size() 
	{
		int ret=0;
		Node tmp = first;
		while(tmp!=null)
		{
			ret++;
			tmp=tmp.next;
		}
		return ret;
	}

	@Override
	public int get(int pos) {
		if (size() == 0 || pos >= size()) {
			throw new IllegalArgumentException("out of index");
		}
		Node tmp = first;
		for (int i = 0; i < pos; i++) {
			tmp = tmp.next;
		}
		int val = tmp.data;
		return val;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0 || pos >= size() || first == null) {
			throw new ArrayIndexOutOfBoundsException("out of index");
		}
		Node tmp = first;
		for (int i = 0; i < pos; i++) {
			tmp = tmp.next;
		}
		tmp.data = val;
	}

	@Override
	public int[] toArray() {
		int[] ar = new int[size()];
		Node tmp = first;
		for (int i = 0; i < size(); i++) {
			ar[i] = tmp.data;
			tmp = tmp.next;
		}
		return ar;
	}

	@Override
	public void addStart(int val) 
	{
		if(first==null)
		{
			first=new Node(val);
			last=first;
		}
		else
		{
			Node tmp=new Node(val);
			tmp.next = first;
			first.prev=tmp;
			first=tmp;
		}
	}

	@Override
	public void addEnd(int val) 
	{
		if(first==null)
		{
			first=new Node(val);
			last=first;
		}
		else
		{
			Node tmp=new Node(val);
			tmp.prev=last;
			last.next=tmp;
			last=tmp;
		}
	}

	@Override
	public void addPos(int pos, int val) {
		if(pos<0||pos>size())
			throw new ArrayIndexOutOfBoundsException();
		if(pos==0)
		{
			addStart(val);
			return;
		}
		if(pos==size())
		{
			addEnd(val);
			return;
		}
		Node tmp = first;
		for (int i = 1; i < pos; i++) {
			tmp = tmp.next;
		}
		Node newNode = new Node(val);
		newNode.next = tmp.next;
		tmp.next.prev=newNode;
		tmp.next = newNode;
		newNode.prev=tmp;


	}

	@Override
	public void delStart() 
	{
		if (first == null) throw new NegativeArraySizeException();
		if (size()==1) 
		{clear();
		return;}
		first.next.prev = null;
		first = first.next;
	}

	@Override
	public void delEnd() 
	{
		if (first == null) 
			throw new ListEmptyExeption();
		if (size()==1) 
		{clear();
		return;}
		last.prev.next = null;
		last = last.prev;

	}

	@Override
	public void delPos(int pos) 
	{
		if (pos<0 || pos>=size()) 
			throw new NegativeArraySizeException();
		if (pos == 0)
		{
			delStart();
			return;
		}
		else
		{
			if (pos == size()-1)
			{
				delEnd();
				return;
			}
			Node tmp = first;
			for (int i=1;i<pos;i++)
			{
				tmp=tmp.next;
			}
			tmp.next = tmp.next.next;
			tmp.next.prev = tmp;
		}
	}

	@Override
	public int max() {
		if (first == null) {
			throw new IllegalArgumentException("out of index");
		}
		int max = 0;
		Node tmp = first;
		if (first != null)
			max = first.data;
		while (tmp != null) {
			if (tmp.data > max)
				max = tmp.data;
			tmp = tmp.next;
		}
		return max;
	}

	@Override
	public int min() {
		if (first == null) {
			throw new IllegalArgumentException("out of index");
		}
		int min = 0;
		Node tmp = first;
		if (first != null)
			min = first.data;
		while (tmp != null) {
			if (tmp.data < min)
				min = tmp.data;
			tmp = tmp.next;
		}
		return min;
	}

	@Override
	public int maxIndex() {
		if (size() == 0) {
			throw new IllegalArgumentException("out of index");
		}
		int maxindex = 0, index = 0;
		if (first == null)
			return 0;
		int max = first.data;
		Node tmp = first;
		while (tmp != null) {
			if (tmp.data > max) {
				max = tmp.data;
				maxindex = index;
			}
			index++;
			tmp = tmp.next;
		}
		return maxindex;
	}

	@Override
	public int minIndex() {
		if (size() == 0) {
			throw new IllegalArgumentException("out of index");
		}
		int minindex = 0, index = 0;
		if (first == null)
			return 0;
		int min = first.data;
		Node tmp = first;
		while (tmp != null) {
			if (tmp.data < min) {
				min = tmp.data;
				minindex = index;
			}
			index++;
			tmp = tmp.next;
		}
		return minindex;
	}

	@Override
	public void reverse() 
	{
		int[] ar=toArray();
		for (int i = 0; i < size() / 2; i++) 
		{
			int tmp = ar[i];
			ar[i] = ar[size() - 1 - i];
			ar[size() - 1 - i] = tmp;
		}

		clear();
		init(ar);

	}

	@Override
	public void sortBubble() {
		int[] ar=toArray();
		int tmp = 0;
		for (int i = 0; i < size(); i++) 
		{

			for (int j = 0; j < size() - i - 1; j++) 
			{
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		clear();
		init(ar);
	}

	@Override
	public void clear() 
	{
		first=null;
		last=null;
	}
	@Override
	public String toString()
	{
		String str = "";
		Node tmp = first;
		while (tmp != null) {
			str += tmp.data + ", ";
			tmp = tmp.next;
		}
		return str;

	}

	@Override
	public Iterator<Integer> iterator() 
	{
		return new Iter(first);
	}
	class Iter implements Iterator<Integer>
	{
		Node nn = null;
		int data=0;
		public Iter(Node root)
		{
			nn=root;
		}

		@Override
		public boolean hasNext() 
		{
			return (nn!=null);
		}

		@Override
		public Integer next() 
		{
			data=nn.data;
			nn=nn.next;
			return data  ;
		}

		@Override
		public void remove() {

		}
	}

}
