package com.github.wxiaoqi.security.generator.common.msg.auth;

import com.github.wxiaoqi.security.generator.common.constant.RestCodeConstants;
import com.github.wxiaoqi.security.generator.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/25.
 */
public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
