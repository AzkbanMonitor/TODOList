package com.az.todo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoEntity {
    private int id;

    private String userName;

    private String tel;

    private String wxid;

    private String ext;
}
