 ch07-spring-mybatis : spring和mybatis的集成

    步骤 :
    1. 新建maven项目
    2. 加入maevn依赖
     1). spring依赖
     2). mybtis依赖
     3). mysql依赖
     4). spring的事务依赖
     5). 阿里的druid依赖
     5). mybatis和spring集成的依赖 : mybatis官方提供的 , 用来在spring项目中创建mybatis
         的SqlSessionFactor , dao对象的
    3. 创建实体类
    4. 创建dao接口和mapper文件
    5. 创建mybatis主配置文件
    6. 创建service接口和实现类 , 属性是dao
    7. 创建spring的配置文件 : 声明mybatis的对象交给spring创建
        1). 数据源
        2). SqlSessionFactory
        3). Dao对象
        4). 声明自定义的service
    8. 创建测试类获取service对象 通过service调用Dao完成数据库的访问
