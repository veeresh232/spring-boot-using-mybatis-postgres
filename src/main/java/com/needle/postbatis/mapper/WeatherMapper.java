package com.needle.postbatis.mapper;

import com.needle.postbatis.model.Weather;
import com.needle.postbatis.model.WeatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeatherMapper {
    long countByExample(WeatherExample example);

    int deleteByExample(WeatherExample example);

    int insert(Weather record);

    int insertSelective(Weather record);

    List<Weather> selectByExampleWithRowbounds(WeatherExample example, RowBounds rowBounds);

    List<Weather> selectByExample(WeatherExample example);

    int updateByExampleSelective(@Param("record") Weather record, @Param("example") WeatherExample example);

    int updateByExample(@Param("record") Weather record, @Param("example") WeatherExample example);
}