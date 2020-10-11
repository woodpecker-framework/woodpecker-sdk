package me.gv7.woodpecker.plugin;

/*
 * @(#)IPluginHelper.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 此接口包含许多辅助方法，扩展可以使用这些方法
 * 可以协助处理插件编写遇到的各种常见问题。
 *
 *  扩展可以调用<code>IExtenderCallbacks.getPluginHelper<code/>这个接口的一个实例。
 */
public interface IPluginHelper {
    /**
     * 创建参数对象，方便IExploit模块和IPayloadGenerator模块自定义参数。
     *
     * @return 参数对象
     */
    public IArgs createArgs();

    /**
     * 创建扫描结果实例，可用于<code>IPoc.doCheck</code>中。
     *
     * @return 扫描结果实例
     */
    public IScanResult createScanResult();

    /**
     * 获取异常和错误对象的详细信息（包括调用堆栈信息）
     *
     * @param e 异常和错误对象
     * @return 异常和错误详细信息
     */
    public String getThrowableInfo(Throwable e);
}
