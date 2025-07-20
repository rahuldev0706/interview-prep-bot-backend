package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpServletRequest;



import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "*")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/random")
	public Question getRandomquestion() {
	    return questionService.getRandomQuestion();
	}
	
	
	

	
}
