package com.az.todo.dao.mapper;

import com.az.todo.dao.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    List<UserInfoEntity> queryUsersListByWxid(@Param("wxid") String wxid);

    int saveUserInfo(UserInfoEntity entity);
}
