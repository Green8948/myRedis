package cn.it.service;
import cn.it.domain.User;
import java.util.List;
/**
 * Created by Administrator on 2018/8/9.
 */
public interface UserService {
    public List<User> findAll();

    /**
     * 查询redis集群服务
     * @return
     */
    public  String findRedis();
}
