package uk.ac.ebi.biosd.ebisc.model;

import java.util.List;

public class PrimaryDisease {
	private String doid;
	private String name;
	private List<String> synonyms;
	
	public String getDoid() {
		return doid;
	}
	public void setDoid(String doid) {
		this.doid = doid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

}
