package jp.co.sss.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.training.entity.Food;

@Mapper
public interface FoodMapper {
	
	List<Food> findAll();
	
	List<Food> findByNameLike(@Param("name") String name);
	
	Food findById(@Param("id") long id);
	
	void insert(Food food);
	
	void update(Food food);
	
	void deleteById(@Param("id") long id);

}
