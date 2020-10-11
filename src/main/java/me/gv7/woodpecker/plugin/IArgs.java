package me.gv7.woodpecker.plugin;

/*
 * @(#)IArgs.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 该接口用于<code>IExploit</code>和<code>IPayloadGenerator</code>模块的传输参数
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
     * 参数类型为端口
     */
    final int ARG_TYPE_PORT = 2;
    /**
     * 参数类型为IP
     */
    final int ARG_TYPE_IP = 3;
    /**
     * 参数类型为HTTP URL
     */
    final int ARG_TYPE_HTTP_URL = 4;

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
     * 设置参数是否必须设置
     *
     * @param is 是否必须设置
     */
    void setMastSetup(boolean is);

    /**
     * 设置参数描述，描述参数的含义
     *
     * @param desc 参数描述
     */
    void setDescription(String desc);
}
