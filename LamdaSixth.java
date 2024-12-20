/* 6. Write a Java program to implement a lambda expression to find the average of a list of doubles. */

import java.util.*;
import java.util.function.*;
interface Abc {
    void show();
}

public class LamdaSixth {
    public static void main(String[] args) {
        ArrayList<Double> ls = new ArrayList<Double>();
		
		ls.add(225.5);
		ls.add(226.5);
		ls.add(227.5);
		ls.add(228.5);
		ls.add(229.5);

      
        

        
        Abc a = () -> {
			double sum = 0;
            for (double d : ls) {
                sum += d; 
            }
            
            double result = sum / ls.size();
            System.out.println("Average: " + result);
        };

        a.show();
    }
}
