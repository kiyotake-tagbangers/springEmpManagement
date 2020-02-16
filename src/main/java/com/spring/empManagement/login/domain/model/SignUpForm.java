package com.spring.empManagement.login.domain.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * ユーザ登録用のフォームクラス
 */
@Data
public class SignUpForm {

    @NotBlank // 必須入力
    @Email // メールアドレス形式
    private String userId;

    @NotBlank
    @Length(min = 4, max = 100) // 4~100桁
    @Pattern(regexp = "^[a-zA-Z0-9]+$") // 半角英数字のみ
    private String password;

    @NotBlank
    private String userName;

    @NotNull // 必須入力
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @Min(20)
    @Max(120)
    private int age;

    @AssertFalse  // falseのみ可能
    private boolean marriage;  // 結婚ステータス

}
