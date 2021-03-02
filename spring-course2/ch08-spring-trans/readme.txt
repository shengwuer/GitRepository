ch08-spring-mybatis : 做事务的环境项目

实施步骤:
1. 新建maven
2. 加入依赖(ch07)
3. 创建实体类
Sale , Goods
4. 创建dao接口和mapper文件
5. 创建mybatis主配置文件
6. 创建service接口和实现类,属性是saleDao ,goodsDao.
7. 创建spring的配置文件 : 声明mybatis的对象交给spring创建
      1). 数据源DataSource的对象
      2). 创建SqlsessionFactory接口实现类SqlsessionFactoryBeanName的对象sqlsessionFactory
      3). 创建Dao对象
      4). 声明自定义的service