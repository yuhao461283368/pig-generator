package com.github.wxiaoqi.security.generator.common.msg.auth;

import com.github.wxiaoqi.security.generator.common.constant.RestCodeConstants;
import com.github.wxiaoqi.security.generator.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
