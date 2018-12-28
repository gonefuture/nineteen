package cn.zhku.education.pojo.dao;

import cn.zhku.education.pojo.entity.Srcnotfoundexception;
import cn.zhku.education.pojo.entity.SrcnotfoundexceptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrcnotfoundexceptionMapper {
    int countByExample(SrcnotfoundexceptionExample example);

    int deleteByExample(SrcnotfoundexceptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Srcnotfoundexception record);

    int insertSelective(Srcnotfoundexception record);

    List<Srcnotfoundexception> selectByExample(SrcnotfoundexceptionExample example);

    Srcnotfoundexception selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Srcnotfoundexception record, @Param("example") SrcnotfoundexceptionExample example);

    int updateByExample(@Param("record") Srcnotfoundexception record, @Param("example") SrcnotfoundexceptionExample example);

    int updateByPrimaryKeySelective(Srcnotfoundexception record);

    int updateByPrimaryKey(Srcnotfoundexception record);
}