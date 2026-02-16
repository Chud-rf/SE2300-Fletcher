package todoli;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDoList {
	
	private String name;
	private HashMap<Integer, String> tasks;
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
	
	public void addTask(String task) {
		tasks.put(count.getAndIncrement(), task);
	}

}
