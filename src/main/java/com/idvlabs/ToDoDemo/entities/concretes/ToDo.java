package com.idvlabs.ToDoDemo.entities.concretes;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todoes")
public class ToDo {

	@Id
	private int id;
	private String todoName;
	private String startDate;
	private String deadline;
	
	private User user;
	
}
