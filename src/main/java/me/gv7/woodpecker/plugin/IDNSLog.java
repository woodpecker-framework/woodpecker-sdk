package me.gv7.woodpecker.plugin;

/*
 * @(#)IDNSLog.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * DNSlog接口，用于在通过DNS记录检测漏洞是否存在以及漏洞回显等场景
 */
public interface IDNSLog {
    /**
     * 是否设置并启用DNSLog检测
     *
     * @return DNSLog设置与启用状态
     */
    public boolean isSetAndEnable();

    /**
     * 获取DNSlog根域名
     *
     * @return DNSLog根域名
     */
    public String getRootDomain();

    /**
     * 获取随机验证域名
     *
     * @return 获取随机验证域名
     */
    public String getRandomVerifyDomain();

    /**
     * 判断验证域名是否有记录
     *
     * @param verifyDomain 要验证的域名
     * @return 是否存在记录
     */
    public boolean isExistsDNSLog(String verifyDomain);

    /**
     * 查询DNS记录
     *
     * @param verifyDomain 要验证的域名
     * @param isBlur 是否模糊查询
     * @return DNS记录
     */
    public String queryDNSLog(String verifyDomain,boolean isBlur);
}
