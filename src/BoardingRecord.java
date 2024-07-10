
public class BoardingRecord {
    private int boardingID;
    private String checkInDate;
    private String checkOutDate;
    private Pet pet;
    private CareProfile careProfile;

    public int getBoardingID() { return boardingID; }
    public void setBoardingID(int boardingID) { this.boardingID = boardingID; }
    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }
    public CareProfile getCareProfile() { return careProfile; }
    public void setCareProfile(CareProfile careProfile) { this.careProfile = careProfile; }
    
    public double calculateBoardingCost() {
    	return 0.0;
    }
    
}

