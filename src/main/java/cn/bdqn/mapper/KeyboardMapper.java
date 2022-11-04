package cn.bdqn.mapper;

import cn.bdqn.pojo.Keyboard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Property;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface KeyboardMapper {
    List<Keyboard> queryPerson(int id);
    List<Keyboard> queryAll();
    int dePerson(int id);
    int inPerson(@Param("type") String type,@Param("brand") String brand,@Param("color") String color,@Param("price") String price);
    int upPerson(@Param("id")int id,@Param("type") String type,@Param("brand") String brand,@Param("color") String color,@Param("price") String price);
}