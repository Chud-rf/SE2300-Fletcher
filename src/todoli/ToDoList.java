package todoli;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	
	private String name;
	private List<String> tasks = new ArrayList<>();
	
	public ToDoList(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTask(int index) {
		return tasks.get(index);
	}
	
	public int getTaskCount() {
		return tasks.size();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removeTask(int index) {
		tasks.remove(index);
	}

}
