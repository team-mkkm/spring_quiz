package jp.co.sss.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.sss.training.entity.Department;

@Mapper
public interface DepartmentMapper {

	List<Department> findAll();

}
