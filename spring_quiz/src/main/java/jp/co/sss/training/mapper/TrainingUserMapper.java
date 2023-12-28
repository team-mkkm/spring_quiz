package jp.co.sss.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.training.entity.TrainingUser;

@Mapper
public interface TrainingUserMapper {
	List<TrainingUser> findAll();
	List<TrainingUser> search(@Param("userId")String userId, @Param("password")String password);
	Boolean insert(TrainingUser trainingUser);
	Boolean update(TrainingUser trainingUser);
	TrainingUser getOne(@Param("id")int id); 
	List<TrainingUser> findByUserIdLike(@Param("userId") String userId);
	Integer countByName(@Param("userId") String userId);			
}