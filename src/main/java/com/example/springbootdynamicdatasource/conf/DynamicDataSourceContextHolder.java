package com.example.springbootdynamicdatasource.conf;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

    /**
     * 重写initialValue方法，使默认数据库的key为主节点master
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "master";
        }
    };

    /**
     * 数据源的 key 集合，用于切换时判断数据源是否存在
     */
    public static List<Object> dataSourceKeys = new ArrayList<>();

    public static void setDataSourceKey(String key) {
        contextHolder.set(key);
    }

    public static String getDataSourceKey() {
        return contextHolder.get();
    }

    public static void clearDataSourceKey() {
        contextHolder.remove();
    }

    public static boolean containDataSourceKey(String key) {
        return dataSourceKeys.contains(key);
    }
}
