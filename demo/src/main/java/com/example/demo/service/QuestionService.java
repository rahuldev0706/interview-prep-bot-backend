package com.example.demo.service;

import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
	
    private final List<Question> questions = Arrays.asList(
    			    new Question(101, "DSA", "Explain the difference between a stack and a queue.", "A stack uses LIFO (Last-In, First-Out) ordering, whereas a queue uses FIFO (First-In, First-Out)."),
    			    new Question(102, "DSA", "What is the time complexity of searching in a Binary Search Tree?", "O(log n) in the average case, but can be O(n) in the worst case (unbalanced tree)."),
    			    new Question(103, "DSA", "Describe how quicksort works.", "Quicksort selects a pivot and partitions the array into elements less than and greater than the pivot, recursively sorting each part."),
    			    new Question(104, "DSA", "What data structure would you use to implement a LRU cache?", "A combination of a HashMap and a Doubly Linked List."),
    			    new Question(201, "HR", "Tell me about yourself.", "Start with education, transition to key skills and projects, and conclude with your current goals and enthusiasm for the role."),
    			    new Question(202, "HR", "Describe a time you worked in a team.", "Talk about a project, your role, how you collaborated, and the outcome."),
    			    new Question(203, "HR", "How do you handle stress or pressure?", "By staying organized, prioritizing tasks, and maintaining a positive mindset. I break big tasks into smaller, manageable ones."),
    			    new Question(301, "System Design", "How would you design a URL shortener like bit.ly?", "Use a database to store original and short URLs, a hashing algorithm for unique keys, and consider caching, scalability, and expiration."),
    			    new Question(302, "System Design", "What are the components of a scalable web application?", "Load balancer, web server, app server, database, caching layer, CDN, and monitoring."),
    			    new Question(303, "System Design", "How would you design a chat application?", "Use WebSocket or long polling, manage sessions, persist messages, and ensure delivery and scalability."),
    			    new Question(105, "DSA", "What is the difference between a linked list and an array?", "Arrays offer constant time access but are fixed in size. Linked lists are dynamic but slower to access."),
    			    new Question(106, "DSA", "What is a heap and where is it used?", "A heap is a binary tree used to implement priority queues, where the parent is greater or smaller than its children."),
    			    new Question(107, "DSA", "What is the time complexity of inserting into a heap?", "O(log n) because it may require bubbling up."),
    			    new Question(108, "DSA", "What’s the difference between BFS and DFS?", "BFS explores neighbors first using a queue, while DFS goes deep first using a stack or recursion."),
    			    new Question(109, "DSA", "How do you detect a cycle in a directed graph?", "Using DFS with visited and recursion stack, or Kahn's algorithm."),
    			    new Question(110, "DSA", "Explain dynamic programming with an example.", "It’s breaking problems into subproblems and reusing results. Example: Fibonacci using memoization."),
    			    new Question(111, "DSA", "What is backtracking?", "Trying out all possibilities recursively and backing out when a solution path fails."),
    			    new Question(112, "DSA", "What is the difference between a Set and a Map in Java?", "Set stores unique elements, Map stores key-value pairs."),
    			    new Question(204, "HR", "Why should we hire you?", "Highlight your skills, eagerness to learn, and alignment with company goals."),
    			    new Question(205, "HR", "What are your strengths and weaknesses?", "Strength: problem-solving. Weakness: sometimes overprepare, but learning to balance."),
    			    new Question(206, "HR", "Where do you see yourself in 5 years?", "Growing in a company that challenges me, ideally in a lead developer or architect role."),
    			    new Question(207, "HR", "Tell me about a failure and what you learned from it.", "Share a real experience and focus on what you learned and how you improved."),
    			    new Question(208, "HR", "What motivates you?", "Solving real-world problems, learning new technologies, and being part of a great team."),
    			    new Question(304, "System Design", "How would you design a rate limiter?", "Use a token bucket or sliding window algorithm to allow a fixed number of requests per time."),
    			    new Question(305, "System Design", "How would you design an online code editor?", "Use WebSockets for collaboration, sandboxing for execution, and a distributed task system."),
    			    new Question(306, "System Design", "What is sharding in databases?", "Splitting data across multiple servers to improve performance and scalability."),
    			    new Question(307, "System Design", "What is the CAP theorem?", "It states that a distributed system can only guarantee two of Consistency, Availability, and Partition Tolerance."),
    			    new Question(308, "System Design", "How would you design a YouTube-like video streaming system?", "Use CDN for delivery, chunking for buffering, and metadata service for retrieval."),
    			    new Question(309, "System Design", "How do you scale a database?", "Vertical scaling (bigger machine) or horizontal scaling (sharding/replication). Use caching and denormalization.")
    			    );

    
    public Question getRandomQuestion() {
        return questions.get(new Random().nextInt(questions.size()));
    	//return questions;
    }
}
