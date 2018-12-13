

public class MyLinkedList{
  private Node start;
  private Node end;
  private int length;
  private class Node{
    private int data;
    private Node next,prev;
    public Node (int d, Node n, Node p){
      data = d;
    }
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
        prev = other;
      }
      public Integer getData(){
        return data;
      }
      public Integer setData(Integer i){
        int sigh = data;
        data = i;
        return sigh;
      }
      public String toString(){
        String y = "";
        return y + data;
      }
   }
   public MyLinkedList() {

   }
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
