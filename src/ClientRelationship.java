
public class ClientRelationship {
	 private int relationshipID;
	 private Client client;
	 private Pet pet;
	 private String relationshipStatus;


	 public int getRelationshipID() { return relationshipID; }
	 public void setRelationshipID(int relationshipID) { this.relationshipID = relationshipID; }
	 public Client getClient() { return client; }
	 public void setClient(Client client) { this.client = client; }
	 public Pet getPet() { return pet; }
	 public void setPet(Pet pet) { this.pet = pet; }
	 public String getRelationshipStatus() { return relationshipStatus; }
	 public void setRelationshipStatus(String relationshipStatus) { this.relationshipStatus = relationshipStatus; }
}
