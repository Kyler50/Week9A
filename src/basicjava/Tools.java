package basicjava;
import java.util.HashMap;
import java.util.List;

public class Tools {
		public static String toXMLTag(String tagName, String value) {
			return "<" + tagName + ">" + value + "</" + tagName + ">";
		}
			
			public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
				HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
				for (Movie movie : movies) {
					List<Person> cast = movie.getCast();
					for (Person person : cast) {
						if (!countMap.containsKey(person)) {
							countMap.put(person, 0);
						}
						countMap.put(person, countMap.get(person) + 1);
					}
				}
				return countMap;
			}
		
			public static String[] getMovieTitles(List<Movie> movie) {
				String[] movieTitles = new String[movie.size()];
				for (int i = 0; i < movie.size(); i++) {
					movieTitles[i] = movie.get(i).getTitle();
				}
				return movieTitles;
			}
		}
