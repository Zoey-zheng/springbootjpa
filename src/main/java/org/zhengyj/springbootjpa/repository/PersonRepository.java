package org.zhengyj.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zhengyj.springbootjpa.entity.Person;

import java.util.List;

/**
 * ClassName: PersonRepository</br>
 * Function:实现jpa核心
 *
 * @author yingjun.zheng</br>
 * @version 1.0</br>
 * @Date 2019/3/25 16:23</br>
 *
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
    /**
     * 根据年龄查询数据
     * @param age
     * @return
     */
    List<Person> findByAge(Integer age);
}
