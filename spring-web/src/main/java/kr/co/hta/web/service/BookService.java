package kr.co.hta.web.service;

import java.util.List;

import kr.co.hta.web.vo.Book;
import kr.co.hta.web.vo.Category;

public interface BookService {

	List<Category> getAllCategories();
	
	List<Book> getBooks(int categoryType);
}
