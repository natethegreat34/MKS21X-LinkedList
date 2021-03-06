
public class MyLinkedList{
    private Node start;
    private Node end;
    private int length;

    public MyLinkedList() {
        //sets everything up
        start = null;
        end = null;
        length = 0;
    }
    public Node start(){
        return start;
    }
    public Node end(){
        return end;
    }
    public void setStart(Node other){
      start = other;
    }
    public void setEnd(Node other){
      end = other;
    }
    public void clear (){
      length = 0;
    }
    public void extend(MyLinkedList other){
        if (this.size() == 0){
            //if the thing you want to extend is nothing, then the thing becomes the other thing you want to extend it by
            this.setStart(other.start());
            this.setEnd(other.end());
            length = other.size();}
        else{
            if (other.size() !=0){
                //the thing your extending by (this's) appends with other
                //other's start becomes just the next of the previously end of this
                //others's end becomes the end
                //this's end just is the value before the once start of other
                // other fades away into the abyss
        this.end().setNext(other.start());
        other.start().setPrev(this.end());
        end = other.end();
        length = this.size() + other.size();}}
        other.setStart(null);
        other.setEnd(null);
        other.clear();

     //in O(1) runtime, move the elements from other onto the end of this
     //The size of other is reduced to 0
     //The size of this is now the combined sizes of both original lists
    }

    public int size() {
        return length;
    }

    public boolean add(Integer value){
        //adding so it just makes the last one be its previous
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
        String happy = "[";
        Node lol = start;
        if (length == 1 && start != null){
            return "[" + start + "]";
        }
        else{
        while (lol != end && lol != null){
            happy = happy + lol + ", ";
            lol = lol.next();
        }}
        if (end != null){
        return happy + end + "]";
        }
        else{
            return happy + "]";
        }}

    public Integer get(int index){
       //keeps going till it gets to the secified node
       if (index < 0 || index >= length){
           throw new IndexOutOfBoundsException();
       }
       else{ int i = 0;
           Node love = start;
           while ( love != null && i < index){
               love = love.next();
               i ++;
           }
   //returns the value of the found node
    return love.getData();
    }}

    public Integer set(int index, Integer value){
    //uses same loop logic as get
    if (index < 0 || index >= length){
        throw new IndexOutOfBoundsException();
    }
    else{
        int i = 0;
        Node love = start;
        while ( love != null && i < index){
            love = love.next();
            i ++;
        }
        Node life = new Node (null, null, love.getData());
    //replaces value
        love.setData(value);
    //returns previous value
        return life.getData();
        }
    }

    public boolean contains(Integer value){
        //uses same loop logic as get to check if the value is even present
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
        //uses same loop logic as get but instead of returning the value, it returns the index
        if (!contains(value)){
            return  -1;
        }
        else {
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
    }

    public void add(int index, Integer value){
        if (index < 0 || index > length){
            throw new IndexOutOfBoundsException();
        }
        else if (index == length){
          //if added to the end, can use other add function
                add(value);
            }

            else if (index == 0){
          //if added to beginning have change the start and then fix the next/prev
                Node gat = new Node (null,null, value);
                start.setPrev(gat);
                gat.setNext(start);
                start = gat;
                length ++;
            }
            else{
                 int i = 0;
                 Node love = start;
                while ( love != null && i <= index - 1){
                    love = love.next();
                    i ++;
                }
                Node gat = new Node (null,null, value);
                gat.setPrev(love.prev());
                gat.setNext(love);
                love.prev().setNext(gat);
                love.setPrev(gat);
                length ++;
            }
        }

    public Integer remove(int index){
        //same as the void add but instead we are getting rid of the next,prev and forming new ones
        Node gat = new Node (null,null, 0);
        if (index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        else if (index == length - 1){
          //if the value appears at the end we make the one before it the new end
              gat = end;
              end = end.prev();
              end.setNext(null);
              length --;
              return gat.getData();
          }
          else if (index == 0){
          // if it's at the beginning the one aftre it become the start
                gat = start;
                start = start.next();
                length --;
                return gat.getData();
             }

             else {
                 int i = 0;
                 Node love = start;
                 while ( love != null && i < index){
                     love = love.next();
                     i ++;
                 }
    //forming the new connections between the others
    //Ex; a <--> b <--> c ---------- remove (2) ---------- a <--> b
        gat = love;
        love.next().setPrev(love.prev());
        love.prev().setNext(love.next());
        length --;
        return gat.getData();
        }
    }

    public boolean remove(Integer value){
        //combining indexOf and the other remove does the job alreayd
        if (!contains(value)){
          return  false;
        }
        int spot = indexOf(value);
        remove (spot);
        return true;
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
