package com.atguigu.shoppingmall.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CacheUtils {

    public static final String SP_NAME = "News";
    private static FileOutputStream fos;
    private static ByteArrayOutputStream baos;
    private static FileInputStream fis;


    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, false);
    }

    public static void putBoolean(Context context, String key, boolean b) {

        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, b).commit();

    }

    public static void putString(Context context, String key, String value) {
//        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            //MD5加密
////            String fileName = MD5.md5(key);
//
//            File file = new File(Environment.getExternalStorageDirectory() + "/ciyuancang/files", key);
//            File parentFile = file.getParentFile();
//            try {
//
//                //没有SD卡创建目录
//                if (!parentFile.exists()) {
//                    parentFile.mkdirs();
//                }
//                if (!file.exists()) {
//                    file.createNewFile();
//                }
//
//                //保存文本
//                fos = new FileOutputStream(file);
//                fos.write(value.getBytes());
//            } catch (IOException e) {
//                e.printStackTrace();
//                Log.e("TAG", "文本缓存失败+22222222222" + e.getMessage());
//            } finally {
//                if (fos != null) {
//                    try {
//                        fos.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        } else {
//            SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
//            sp.edit().putString(key, value).commit();
//        }
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(Context mContext, String key) {
       String result = "";
//         if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            //MD5加密
////            String fileName = MD5.md5(key);
//
//            File file = new File(Environment.getExternalStorageDirectory() + "/ciyuancang/files", key);
//            try {
//                if (file.exists()) {
//                    //取出文本
//                    fis = new FileInputStream(file);
//                    baos = new ByteArrayOutputStream();
//                    int len;
//                    byte[] b = new byte[1024];
//                    while ((len = fis.read(b)) != -1) {
//                        baos.write(b, 0, len);
//                    }
//                    result = baos.toString();
//                    return result;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//                Log.e("TAG", "文本取出失败" + e.getMessage());
//            } finally {
//                try {
//                    if (baos != null) {
//                        baos.close();
//                    }
//                    if (fis != null) {
//                        fis.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } else {
//            SharedPreferences sp = mContext.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
//            result = sp.getString(key, "");
//            return result;
//        }
        SharedPreferences sp = mContext.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        result = sp.getString(key, "");
        return result;
    }
}
