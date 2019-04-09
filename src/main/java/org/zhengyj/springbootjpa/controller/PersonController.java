package org.zhengyj.springbootjpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zhengyj.springbootjpa.entity.Person;
import org.zhengyj.springbootjpa.repository.PersonRepository;

import java.util.List;

/**
 * @ClassName PersonController
 * @Description 控制层
 * @Author zhengyingjun
 * @Date 2019/3/25 16:23
 * @Version 1.0
 **/
@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    /**
     * 获取所有数据
     * @return
     */
    @GetMapping("/person")
    public List<Person> personList(){
       return  personRepository.findAll();
    }

    /**
     * 新增数据
     * @param name
     * @param nickname
     * @return
     */
    @PostMapping("/addperson")
    public Person addPerson(@RequestParam(value = "name",required=false) String name,
                            @RequestParam(value = "nickname",required = false) String nickname,
                            @RequestParam(value = "age" ,required = false) Integer age){
        Person person = new Person();
        person.setName(name);
        person.setNickname(nickname);
        person.setAge(age);
        return personRepository.save(person);
    }

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    @GetMapping("/person/{id}")
    public Person personFindOne(@PathVariable(value = "id",required = false) Integer id){
        Person person = new Person();
        //getOne方法可能会报错，故使用findById(参数).get()
        person = personRepository.findById(id).get();
        return person;
    }

    /**
     * 删除根据主键数据
     * @param id
     */
    @DeleteMapping("/person/{id}")
    public void personDelete(@PathVariable(value = "id",required = false) Integer id){
        System.out.println("删除记录：id ："+id);
        personRepository.deleteById(id);
    }

    /**
     * 更新数据根据主键id
     * @param name
     * @param nickname
     * @return
     */
    @PutMapping("/person/{id}")
    public Person personUpdate(@RequestParam(value = "name",required = false) String name,
                               @RequestParam(value = "nickname",required = false) String nickname,
                               @RequestParam(value = "age",required = false) Integer age){
        Person person = new Person();
            person.setName(name);
            person.setNickname(nickname);
            person.setAge(age);
            personRepository.save(person);
        return person;
    }

    /**
     * 自定义查询
     * @param age
     * @return
     */
    @GetMapping("/person/age/{age}")
    public List<Person> getDataByAge(@PathVariable(value = "age",required = false) Integer age){
        return personRepository.findByAge(age);
    }
}
