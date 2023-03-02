package com.leiyu.mapper;

import com.leiyu.Service.FornameService;
import com.leiyu.pojo.Name;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;

@Mapper
@Repository
public interface FornameMapper {

    List<String> getName(Map map);
}
