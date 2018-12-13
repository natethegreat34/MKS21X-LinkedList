

public class MyLinkedList{
  private class Node{
    private int data;
    private Node next,prev;
      public Node next(){
        return next;
      }
      public Node prev(){
        return prev;
      }
      public void setNext(Node other){
        next = other;
      }
      public void setPrev(Node other){
        prev = ther;
      }
      public Integer getData(){
        return data;
      }
      public Integer setData(Integer i){
        data = i;
        return data;
      }
      public String toString(){
        String y = "";
        return y + data;
      }
   }
   private int size;
   private Node start,end;

  // MyLinkedList() - make an empty list.
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
