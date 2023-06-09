package com.blogapp.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.apis.model.Post;
import com.blogapp.apis.paylods.PostDto;
import com.blogapp.apis.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	private PostService postService;

//create

	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto, @PathVariable Integer UserId,
			@PathVariable Integer CategoryId) {
				
				PostDto createPost = this.postService.createPost(postDto,UserId,CategoryId);
		
		return new ResponseEntity<PostDto>(createPost,HttpStatus.CREATED);
	}
}
