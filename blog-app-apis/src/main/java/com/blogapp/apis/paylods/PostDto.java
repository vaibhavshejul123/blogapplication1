package com.blogapp.apis.paylods;

import java.util.Date;

import com.blogapp.apis.model.Category;
import com.blogapp.apis.model.User;

import jakarta.persistence.Column;


public class PostDto {

	private String title;

	private String content;

	private String imageName;

	private Date addedDate;
	
	private User user;
	
	private Category category;

}
