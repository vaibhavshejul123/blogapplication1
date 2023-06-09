package com.blogapp.apis.service;

import java.util.List;

import com.blogapp.apis.model.Category;
import com.blogapp.apis.model.Post;
import com.blogapp.apis.model.User;
import com.blogapp.apis.paylods.PostDto;

public interface PostService {

//	create

	PostDto createPost(PostDto postDto, Integer userId,Integer categoryId);

//	update

	PostDto updatePost(PostDto postDto, Integer postId);

//	delete

	void deletePost(Integer postId);

//	get single post 
	PostDto getPostById(Integer postId);

//	get all posts

	List<Post> getAllPostById(Integer PostId);

//	get post by category

	List<Post> getPostByCategory(Integer categoryId);

//  get post by user

	List<Post> getPostByUser(Integer userId);

// search post
	List<Post> searchPosts(String keyword);

}
