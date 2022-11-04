package cn.bdqn.service;

import cn.bdqn.pojo.Keyboard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeyboardService {
    List<Keyboard> queryPerson(int id);
    List<Keyboard> queryAll();
    int dePerson(int id);
    int inPerson(@Param("type") String type, @Param("brand") String brand, @Param("color") String color, @Param("price") String price);
    int upPerson(@Param("id")int id,@Param("type") String type,@Param("brand") String brand,@Param("color") String color,@Param("price") String price);
}
