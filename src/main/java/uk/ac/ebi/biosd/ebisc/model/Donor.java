package uk.ac.ebi.biosd.ebisc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donor {
	private String biosamplesId;
	private String gender;
	

	@JsonProperty("biosamples_id")
	public String getBiosamplesId() {
		return biosamplesId;
	}
	@JsonProperty("biosamples_id")
	public void setBiosamplesId(String biosamplesId) {
		this.biosamplesId = biosamplesId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
