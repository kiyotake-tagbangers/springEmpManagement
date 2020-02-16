package com.spring.empManagement.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * ユーザ登録用のフォームクラス
 */
@Data
public class SignUpForm {

    private String userId;
    private String password;
    private String  userName;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    private int age;
    private boolean marriage;

}
