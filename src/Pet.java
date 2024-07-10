
public class Pet {
	private int petID;
	private String name;
	private String species;
	private String breed;
	private String dateOfBirth;
	private String comments;
	
	
	public Pet(String petName) {
	}
	public Pet() {
	}
	public int getPetID() { return petID; }
    public void setPetID(int petID) { this.petID = petID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}
