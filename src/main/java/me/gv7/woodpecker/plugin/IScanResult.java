package me.gv7.woodpecker.plugin;

/*
 * @(#)IScanResult.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 这个接口用于封装IPoc模块的扫描结果。
 */
public interface IScanResult {
    /**
     * 设置扫描目标地址
     *
     * @param target 目标地址
     */
    public void setTarget(String target);

    /**
     * 设置是否存在漏洞
     *
     * @param exists 是否存在漏洞
     */
    public void setExists(boolean exists);

    /**
     * 设置扫描结果的补充信息，比如漏洞不存在的原因，漏洞存在的证明等信息
     *
     * @param msg 补充信息
     */
    public void setMsg(String msg);

    /**
     * 设置完成扫描的时间
     *
     * @param time 完成扫描的时间
     */
    public void setTime(String time);

    /**
     * 返回是否存在漏洞
     *
     * @return 是否存在漏洞
     */
    public boolean isExists();
}
