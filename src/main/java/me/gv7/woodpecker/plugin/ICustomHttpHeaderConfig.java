package me.gv7.woodpecker.plugin;
/*
 * @(#)IConfig.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.LinkedHashMap;

/**
 * 自定义http头配置
 */
public interface ICustomHttpHeaderConfig {
    /**
     * 获取自定义头
     *
     * @return 获取自定义头
     */
    public LinkedHashMap<String, String> getCustomHttpHeaders();

    /**
     * 是否覆盖原来已经存在http头，默认不覆盖
     *
     * @return 是否覆盖
     */
    public boolean isOverwriteHttpHeader();
}
