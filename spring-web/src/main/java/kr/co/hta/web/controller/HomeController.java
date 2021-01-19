package kr.co.hta.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hta.web.service.BookService;
import kr.co.hta.web.vo.Category;

@Controller
public class HomeController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/home.do")
	public String home(Model model) {
		
		List<Category> categories = bookService.getAllCategories();
		model.addAttribute("categories", categories);
		
		return "home";
	}
}
