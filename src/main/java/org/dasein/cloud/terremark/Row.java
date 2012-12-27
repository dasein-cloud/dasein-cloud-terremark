package org.dasein.cloud.terremark;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Row {
	
	private String name;
	private String id;
	private HashMap<String, String> groups = new HashMap<String, String>();  //key is id, value is name
	
	public Row() {}
	
	public void addGroup(String id, String name){
		groups.put(id, name);
	}
	
	public HashMap<String, String> getGroups() {
		return groups;
	}
	
	public boolean hasGroup(String name){
		return groups.containsValue(name);
	}
	
	public String getGroupId(String name){
		String groupId = null;
		Set<String> groupIds = groups.keySet();
		Iterator<String> itr = groupIds.iterator();
		while (itr.hasNext()){
			String id = itr.next();
			if (groups.get(id).equals(name)){
				groupId = id;
				break;
			}
		}
		
		return groupId;
	}
	
	public String getGroupName(String id){
		return groups.get(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
