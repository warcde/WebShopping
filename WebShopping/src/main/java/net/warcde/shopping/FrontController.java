package net.warcde.shopping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.warcde.shopping.dao.CategoryDAO;
import net.warcde.shopping.dto.Category;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FrontController {

	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/", "home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userClickIndicator", "home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("title", "Home");
		return mv;
	}

	@RequestMapping(value = "about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userClickIndicator", "about");
		mv.addObject("title", "About Us");
		return mv;
	}

	@RequestMapping(value = "contact")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userClickIndicator", "contact");
		mv.addObject("title", "Contact Us");
		return mv;
	}

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "All products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickIndicator", "showAllProducts");
		return mv;
	}

	/**
	 * fetch items in single category
	 * 
	 * @param category
	 *            id
	 * @return
	 */
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("home");

		Category item = categoryDAO.getCategory(id);
		mv.addObject("title", item.getName());
		mv.addObject("item", item);
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickIndicator", "showCategoryProducts");
		return mv;
	}
}
