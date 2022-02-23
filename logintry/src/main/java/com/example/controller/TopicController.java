package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TopicDAO;
import com.example.model.Topic;


@CrossOrigin(origins = "*")
@RestController
public class TopicController {

		@Autowired
		private TopicDAO tDAO;

		
		@GetMapping("/topics")
		public List<Topic> getlogin() {
			return tDAO.getAll();
		}

		@PostMapping("/topics")
		public String savelogin(@RequestBody Topic log) {
			System.out.println("Topic added successfully");
		return	tDAO.save(log)+"No . of rows saved to the database";		
		}

		@DeleteMapping("/topics/{id}")
		public String deleteloginById(@PathVariable int id) {
			return tDAO.delete(id) + " no of rows deleted from the database";
		}

	
	
}
