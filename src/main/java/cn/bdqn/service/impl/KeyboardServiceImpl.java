package cn.bdqn.service.impl;

import cn.bdqn.mapper.KeyboardMapper;
import cn.bdqn.pojo.Keyboard;
import cn.bdqn.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardServiceImpl implements KeyboardService {

    @Autowired
    KeyboardMapper keyboardMapper;
    @Override
    public List<Keyboard> queryPerson(int id) {
        return keyboardMapper.queryPerson(id);
    }

    @Override
    public List<Keyboard> queryAll() {
        return keyboardMapper.queryAll();
    }

    @Override
    public int dePerson(int id) {
        return keyboardMapper.dePerson(id);
    }

    @Override
    public int inPerson(String type, String brand, String color, String price) {
        return keyboardMapper.inPerson(type,brand,color,price);
    }

    @Override
    public int upPerson(int id, String type, String brand, String color, String price) {
        return keyboardMapper.upPerson(id,type,brand,color,price);
    }
}
