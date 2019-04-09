package org.zhengyj.springbootjpa.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Person
 * @Description
 * @Author zhengyingjun
 * @Date 2019/3/25 15:50
 * @Version 1.0
 **/
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String nickname;
    private Integer age;

    public Person(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
