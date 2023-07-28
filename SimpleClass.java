import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

public class SimpleClass {

    public static void main (String [] args){
        String [] designPatterns = new String[3];
        designPatterns[0]  = "Creational Design Pattern";
        designPatterns[1] = "Structural Design Patterns";
        designPatterns[2] = "Behavioral Design Patterns";

        for(String patterns : designPatterns){
            System.out.println(patterns);
        }
    }
}
