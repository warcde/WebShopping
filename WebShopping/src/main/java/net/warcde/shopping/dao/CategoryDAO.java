package net.warcde.shopping.dao;

import java.util.List;

import net.warcde.shopping.dto.Category;

public interface CategoryDAO {
	public List<Category> list();
	public Category getCategory(int id);
}
