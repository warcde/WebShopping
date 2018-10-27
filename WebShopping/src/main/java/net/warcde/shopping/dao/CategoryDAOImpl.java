package net.warcde.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.warcde.shopping.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList();

	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("television");
		category.setDescription("description of television");
		category.setImageURL("CAT1.png");

		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("description of mobile");
		category.setImageURL("CAT2.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDescription("description of laptop");
		category.setImageURL("CAT3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories){
			if(category.getId() == id){
				return category;
			}
		}
		return null;
	}

}
