package cn.it.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/8/13.
 */
@Configuration   //applicationContext.xml
public class RedisConfig {
    //注入集群节点信息
    @Value("${spring.redis.cluster.nodes}")
    private String clusterNodes;

    @Bean
    public JedisCluster getJedisCluster(){

      String[]  cNodes= clusterNodes.split(",");

        Set<HostAndPort>  nodes = new HashSet<HostAndPort>();

         for(String node : cNodes){
          String[]  hp = node.split(":");

             nodes.add(new HostAndPort(hp[0],Integer.parseInt(hp[1])));

               System.out.println("================");
                  System.out.println(hp[0]);
                  System.out.println(hp[1]);

         }


         JedisCluster jedisCluster = new JedisCluster(nodes);

         return  jedisCluster;
    }
}
