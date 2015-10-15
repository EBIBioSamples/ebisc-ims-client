package uk.ac.ebi.biosd.ebisc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Batch {
	private String batchId;
	private String biosamplesId;
	

	@JsonProperty("batch_id")
	public String getBatchId() {
		return batchId;
	}
	@JsonProperty("batch_id")
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	@JsonProperty("biosamples_id")
	public String getBiosamplesId() {
		return biosamplesId;
	}
	@JsonProperty("biosamples_id")
	public void setBiosamplesId(String biosamplesId) {
		this.biosamplesId = biosamplesId;
	}
}
