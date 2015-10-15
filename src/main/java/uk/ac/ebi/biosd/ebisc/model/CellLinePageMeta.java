package uk.ac.ebi.biosd.ebisc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CellLinePageMeta {

	private int limit;
	private int offset;
	private String next;
	private String previous;
	private int totalCount;
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getOffset() {
		return offset;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public String getNext() {
		return next;
	}
	
	public void setNext(String next) {
		this.next = next;
	}
	
	public String getPrevious() {
		return previous;
	}
	
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	
	@JsonProperty("total_count")
	public int getTotalCount() {
		return totalCount;
	}
	
	@JsonProperty("total_count")
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
