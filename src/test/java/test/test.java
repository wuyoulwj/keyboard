package test;

import cn.bdqn.pojo.Keyboard;
import cn.bdqn.service.KeyboardService;
import cn.bdqn.service.impl.KeyboardServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void testa(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        KeyboardService keyboardService=applicationContext.getBean(KeyboardService.class);
        List<Keyboard> list=keyboardService.queryAll();
        //按id查询单个person
        System.out.println(keyboardService.queryPerson(1));
        //查询所有的person，并放到到list中
        System.out.println(list);
        //按id删除单个person
        int a=keyboardService.dePerson(2);
        if (a>0){
            System.out.println("删除成功");
        }
        //新增一个person
        int b=keyboardService.inPerson("冰淇淋轴","wy","白色","999");
        if (b>0){
            System.out.println("新增成功");
        }
        //修改单个person
        int c=keyboardService.upPerson(2,"冰淇淋轴","wy","白色","999");
        if (c>0){
            System.out.println("修改成功");
        }


    }
}
