package DSA.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LinkedList<E> {

    class Node{
        E data;
        Node next;
        public Node(E data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node head;

//##################################################

    void insertIntoList(E data){
        Node newNode=new Node(data,null);
        newNode.next=null;
        if(head==null){
            head=newNode;
        }
        else {
            Node lastNode = this.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

    }

//##################################################

    void deleteNode(E element){
        Node current=head.next;
        Node temp=head;
        if(head.data==element){
            head=head.next;
        }
        else {
            while (current.next != null) {
                temp=current;
                if (current.data==element){
                    current=temp.next;
                    return;
                }
                current=current.next;
            }
        }
        head=current;
    }
//##################################################

    int  lenList(){
       int count=0;
       Node current=head;
       while(current.next!=null){
           count++;
       }
       return count;
    }

//##################################################

    public void traverse() {
        Node currentNode=this.head;
        while(currentNode!=null) {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }

//##################################################

    void frequencyCount()
    {
        Map<Character,Integer> freq=new HashMap<>();

        Node currentNode=this.head;
        while(currentNode!=null) {
            String s= (String) currentNode.data;
            char c[]=s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(!freq.containsKey(c[i])){
                    freq.put(c[i],1);
                }
                else{
                    int n=freq.get(c[i]);
                    freq.put(c[i],n+1);
                }
            }
            currentNode=currentNode.next;
        }
        System.out.println(freq);
    }
}


