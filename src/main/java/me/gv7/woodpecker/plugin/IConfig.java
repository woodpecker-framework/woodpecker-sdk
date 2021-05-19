package me.gv7.woodpecker.plugin;
/*
 * @(#)IConfig.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 全局配置接口，用于管理所有配置
 */
public interface IConfig {
    /**
     * 获取代理配置
     *
     * @return 代理配置
     */
    public IProxyConfig getProxyConfig();

    /**
     * 获取超时配置
     *
     * @return
     */
    public ITimeoutConfig getTimeoutConfig();

    /**
     * 获取UserAgent
     *
     * @return UserAgent
     */
    public String getUserAgent();

    /**
     * 获取自定义http头配置
     *
     * @return 自定义http配置
     */
    public ICustomHttpHeaderConfig getCustomHttpHeaderConfig();
}
