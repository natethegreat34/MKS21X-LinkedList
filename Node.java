

public class MyLinkedList{
  private Node start;
  private Node end;
  private int length;
  private class Node{
    private int data;
    private Node next,prev;
    public Node (int d){
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
   public boolean add(Integer value){
     Node gat = new Node (value);
     end = gat;
     return true;
   }
   public String toString(){
     String happy = "[ ";
     for (int i = 0; i < length -1; i ++){
       happy = happy + next() + " , ";
     }
     return happy + "]";
   }

   public Integer get(int index){
     int i = 0;
     Node love = start;
     while ( love != null && i <= index){
     love = love.next();
     i ++;
   }
   return love;
   }

public Integer set(int index, Integer value){
  int i = 0;
  Node love = start;
  while ( love != null && i <= index){
  love = love.next();
  i ++;
}
Node life = love;
love = value;
return life;
}

public boolean contains(Integer value){
  int i = 0;
  Node love = start;
  while ( love != null) {
  if (love = value){
    return true;
  }
  love = love.next();
}
return false;
}
public int indexOf(Integer value){
  int i = 0;
  Node love = start;
  while ( love != null) {
  if (love = value){
    return i;
  }
  love = love.next();
  i ++;
}
return -1;
}

public void add(int index, Integer value){
  int i = 0;
  Node love = start;
  while ( love != null && i <= index){
  love = love.next();
  i ++;
}

}
public Integer remove(int index){
  int i = 0;
  Node love = start;
  while ( love != null && i <= index){
  love = love.next();
  i ++;
}
Node help = love;
while (love != null){
love = love.next();
}
return help;
}

public Integer remove(Integer value){
  return remove (indexOf(value));
}
 }
