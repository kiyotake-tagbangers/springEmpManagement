package com.spring.empManagement.login.domain.model;

import javax.validation.GroupSequence;

/**
 * 入力チェックグループの実行順序を決めるインターフェース
 * 入力チェックに引っかかった場合に、処理を途中で止める
 */
@GroupSequence({ValidGroup1.class, ValidGroup2.class, ValidGroup3.class})
public interface GroupOrder {

}
