package cn.itcast.mapper;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
@Mapper
public interface UserMapper {
    public List<User> findAll();
}
