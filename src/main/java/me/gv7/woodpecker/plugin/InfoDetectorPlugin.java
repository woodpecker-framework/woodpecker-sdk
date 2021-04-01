package me.gv7.woodpecker.plugin;

/*
 * @(#)InfoDetecPlugin.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
/**
 * 每个信息探测插件都需要实现该接口
 */
public interface InfoDetectorPlugin {
    /**
     * 插件Main方法，也是插件的入口。用于设置插件的各项信息，注册插件相关组件。
     *
     * @param infoDetectorPluginCallbacks 回调对象
     */
    public void InfoDetectorPluginMain(InfoDetectorPluginCallbacks infoDetectorPluginCallbacks);
}
