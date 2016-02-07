package basicjava;

public class Person {
			String firstName;
			String lastName;
			Gender gender;
			boolean hasOscar;
			boolean hasGoldenGlobe;
			
			public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.gender = gender;
				this.hasOscar = hasOscar;
				this.hasGoldenGlobe = hasGoldenGlobe;
			    }
		
			public String getFirstName() {
				return firstName;
			}
			
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			
			public String getLastName() {
				return lastName;
			}
			
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			
			public Gender getGender() {
				return gender;
			}
			
			public void setGender(Gender gender) {
				this.gender = gender;
			}
			
			public boolean isHasOscar() {
				return hasOscar;
			}
			
			public void setHasOscar(boolean hasOscar) {
				this.hasOscar = hasOscar;
			}
			
			public boolean isHasGoldenGlobe() {
				return hasGoldenGlobe;
			}
			
			public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
				this.hasGoldenGlobe = hasGoldenGlobe;
			}
			
			public String toString(){
				return "First name: " + firstName + "\nLast name: " + lastName + "\nGender: " + gender + "\nHas oscar: " + hasOscar + "\nHas Golden Globe: " + hasGoldenGlobe;
			}
			
			public String toXMLString() {
				String firstname = Tools.toXMLTag("firstName", this.firstName);
				String lastname = Tools.toXMLTag("lastName", this.lastName);
				String gender = Tools.toXMLTag("gender", this.gender.toString());
				String hasoscar = Tools.toXMLTag("hasOscar", String.valueOf(this.isHasOscar()));
				String hasgoldenglobe = Tools.toXMLTag("hasGoldenGlobe", String.valueOf(this.isHasGoldenGlobe()));
				String result = Tools.toXMLTag("person", firstname + lastname + gender + hasoscar + hasgoldenglobe);
				return result;
			}
		}
