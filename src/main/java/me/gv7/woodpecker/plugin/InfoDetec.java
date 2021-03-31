package me.gv7.woodpecker.plugin;

/*
 * @(#)InfoDetec.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 信息探测接口，插件通过实现该接口，可实现对目标全方位信息探测。
 */
public interface InfoDetec {
    /**
     * 框架会调用该方法获取该信息收集模块的选项卡标题，推荐通过信息探测具体的功能设置返回值，比如version(探测目标版本),vul path(探测漏洞路径)等等
     *
     * @return 该信息探测模块选项卡标题
     */
    public String getInfoDetecTabCaption();
    /**
     * 框架会调用该方法获取该信息探测模块自定义参数列表
     *
     * @return 该信息探测模块自定义参数列表和使用说明绑定对象
     */
    public IArgsUsageBinder getInfoDetecCustomArgs();

    /**
     * Woodpecker框架会调用该方法，执行具体的信息探测操作，并将执行结果输出到界面。
     *
     * @param target 目标对象。
     * @param customArgs 自定义参数
     * @param resultOutput 输出对象，用于打印各类信息。
     * @return 探测到的信息集合
     */
    public LinkedHashMap<String,String> doDetect(ITarget target, Map<String, Object> customArgs, IResultOutput resultOutput) throws Throwable;
}
