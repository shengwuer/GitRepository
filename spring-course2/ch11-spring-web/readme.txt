ch11-spring-web : 在web项目中使用sping , 完成学生注册功能

  实施步骤 :
  1. 创建maven , web项目
  2. 加入依赖
     同ch07依赖再加jsp , servlet , web 依赖
  3. 做一个学生注册项目 : 拷贝ch07-spring-mybatis的代码和配置文件
  4. 创建一个jsp发起请求 , 有参数id , name , email , age.
  5. 创建Servlet , 接受请求参数 , 调用 Service ,调用dao完成注册
  6.创建一个jsp作为显示结果页面