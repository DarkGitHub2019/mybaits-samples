package com.lyle.samples.mybaits.samples.mapper;

import com.lyle.samples.mybaits.samples.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

 //   @Select("SELECT id,user_name FROM test_user WHERE id= #{id}")
     UserEntity selectOneById(@Param("id") Long id);

     @Insert("INSERT INTO test_user SET id=#{id},user_name=#{name}")
    void insert(@Param("id") Long id,@Param("name") String name);
}
