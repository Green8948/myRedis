package cn.itcast.service;
import cn.itcast.domain.User;
import java.util.List;
/**
 * Created by Administrator on 2018/8/9.
 */
public interface UserService {
    public List<User> findAll();
}
