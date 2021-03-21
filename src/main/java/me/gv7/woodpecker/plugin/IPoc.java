package me.gv7.woodpecker.plugin;

/*
 * @(#)IPoc.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 插件可以实现这个接口来对漏洞进行精准检测和批量扫描。
 */
public interface IPoc {
    /**
     * 精准检测漏洞，并返回扫描结果。
     *
     * @param target 检测目标对象。
     * @param resultOutput 输出对象，用于打印各类信息。
     * @return 扫描结果，改扫描结果将会显示在框架Poc模块的结果Table中。
     */
    public IScanResult doVerify(ITarget target, IResultOutput resultOutput) throws Throwable;
}
