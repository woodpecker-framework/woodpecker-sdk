package me.gv7.woodpecker.httpclient.util;

import java.lang.reflect.Method;

public class CommonUtil {
    public static String getHttpProxyHost(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getHttpProxyHost");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static int getHttpProxyPort(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getHttpProxyPort");
            Object obj = m.invoke(null);
            if (obj != null) {
                return Integer.valueOf(obj.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static String getHttpProxyUsername(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getHttpProxyUsername");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static String getHttpProxyPassword(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getHttpProxyPassword");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static String getSock5ProxyHost(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getSock5ProxyHost");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public static int getSock5ProxyPort(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getSock5ProxyPort");
            Object obj = m.invoke(null);
            if (obj != null) {
                return Integer.valueOf(obj.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


    public static int getSock5ProxyUsername(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getSock5ProxyUsername");
            Object obj = m.invoke(null);
            if (obj != null) {
                return Integer.valueOf(obj.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


    public static String getSock5ProxyPassword(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getSock5ProxyPassword");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public static int getHttpSleepTime() {
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getHttpSleepTime");
            Object obj = m.invoke(null);
            if (obj != null) {
                return Integer.valueOf(obj.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean isDEBUG(){
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("isDEBUG");
            Object obj = m.invoke(null);
            if (obj != null && obj.equals("true")) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static String getDefaultLng() {
        try {
            Class cls = Class.forName("me.gv7.woodpecker.config.Config");
            Method m = cls.getMethod("getDefaultLng");
            Object obj = m.invoke(null);
            if (obj != null) {
                return obj.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
