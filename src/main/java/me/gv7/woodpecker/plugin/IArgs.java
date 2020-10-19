package me.gv7.woodpecker.plugin;

/*
 * @(#)IArgs.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

import java.util.List;

/**
 * 该接口用于<code>IExploit</code>,<code>IPayloadGenerator</code>和<code>IHelper</code>模块的传输参数
 */
public interface IArgs {
    /**
     * 参数类型为String类型
     */
    public final static int ARG_TYPE_STRING = 0;
    /**
     * 参数类型为整数型
     */
    public final int ARG_TYPE_INT = 1;
    /**
     * 参数类型为double型
     */
    public final int ARG_TYPE_DOUBLE = 2;
    /**
     * 参数类型为端口
     */
    final int ARG_TYPE_PORT = 3;
    /**
     * 参数类型为IP
     */
    final int ARG_TYPE_IP = 4;
    /**
     * 参数类型为HTTP URL
     */
    final int ARG_TYPE_HTTP_URL = 5;
    /**
     * 参数类型为address型(protocol://host:port/path)
     */
    final int ARG_TYPE_ADDRESS = 6;
    /**
     * 参数类型为枚举型
     */
    final int ARG_TYPE_ENUM = 7;

    /**
     * 设置参数名
     *
     * @param name 参数名
     */
    void setName(String name);

    /**
     * 设置参数类型
     *
     * @param type 参数类型
     */
    void setType(int type);

    /**
     * 设置参数默认值
     *
     * @param defaultValue 默认值
     */
    void setDefaultValue(String defaultValue);

    /**
     * 设置枚举值,当值的类型为枚举型时必须设置！
     * @param enumValue 枚举值列表
     */
    void setEnumValue(List<String> enumValue);

    /**
     * 设置参数是否必须设置
     *
     * @param is 是否必须设置
     */
    void setRequired(boolean is);

    /**
     * 设置参数描述，描述参数的含义
     *
     * @param desc 参数描述
     */
    void setDescription(String desc);
}
