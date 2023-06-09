package com.blogapp.apis.paylods;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
public class CategoryDto {

	private String categoryId;
	private String categoryTitle;
	private String categoryDescription;
}
