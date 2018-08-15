package cn.it.service.impl;

import cn.it.domain.User;
import cn.it.mapper.UserMapper;
import cn.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    /**
     * 测试：redis缓存
     */
    //@Cacheable(value="findAll")
    public List<User> findAll() {
        System.out.println("hello redis cache");
        List<User>  list = userMapper.findAll();
        return list;
    }

    public  String findRedis(){
        jedisCluster.set("username","yy");
        String value = jedisCluster.get("username");
        return  value;
    }


}
