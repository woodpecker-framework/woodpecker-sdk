package me.gv7.woodpecker.plugin;

/*
 * @(#)IHttpLog.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * HttpLog接口，用于在通过HTTP记录检测漏洞是否存在以及漏洞回显等场景
 */
public interface IHttpLog {
    /**
     * 是否设置并启用HttpLog检测
     *
     * @return HttpLog设置与启用状态
     */
    public boolean isSetAndEnable();

    /**
     * 获取HttpLog根URL
     *
     * @return HttpLog根URL
     */
    public String[] getRootURL();

    /**
     * 获取随机验证域名
     *
     * @return 获取随机验证域名
     */
    public String[] getRandomVerifyURL();

    /**
     * 判断验证URL是否有记录
     *
     * @param verifyURL 要验证的URL
     * @return 是否存在记录
     */
    public boolean isExistsHttpLog(String verifyURL);

    /**
     * 查询Http记录
     *
     * @param verifyURL 要验证的URL
     * @param isBlur 是否模糊查询
     * @return Http记录
     */
    public String queryHttpLog(String verifyURL,boolean isBlur);
}
