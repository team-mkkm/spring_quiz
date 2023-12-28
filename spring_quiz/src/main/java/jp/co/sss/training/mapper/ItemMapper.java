package jp.co.sss.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.training.entity.Item;

@Mapper
public interface ItemMapper {
	
	List<Item> findByPriceAndGenreId(@Param("price") Integer price, @Param("genreId") Integer genreId);
	
	List<Item> findByPriceOrGenreId(@Param("price") Integer price, @Param("genreId") Integer genreId);
	
	List<Item> findByOrderByPriceAsc();
	
	List<Item> findTop5ByOrderByPriceDesc();
	
	List<Item> findByNameStartingWith(@Param("name") String name);

}
