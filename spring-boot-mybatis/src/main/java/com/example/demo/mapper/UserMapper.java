package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

/**
 * @author QuiFar
 * @version V1.0
 * @Description: 用户表映射接口
 * @date 2017年11月11日 下午12:35:58
 */
@Mapper
public interface UserMapper {
    /**
     * 根据主键删除单个对象
     *
     * @param id 主键
     * @return
     */
    int remove(Integer id);

    /**
     * 根据主键ID更新单个对象
     *
     * @param user 需要更新的对象
     * @return
     */
    int update(User user);

    /**
     * 新增
     *
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 根据主键获取单个对象
     *
     * @param id
     * @return
     */
    User get(Integer id);

    /**
     * 根据用户名获取单个对象
     *
     * @param userName 用户名
     * @return
     */
    User getByUserName(String userName);

    /**
     * 根据手机号码获取单个对象
     *
     * @param mobile 手机号码
     * @return
     */
    User getByMobile(String mobile);

    /**
     * 根据条件获取列表
     *
     * @param params
     * @return
     */
    List<User> list(Map<String, Object> params);

    /**
     * 根据条件获取列表
     *
     * @return
     */
    List<UserDTO> listPage();

}
