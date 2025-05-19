package com.yyt.heartverse.auth.service;

import com.yyt.framework.common.response.Response;
import com.yyt.heartverse.auth.model.vo.user.UpdatePasswordReqVO;
import com.yyt.heartverse.auth.model.vo.user.UserLoginReqVO;

public interface UserService {
    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);


    /**
     * 退出登录
     * @return
     */
    Response<?> logout();


    /**
     * 修改密码
     * @param updatePasswordReqVO
     * @return
     */
    Response<?> updatePassword(UpdatePasswordReqVO updatePasswordReqVO);
}
