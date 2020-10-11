package me.gv7.woodpecker.plugin;

/*
 * @(#)IPluginManager.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 插件管理接口，这是插件库必须实现的接口，它是插件的入口。该接口主要用于注册插件管理对象。
 */
public interface IPluginManager {
    /**
     * 注册插件管理
     *
     * @param pluginManagerCallbacks 插件管理回调对象
     */
    public  void registerPluginManagerCallbacks(IPluginManagerCallbacks pluginManagerCallbacks);
}
