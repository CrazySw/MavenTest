package com.Cirno.DAO;

import com.Cirno.POJO.Test;

import java.util.List;

public interface TestDAO {
    List<Test> selectAll();
    void updateById(Test test);
    void deleteById(Integer id);
    int insert(Test test);
}
