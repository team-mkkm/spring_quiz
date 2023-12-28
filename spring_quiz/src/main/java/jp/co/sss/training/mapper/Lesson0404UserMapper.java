package jp.co.sss.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.training.dto.User0405Dto;
import jp.co.sss.training.entity.Lesson0404User;

@Mapper
public interface Lesson0404UserMapper {
	
	List<Lesson0404User> findByDepartmentId(@Param("departmentId") Long departmentId);
	
	List<User0405Dto> getUser0405Dto(@Param("departmentId") Long departmentId);

}
