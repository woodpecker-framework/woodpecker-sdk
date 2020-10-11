package me.gv7.woodpecker.plugin;

/*
 * @(#)ITarget.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 这个类封装目标的各项信息，方便接口取用。
 */
public interface ITarget {
    /**
     * 这个方法返回目标的地址
     *
     * @return 目标的地址
     */
    public String getAddress();

    /**
     * 这个方法返回目标的根地址
     *
     * @return 目标的根地址
     */
    public String getRootAddress();

    /**
     * 这个方法返回目标的地址协议
     *
     * @return 目标地址协议
     */
    public String getProtocol();

    /**
     * 这个方法返回目标的IP
     *
     * @return 目标IP
     */
    public String getHost();

    /**
     * 这个方法返回目标的端口
     *
     * @return 目标的端口
     */
    public int getPort();

    /**
     * 这个方法返回目标的路径
     * @return 目标的路径
     */
    public String getPath();
}
