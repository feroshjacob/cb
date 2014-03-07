package cb.string;
/*
 * Adapted from http://www.cs.rit.edu/~vvs1100/Code/JaccardSimilarity.java
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JaccardSimiliarity implements IStringCompare {

        public  JaccardSimiliarity(){
                super();
        }
        public  float compare(String similar1, String similar2){
            HashSet<String> h1 = new HashSet<String>();
            HashSet<String> h2 = new HashSet<String>();

            for(String s: similar1.split("\\s+")){
            h1.add(s);
            }
   //         System.out.println("h1 "+ h1);
            for(String s: similar2.split("\\s+")){
            h2.add(s);
            }
     //       System.out.println("h2 "+ h2);

            int sizeh1 = h1.size();
            //Retains all elements in h3 that are contained in h2 ie intersection
            h1.retainAll(h2);
            //h1 now contains the intersection of h1 and h2
      //      System.out.println("Intersection "+ h1);


            h2.removeAll(h1);
            //h2 now contains unique elements
        //    System.out.println("Unique in h2 "+ h2);

            //Union 
            int union = sizeh1 + h2.size();
            int intersection = h1.size();

            return (float)intersection/union;

        }

    
}
