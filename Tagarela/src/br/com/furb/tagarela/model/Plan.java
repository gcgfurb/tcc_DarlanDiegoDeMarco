package br.com.furb.tagarela.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PLAN.
 */
public class Plan {

    private Integer serverID;
    private String name;
    private Integer planType;
    private Integer layout;
    private String description;
    private Integer userID;
    private Integer patientID;

    public Plan() {
    }

    public Plan(Integer serverID, String name, Integer planType, Integer layout, String description, Integer userID, Integer patientID) {
        this.serverID = serverID;
        this.name = name;
        this.planType = planType;
        this.layout = layout;
        this.description = description;
        this.userID = userID;
        this.patientID = patientID;
    }

    public Integer getServerID() {
        return serverID;
    }

    public void setServerID(Integer serverID) {
        this.serverID = serverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Integer getLayout() {
        return layout;
    }

    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return getName();
    }

}
