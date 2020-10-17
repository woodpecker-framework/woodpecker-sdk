package me.gv7.woodpecker.plugin;

/*
 * @(#)IPluginManagerCallbacks.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 插件管理回调接口，一个插件库可以包含多个插件，该接口可以将这些插件注册到框架中启用起来。
 */
public interface IPluginManagerCallbacks {
    /**
     * 注册插件
     *
     * @param plugin 插件对象
     */
    public void registerVulPlugin(IVulPlugin plugin);
}
