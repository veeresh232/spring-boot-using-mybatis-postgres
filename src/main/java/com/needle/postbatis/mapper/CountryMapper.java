package com.needle.postbatis.mapper;

import com.needle.postbatis.model.Country;
import com.needle.postbatis.model.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CountryMapper {
    long countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    List<Country> selectByExampleWithRowbounds(CountryExample example, RowBounds rowBounds);

    List<Country> selectByExample(CountryExample example);

    Country selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}