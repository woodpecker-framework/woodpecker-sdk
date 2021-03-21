package me.gv7.woodpecker.plugin;

/*
 * @(#)IPayloadGenerator.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.List;
import java.util.Map;

/**
 * 荷载生成器接口，插件通过实现该接口，可生成各种类型payload。
 */
public interface IPayloadGenerator {
    /**
     * 框架会调用该方法获取荷载生成器的选项卡标题
     *
     * @return 荷载生成器选项卡标题
     */
    public String getPayloadTabCaption();

    /**
     * 框架会调用该方法获取荷载生成器自定义参数列表
     *
     * @return 自定义参数列表和使用说明绑定对象
     */
    public IArgsUsageBinder getPayloadCustomArgs();

    /**
     * 框架会调用该方法生成具体的荷载
     *
     * @param customArgs 自定义参数列表
     * @param resultOutput 结果输出对象，用于打印信息到界面
     */
    public void generatorPayload(Map<String, Object> customArgs, IResultOutput resultOutput) throws Throwable;
}
