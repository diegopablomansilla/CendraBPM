package org.cendra.bpm;

public class AbstractEntity {
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id != null){
			id = id.trim();
		}
		this.id = id;
	}
	
	
	

}
