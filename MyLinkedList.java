

public class MyLinkedList{
    private Node start;
    private Node end;
    private int length;

    public MyLinkedList() {
        start = null;
        end = null;
        length = 0;
    }

    public int size() {
        return length;
    }

    public boolean add(Integer value){
        Node gat = new Node (null, null, value);
        if (length == 0){
            start = gat;
        }
        else{
        gat.setPrev(end);
        end.setNext(gat);
    }
    end = gat;
        length ++;
        return true;
    }

    public String toString(){
        String happy = "[ ";
        Node lol = start;
        if (length == 1){
            return "[" + start + "]";
        }
        while (lol != end){
            happy = happy + lol + ", ";
            lol = lol.next();
        }
        return happy + end + "]";
    }

   public Integer get(int index){
     if (index < 0 || index >= length){
       throw new IndexOutOfBoundsException();
     }
     int i = 0;
     Node love = start;
     while ( love != null && i <= index){
     love = love.next();
     i ++;
   }
   return love.getData();
   }

public Integer set(int index, Integer value){
  if (index < 0 || index >= length){
    throw new IndexOutOfBoundsException();
  }
  int i = 0;
  Node love = start;
  while ( love != null && i <= index){
  love = love.next();
  i ++;
}
Node life = love;
love.setData(value);
return life.getData();
}

public boolean contains(Integer value){
  int i = 0;
  Node love = start;
  while ( love != null) {
  if (love.getData() == value){
    return true;
  }
  love = love.next();
}
return false;
}
public int indexOf(Integer value){
  if (!contains(value)){
    throw new NullPointerException();
  }
  int i = 0;
  Node love = start;
  while ( love != null) {
  if (love.getData() == value){
    return i;
  }
  love = love.next();
  i ++;
}
return -1;
}

public void add(int index, Integer value){
  if (index < 0 || index >= length){
    throw new IndexOutOfBoundsException();
  }
  int i = 0;
  Node love = start;
  while ( love != null && i <= index){
  love = love.next();
  i ++;
}

}
public Integer remove(int index){
  if (index < 0 || index >= length){
    throw new IndexOutOfBoundsException();
  }
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
return help.getData();
}

public Integer remove(Integer value){
  return remove (indexOf(value));
}

private class Node{
  private int data;
  private Node next,prev;
  public Node (Node n, Node p, int d){
    next = n;
    prev = p;
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
 }
