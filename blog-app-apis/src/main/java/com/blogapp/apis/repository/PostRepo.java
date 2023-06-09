package com.blogapp.apis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.apis.model.Category;
import com.blogapp.apis.model.Post;
import com.blogapp.apis.model.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findAllByUser(User user);

	List<Post> findAllByCategory(Category category);

}
