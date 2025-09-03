package com.ruoyi.common.core.domain;

import com.ruoyi.common.constant.HttpStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "请求结果")
public class ResponseData<T> {

    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "响应编码")
    private Integer code;

    @ApiModelProperty(value = "返回信息")
    private String msg;

    @ApiModelProperty(value = "返回对象")
    private T data;

    public ResponseData(){

    }

    public ResponseData(Boolean success, Integer code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseData<T> success(String msg, T data){
        return new ResponseData<T>(true, HttpStatus.SUCCESS,msg,data);
    }

    public static <T> ResponseData<T> success(String msg){
        return ResponseData.success(msg,null);
    }

    public static <T> ResponseData<T> success(T data){
        return ResponseData.success(null,data);
    }

    public static <T> ResponseData<T> success(){
        return ResponseData.success("请求成功",null);
    }

    public static <T> ResponseData<T> error(Integer code, String msg, T data){
        return new ResponseData<T>(false,code,msg,data);
    }

    public static <T> ResponseData<T> error(Integer code, String msg){
        return ResponseData.error(code,msg,null);
    }

    public static <T> ResponseData<T> error(String msg){
        return ResponseData.error(HttpStatus.ERROR,msg,null);
    }

    public static <T> ResponseData<T> error(){
        return ResponseData.error(HttpStatus.ERROR,"操作失败",null);
    }
}
