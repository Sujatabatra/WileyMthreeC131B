package linkedlist;
class Node<T>{
	T t;
	Node next;
	Node(T t){
		this.t=t;
		this.next=null;
	}
}

//**************************************************
public class LinkedList<T> {
	Node head;
	@SuppressWarnings("unchecked")
	private void insert(T t) {
		if(head==null) {
			head=new Node(t);
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node(t);
		}
	}
//**************************************************
	private void insertBeg( T t) {
		if(head==null) {
			head=new Node(t);
		}
		else {
			Node temp=head;
			Node newHead=new Node(t);
			newHead.next=temp;
			head=newHead;
		}
	}
//**************************************************
	private void insertPos(T t, int pos) {
		if(pos==0) {
			insertBeg(t);
		} else {
			int i=0;
			Node temp=head;
			while(i<pos) {
				temp=temp.next;
				i++;
			}
			Node newN=new Node(t);
			Node next=temp.next;
			newN.next=next;
			temp.next=newN;
		}
	}
//**************************************************
	
	private void caldig(Object t , int [] arr) {
		int t1=(int)t;
		int k;
		while(t1>0) {
			k=t1%10;
			arr[k]+=1;
			t1=t1/10;	
		}
	}
//***********************************************
	private void frequency() {
		Node temp=head;
		int[] arr=new int [9];
		while(temp!=null) {
			caldig(temp.t,arr);
			temp=temp.next;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" " +arr[i]);
		}
	}
//**************************************************
	
	private void traversal() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.t);
			temp=temp.next;
		}
	}
//**************************************************
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		for(int i=0;i<5;i++) {
			ll.insert(i);
		}
		ll.insert(11);
		ll.frequency();
	}

}
