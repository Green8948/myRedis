# Spring Boot + Mybatis + Redis二级缓存 
  
  mybatis逆向生成所需文件
  
  Spring-Boot因其提供了各种开箱即用的插件，使得它成为了当今
  最为主流的Java Web开发框架之一。Mybatis是一个十分轻量好用
  的ORM框架。Redis是当今十分主流的分布式key-value型数据库，
  在web开发中，我们常用它来缓存数据库的查询结果。

  使用Spring-Boot快速搭建一个Web应用，并且采用Mybatis作为我
  们的ORM框架。为了提升性能，我们将Redis作为Mybatis的二级缓
  存。

  @RequestMapping、@GetMapping、@PutMapping：表示接口的URL地
  址。
  标注在类上的@RequestMapping注解表示该类下的所有接口的URL都
  以/product开头。
  @GetMapping表示这是一个Get HTTP接口，
  @PutMapping表示这是一个Put HTTP接口。
  
  redis水平扩展主从节点
  redis-trib.rb add-node
  redis-trib.rb reshard 