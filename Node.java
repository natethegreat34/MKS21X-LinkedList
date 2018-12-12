class Node{
 private int data;
 private Node next,prev;
}


class MyLinkedList{
 private int size;
 private Node start,end;

 public int size() {
   return size;
 }
 public boolean add(int value){
   return true;
 }
 public String toString(){
   return "[ " + start + " | " + " ]";
 }
}
