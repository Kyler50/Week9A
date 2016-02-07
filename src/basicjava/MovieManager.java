package basicjava;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	
	public static final String FILE_PATH = "C:\\Users\\Vas Richard Roland\\workspace\\Week9A\\movies.xml";
	
	public static void main(String[] args) {
		List <Person> persons = new ArrayList<Person>();
		List <Movie> movies = new ArrayList<Movie>();
		
		Person leonardo = new Person("Leonardo", "Di Caprio", Gender.MALE, false, true);
		Person kate = new Person("Kate", "Winslet", Gender.FEMALE, true, true);
		Movie titanic = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8, persons);
		
		persons.add(kate);
		persons.add(leonardo);
		movies.add(titanic);
		
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			StringBuffer sb = new StringBuffer();
			sb.append("<movies>");
			sb.append(titanic.toXMLString());
			sb.append("</movies>");
			bw.write(sb.toString());
		bw.flush();
			bw.close();
} 		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
