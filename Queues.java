import java.util.*;;
/**
 * Queues
 */
public class Queues {

    Queue<Integer> q = new LinkedList<Integer>(); 
    
    void push(int val) 
    {
        int size = q.size();
        q.add(val);
         
        for (int i = 0; i < size; i++) 
        {
            int x = q.remove();
            q.add(x);
        }
    }


    public static void main(String[] args) {
        Queue <String> ab = new LinkedList<String>();
        
        ab.add("Apple");
        ab.add("Meta");
        ab.add("Google");
        ab.add("Aamazon");
        ab.add("Netflix");

        System.out.println(ab.element());

        
        System.out.println(ab);
    }
    
    
}