package todoli;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDoList {
	
	private String name;
	private List<String> tasks = new ArrayList<>();
	private AtomicInteger count = new AtomicInteger();
	
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
		return count.get();
	}
	
	public void addTask(String task) {
		tasks.add(count.getAndIncrement(), task);
	}

}
