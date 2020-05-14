package com.needle.postbatis.mapper;

import com.needle.postbatis.model.VCityWeather;
import com.needle.postbatis.model.VCityWeatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VCityWeatherMapper {
	
    long countByExample(VCityWeatherExample example);

    int deleteByExample(VCityWeatherExample example);

    int insert(VCityWeather record);

    int insertSelective(VCityWeather record);

    List<VCityWeather> selectByExampleWithRowbounds(VCityWeatherExample example, RowBounds rowBounds);

    List<VCityWeather> selectByExample(VCityWeatherExample example);

    int updateByExampleSelective(@Param("record") VCityWeather record, @Param("example") VCityWeatherExample example);

    int updateByExample(@Param("record") VCityWeather record, @Param("example") VCityWeatherExample example);
    
    List<VCityWeather> callFuncById(@Param("id") int id);
}