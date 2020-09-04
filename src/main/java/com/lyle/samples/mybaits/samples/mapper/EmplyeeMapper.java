package com.lyle.samples.mybaits.samples.mapper;

import com.lyle.samples.mybaits.samples.entity.EmplyeeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmplyeeMapper {
   EmplyeeEntity selectOne(@Param("id") Long id);
}
