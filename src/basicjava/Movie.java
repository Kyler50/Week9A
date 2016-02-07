package basicjava;
import java.util.ArrayList;
import java.util.List;

public class Movie {
		String title;
		Genre genre;
		long duration;
		double rate;
		List <Person> cast = new ArrayList<Person>();
		
		public Movie(String title, Genre genre, long duration, double rate, List <Person> cast) {
			this.title = title;
			this.genre = genre;
			this.duration = duration;
			this.rate = rate;
			this.cast = cast;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public Genre getGenre() {
			return genre;
		}
		
		public void setGenre(Genre genre) {
			this.genre = genre;
		}
		
		public long getDuration() {
			return duration;
		}
		
		public void setDuration(long duration) {
			this.duration = duration;
		}
		
		public double getRate() {
			return rate;
		}
		
		public void setRate(double rate) {
			this.rate = rate;
		}
		
		public String toString(){
			return "Title:  " + title + "\nGenre: " + genre + "\nLong: " + duration + "\nRate: " + rate + "\nCast: " + cast;
		}
	
		public List<Person> getCast() {
			return cast;
		}
	
		public void setCast(List<Person> cast) {
			this.cast = cast;
		}
		
		public String toXMLString() {
			String title = Tools.toXMLTag("title", this.title);
			String genre = Tools.toXMLTag("genre", this.genre.toString());
			String duration = Tools.toXMLTag("duration", String.valueOf(this.duration));
			String rate = Tools.toXMLTag("rate", String.valueOf(this.rate));
			String cast = Tools.toXMLTag("cast", castToXML(this.cast));
			String result = title + genre + duration + rate + cast;
			return Tools.toXMLTag("movie", result);
		}
		
		private static String castToXML(List<Person> people) {
			String personToTag = "";
			for (Person person : people) {
				personToTag += person.toXMLString();
			}
			return personToTag;
		}
	}
