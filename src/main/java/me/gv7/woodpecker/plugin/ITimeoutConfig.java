package me.gv7.woodpecker.plugin;
/*
 * @(#)ITimeoutConfig.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 超时时间接口
 */
public interface ITimeoutConfig {
    /**
     * 获取默认超时时间
     *
     * @return 默认超时时间
     */
    public int getDefaultTimeout();

    /**
     * 是否启用设置强制超时时间
     *
     * @return 强制超时时间
     */
    public boolean isEnableMandatoryTimeout();

    /**
     * 获取强制超时时间
     *
     * @return 强制超时时间
     */
    public int getMandatoryTimeout();
}
