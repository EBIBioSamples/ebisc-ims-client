package uk.ac.ebi.biosd.ebisc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"depositor", "reprogramming_method", "cellline_karyotype"})
public class CellLine {
	private List<String> alternativeNames;
	private List<Batch> batches;
	private String biosamplesId;
	private Donor donor;
	private int donorAge;
	private String ecaccCatNo;
	private String name;
	private PrimaryCellType primaryCellType;
	private Object primaryDisease; //sometimes this is a string, sometimes more
	private String primaryDiseaseDiagnosed;
	private String resourceURI;
	
	@JsonProperty("alternative_names")
	public List<String> getAlternativeNames() {
		return alternativeNames;
	}
	@JsonProperty("alternative_names")
	public void setAlternativeNames(List<String> alternativeNames) {
		this.alternativeNames = alternativeNames;
	}
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	@JsonProperty("biosamples_id")
	public String getBiosamplesId() {
		return biosamplesId;
	}
	@JsonProperty("biosamples_id")
	public void setBiosamplesId(String biosamplesId) {
		this.biosamplesId = biosamplesId;
	}
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	@JsonProperty("donor_age")
	public int getDonorAge() {
		return donorAge;
	}
	@JsonProperty("donor_age")
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	@JsonProperty("ecacc_cat_no")
	public String getEcaccCatNo() {
		return ecaccCatNo;
	}
	@JsonProperty("ecacc_cat_no")
	public void setEcaccCatNo(String ecaccCatNo) {
		this.ecaccCatNo = ecaccCatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("primary_cell_type")
	public PrimaryCellType getPrimaryCellType() {
		return primaryCellType;
	}
	@JsonProperty("primary_cell_type")
	public void setPrimaryCellType(PrimaryCellType primaryCellType) {
		this.primaryCellType = primaryCellType;
	}
	@JsonProperty("primary_disease")
	public Object getPrimaryDisease() {
		return primaryDisease;
	}
	@JsonProperty("primary_disease")
	public void setPrimaryDisease(Object primaryDisease) {
		this.primaryDisease = primaryDisease;
	}
	@JsonProperty("primary_disease_diagnosed")
	public String getPrimaryDiseaseDiagnosed() {
		return primaryDiseaseDiagnosed;
	}
	@JsonProperty("primary_disease_diagnosed")
	public void setPrimaryDiseaseDiagnosed(String primaryDiseaseDiagnosed) {
		this.primaryDiseaseDiagnosed = primaryDiseaseDiagnosed;
	}
	@JsonProperty("resource_uri")
	public String getResourceURI() {
		return resourceURI;
	}
	@JsonProperty("resource_uri")
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	
}
