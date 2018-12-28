package cn.zhku.education.pojo.dao;

import cn.zhku.education.pojo.entity.ApiLog;
import cn.zhku.education.pojo.entity.ApiLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiLogMapper {
    int countByExample(ApiLogExample example);

    int deleteByExample(ApiLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiLog record);

    int insertSelective(ApiLog record);

    List<ApiLog> selectByExample(ApiLogExample example);

    ApiLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiLog record, @Param("example") ApiLogExample example);

    int updateByExample(@Param("record") ApiLog record, @Param("example") ApiLogExample example);

    int updateByPrimaryKeySelective(ApiLog record);

    int updateByPrimaryKey(ApiLog record);
}