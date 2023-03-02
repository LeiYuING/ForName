package com.leiyu.Service;

import com.leiyu.mapper.FornameMapper;
import com.leiyu.pojo.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FornameServiceImpl implements FornameService{
    @Autowired
    private FornameMapper fornameMapper;

    @Override
    public List<String> getName(Map map) {
        return fornameMapper.getName(map);
    }
}
