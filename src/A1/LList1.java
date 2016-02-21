package A1;

import java.util.Iterator;

public class LList1 implements AListEx, Iterable 
<Integer> 
{

	class Node {
		int data;
		Node next;
		public Node(int val)
		{
			data=val;
		}
		public Node()
		{

		}
	}

	Node root = null;

	@Override
	public void init(int[] ini) 
	{
		for (int i = ini.length - 1; i >= 0; i--) 
		{
			Node tmp = new Node(ini[i]);
			tmp.next = root;
			root = tmp;
		}
	}

	@Override
	public int size() 
	{
		int ret=0;
		Node tmp = root;
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
		Node tmp = root;
		for (int i = 0; i < pos; i++) {
			tmp = tmp.next;
		}
		int val = tmp.data;
		return val;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0 || pos >= size() || root == null) {
			throw new ArrayIndexOutOfBoundsException("out of index");
		}
		Node tmp = root;
		for (int i = 0; i < pos; i++) {
			tmp = tmp.next;
		}
		tmp.data = val;

	}

	@Override
	public int[] toArray() {
		int[] ar = new int[size()];
		Node tmp = root;
		for (int i = 0; i < size(); i++) {
			ar[i] = tmp.data;
			tmp = tmp.next;
		}
		return ar;
	}

	@Override
	public void addStart(int val) {
		Node tmp = new Node(val);
		tmp.next = root;
		root = tmp;
	}

	@Override
	public void addEnd(int val) {
		if (root == null) 
		{
			root=new Node(val);
			return;
		}
		Node tmp=root;
		while(tmp.next!=null)
		{
			tmp=tmp.next;
		}
		tmp.next=new Node(val);
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos < 0 || pos > size()) 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
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
		Node tmp=root;
		for(int i=1; i<pos; i++)
		{
			tmp=tmp.next;
			Node nn = new Node(val);
			nn.next=tmp.next;
			tmp.next = nn;
		}
	}

	@Override
	public void delStart() {
		if (root == null) {
			throw new NegativeArraySizeException("Null");
		}
		root = root.next;
	}

	@Override
	public void delEnd() {
		if (root == null) {
			throw new ListEmptyExeption();
		}
		if(root.next==null)
		{
			root=null;
		}
		else
		{
			Node tmp = root;
			while(tmp.next.next!=null)
			{
				tmp = tmp.next;
			}
			tmp.next = null;
		}
	}

	@Override
	public void delPos(int pos) 
	{
		if(root==null)
		{
			throw new NegativeArraySizeException();
		}
		if(pos<0||pos>size()-1)
		{
			throw new NegativeArraySizeException();
		}
		if (root.next==null)
		{
			root=null;
		}
		else
		{		
			Node tmp = root;

			for (int i = 1; i < pos - 1; i++)

			{
				tmp = tmp.next;
			}
			tmp.next = tmp.next.next;
			return;
		}
	}

	@Override
	public int max() {
		if (size() == 0 || root == null) {
			throw new IllegalArgumentException("out of index");
		}
		int max = 0;
		Node tmp = root;
		if (root != null)
			max = root.data;
		while (tmp != null) {
			if (tmp.data > max)
				max = tmp.data;
			tmp = tmp.next;
		}
		return max;
	}

	@Override
	public int min() {
		if (size() == 0 || root == null) {
			throw new IllegalArgumentException("out of index");
		}
		int min = 0;
		Node tmp = root;
		if (root != null)
			min = root.data;
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
		if (root == null)
			return 0;
		int max = root.data;
		Node tmp = root;
		while (tmp != null) {
			if (tmp.data > max) {
				max = tmp.data;
				maxindex = index;
			}
			index++;
			tmp = tmp.next;
		}
		;
		return maxindex;
	}

	@Override
	public int minIndex() {
		if (size() == 0) {
			throw new IllegalArgumentException("out of index");
		}
		int minindex = 0, index = 0;
		if (root == null)
			return 0;
		int min = root.data;
		Node tmp = root;
		while (tmp != null) {
			if (tmp.data < min) {
				min = tmp.data;
				minindex = index;
			}
			index++;
			tmp = tmp.next;
		}
		;
		return minindex;
	}

	@Override
	public void reverse() {
		Node tmp = root;
		Node root2 = null;
		while (tmp != null) {
			Node tmp2 = new Node();
			tmp2.data = tmp.data;
			tmp2.next = root2;
			root2 = tmp2;

			tmp = tmp.next;
		}
		root = root2;

	}

	@Override
	public String toString()

	{
		String str = "";
		Node tmp = root;
		while (tmp != null) {
			str += tmp.data + ", ";
			tmp = tmp.next;
		}
		return str;

	}

	@Override
	public void clear() 
	{
		root = null;
	}

	@Override
	public void sortBubble() 
	{
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
	public Iterator<Integer> iterator() 
	{
		return new Iter(root);
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
