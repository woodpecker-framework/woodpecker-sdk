package me.gv7.woodpecker.plugin;
/*
 * @(#)IProxyConfig.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 代理配置
 */
public interface IProxyConfig {
    /**
     * 是否启用代理
     *
     * @return
     */
    public boolean isEnable();

    /**
     * 获取代理协议
     *
     * @return 代理协议
     */
    public String getProtocol();

    /**
     * 获取代理Host
     *
     * @return 代理Host
     */
    public String getHost();

    /**
     * 获取代理端口
     *
     * @return 代理端口
     */
    public int getPort();

    /**
     * 获取账号账号
     * @return 代理账号
     */
    public String getUsername();

    /**
     * 获取代理密码
     *
     * @return 代理密码
     */
    public String getPassword();
}
