package zsolt.app;

import java.util.Scanner;

import zsolt.app.impl.MappedIntegerStreamStat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	IntegerStreamStat stat = new MappedIntegerStreamStat(1000);
    	Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNextInt()) {
    		stat.add(scanner.nextInt());
    	}
    	scanner.close();
    	
    	System.out.println("median is: " + stat.calcMedian());
    }
}
