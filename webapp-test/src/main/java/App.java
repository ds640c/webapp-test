import static spark.Spark.get;
import static spark.Spark.staticFiles;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class App {
    public static void main(String[] args) {
    	
    	staticFiles.location("/public");
    	
        get("/hello", (req, res) -> "Hello World");
        
        get("/name", (req, res) -> {
        	
        	List<String> names = new ArrayList<String>();
        	names.add("Roger");
        	names.add("James");
        	names.add("Mary");
        	names.add("Helga");
        	
        	int i = RandomUtils.nextInt(3);
        	return  names.get(i);
        });
    }
}