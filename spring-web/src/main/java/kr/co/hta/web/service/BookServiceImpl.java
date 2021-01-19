package kr.co.hta.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.web.dao.BookDao;
import kr.co.hta.web.dao.CategoryDao;
import kr.co.hta.web.vo.Book;
import kr.co.hta.web.vo.Category;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategories() {
		List<Category> categories = categoryDao.getAllCategoryTypes();
		return categories;
	}

	@Override
	public List<Book> getBooks(int categoryType) {
		// TODO Auto-generated method stub
		return null;
	}

}
