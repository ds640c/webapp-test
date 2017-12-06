import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
  

public class App {
    public static void main(String[] args) {
    	
    	staticFiles.location("/public");
    	port(8050);
    	System.out.println("got to http://localhost:8050/");
    	
        get("/hello", (req, res) -> "Hello World");
        
        get("/name", (req, res) -> {
        	List<String> names = new ArrayList<String>();
        	names.add("Roger");
        	names.add("James");
        	names.add("Mary");
        	names.add("Beatrix");
        	names.add("Billy");
        	 
        	Random rand = new Random(); 
        	int  i = rand.nextInt(4);
        	
        	return  names.get(i);
        });
    }
}