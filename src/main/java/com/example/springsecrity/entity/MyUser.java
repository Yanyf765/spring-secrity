package com.example.springsecrity.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: yangzheng
 * @time: 2019/10/24 13:05
 */
@Data
public class MyUser implements Serializable {
    private static final long serialVersionUID = 3497935890426858541L;

    private String userName;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;

}
