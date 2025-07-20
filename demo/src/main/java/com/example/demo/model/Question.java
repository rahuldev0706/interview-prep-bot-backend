package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private int id;
    private String type;       // e.g., "DSA", "HR"
    private String question;
    private String idealAnswer;
    
//    public Question(int id,String type,String question,String idealAnswer)
//    {
//    	this.id=id;
//    	this.type=type;
//    	this.question=question;
//    	this.idealAnswer=idealAnswer;
//    }
    
//    public int getId()
//    {
//    	return id;
//    }
//    
//    public String getType()
//    {
//    	return type;
//    }
//    
//    public String getquestion()
//    {
//    	return question;
//    }
//    
//    public String getIdealAnswer()
//    {
//    	return idealAnswer;
//    }
    
    
}
