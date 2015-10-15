package uk.ac.ebi.biosd.ebisc.model;

import java.util.List;

public class CellLinePage {

	private CellLinePageMeta meta;
	
	private List<CellLine> objects;
	
	public CellLinePageMeta getMeta() {
		return meta;
	}

	public void setMeta(CellLinePageMeta meta) {
		this.meta = meta;
	}

	public List<CellLine> getObjects() {
		return objects;
	}

	public void setObjects(List<CellLine> objects) {
		this.objects = objects;
	}
}
