package me.gv7.woodpecker.plugin;

/*
 * @(#)IHelperPluginCallbacks.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.List;
/**
 * 这个接口被woodpecker框架用来传递一组回调给辅助插件
 * 辅助插件可以通过该回调对框架进行某种操作。
 *
 * 当一个辅助插件被加载时，woodpecker框架调用IHelperPlugin#HelperPluginMain方法，并传递实例
 * <code>IHelperPluginCallbacks</code>，供插件设置插件信息和注册相关组件。
 */
public interface IHelperPluginCallbacks {
    /**
     * 设置插件名称
     *
     * @param name 插件名称
     */
    void setHelperPluginName(String name);

    /**
     * 设置插件版本
     *
     * @param version 插件版本
     */
    void setHelperPluginVersion(String version);

    /**
     * 设置插件路径
     *
     * @param path 插件路径
     */
    public void setHelperPluginPath(String path);

    /**
     * 设置插件作者
     *
     * @param autor 插件作者
     */
    public void setHelperPluginAutor(String autor);
    /**
     * 设置插件描述，可描述插件的功能
     *
     * @param description 插件描述
     */
    public void setHelperPluginDescription(String description);

    /**
     * 获取插件辅助器,即<code>IPluginHelper</code>实例
     *
     * @return <code>IPluginHelper</code>实例
     */
    public IPluginHelper getPluginHelper();

    /**
     * 注册漏洞辅助模块
     *
     * @param helperList 漏洞辅助实例列表
     */
    public void registerHelper(List<IHelper> helperList);
}
