package kr.co.hta.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.hta.web.vo.Category;

@Mapper
public interface CategoryDao {

	List<Category> getAllCategoryTypes();
}
