package cn.zhku.education.pojo.dao;

import cn.zhku.education.pojo.entity.Copyfailexception;
import cn.zhku.education.pojo.entity.CopyfailexceptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CopyfailexceptionMapper {
    int countByExample(CopyfailexceptionExample example);

    int deleteByExample(CopyfailexceptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Copyfailexception record);

    int insertSelective(Copyfailexception record);

    List<Copyfailexception> selectByExample(CopyfailexceptionExample example);

    Copyfailexception selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Copyfailexception record, @Param("example") CopyfailexceptionExample example);

    int updateByExample(@Param("record") Copyfailexception record, @Param("example") CopyfailexceptionExample example);

    int updateByPrimaryKeySelective(Copyfailexception record);

    int updateByPrimaryKey(Copyfailexception record);
}