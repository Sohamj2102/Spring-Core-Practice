package com.nit.sbeans;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskProcessor {
	private List<String>list=new LinkedList<>();

	public TaskProcessor() {
		System.out.println("TaskProcessor.TaskProcessor()");
	}
	public void process(String taskName)
	{
		list.add(taskName);
		System.out.println(taskName+" task is added for process :");
	}
	public void getTask()
	{
		
		System.out.println("Currently performing task is:"+list);
	}
	
	
}
