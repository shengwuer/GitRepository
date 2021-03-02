package com.lypowernode;

import com.lypowernode.dao.StudentDao;
import com.lypowernode.domain.Student;
import com.lypowernode.service.StudentService;
import com.lypowernode.service.impl.StudentServiceImpl;
import com.mysql.jdbc.UpdatableResultSet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.object.UpdatableSqlQuery;

import java.util.List;
import java.util.UUID;

public class MyTest {
    private Object UpdatableResultSet;

    @Test
    public void test(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] names = ac.getBeanDefinitionNames();
      /*
        容器对象的名称 : myDataSource | com.alibaba.druid.pool.DruidDataSource
        容器对象的名称 : sqlSessionFactory | org.apache.ibatis.session.defaults.DefaultSqlSessionFactory
        容器对象的名称 : studentService | com.lypowernode.service.impl.StudentServiceImpl
      */
        for (String name : names){
            System.out.println("容器对象的名称 : "+name+" | "+ac.getBean(name));
        }
    }
    @Test
    public void testDaoInsert(){

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 获取spring容器中StudentDao对象studentDao
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        //用studentDao对象调用insertStudent()方法添加信息
        Student student = new Student(20231,"s生悟","shengwu@163.com",29);
        studentDao.insertStudent(student);
    }

    @Test
    public void testDaoSelect(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 获取spring容器中StudentDao对象studentDao
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        System.out.println("动态代理 : "+studentDao.getClass().getName());
        Student student = new Student();
        studentDao.SelcetStudents();

    }

    @Test
    public void testServiceAdd(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentServiceImpl) ac.getBean("studentService");
        Student student = new Student();
        student.setId(202105);
        student.setName("关雨东");
        student.setEmail("guanlinzheng@163.com");
        student.setAge(31);
        service.addStudent(student);
         // spring和mybatis整合一起使用是自动提交的 , 无需执行Sqlsession.commit();
    }

    @Test
    public void testServiceQuery(){

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentServiceImpl) ac.getBean("studentService");
        System.out.println("动态代理 : "+service.getClass().getName());
        List<Student> students = service.queryStudents();
        for (Student student : students){
            System.out.println("黄埔一期学员名单明细 : "+student);
        }
    }
}
