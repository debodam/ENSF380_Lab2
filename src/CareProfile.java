import java.util.List;

public class CareProfile {
    private int careProfileID;
    private String feedingInstructions;
    private List<String> medicationList;
    private String medicationInstructions;
    
    public int getCareProfileID() { return careProfileID; }
    public void setCareProfileID(int careProfileID) { this.careProfileID = careProfileID; }
    public String getFeedingInstructions() { return feedingInstructions; }
    public void setFeedingInstructions(String feedingInstructions) { this.feedingInstructions = feedingInstructions; }
    public List<String> getMedicationList() { return medicationList; }
    public void setMedicationList(List<String> medicationList) { this.medicationList = medicationList; }
    public String getMedicationInstructions() { return medicationInstructions; }
    public void setMedicationInstructions(String medicationInstructions) { this.medicationInstructions = medicationInstructions; }
}

