package com.sell.enums;

import lombok.Getter;

/**
 * @Auther: CRJ
 * @Date: 2019-02-04 16:38
 * @Description:
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
