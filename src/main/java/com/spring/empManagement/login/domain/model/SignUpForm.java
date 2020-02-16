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

    @NotBlank(groups = ValidGroup1.class, message = "{require_check}") // 必須入力
    @Email(groups = ValidGroup2.class, message = "{email_check}") // メールアドレス形式
    private String userId;

    @NotBlank(groups = ValidGroup1.class, message = "{require_check}")
    @Length(min = 4, max = 100, groups = ValidGroup2.class, message = "{length_check}") // 4~100桁
    @Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidGroup3.class, message = "{pattern_check}") // 半角英数字のみ
    private String password;

    @NotBlank(groups = ValidGroup1.class, message = "{require_check}")
    private String userName;

    @NotNull(groups = ValidGroup1.class, message = "{require_check}") // 必須入力
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @Min(value = 20, groups = ValidGroup2.class, message = "{min_check}")
    @Max(value = 120, groups = ValidGroup2.class, message = "{max_check}")
    private int age;

    @AssertFalse(groups = ValidGroup2.class, message = "{false_check}")  // falseのみ可能
    private boolean marriage;  // 結婚ステータス

}
