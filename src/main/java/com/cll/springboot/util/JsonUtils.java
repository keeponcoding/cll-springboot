package com.cll.springboot.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ClassName JsonUtils
 * @Description json  对象 转换工具类
 * @Author cll
 * @Date 2020-01-06 22:10
 * @Version 1.0
 **/
public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    /*
     * 对象转字符串
     */
    public static <T> String object2String(T o){
      if (o == null) return null;

      try{
          return o instanceof String ? (String) o : mapper.writeValueAsString(o);
      }catch (Exception e){
          e.printStackTrace();
          return null;
      }
    }

    /*
     * 字符串转对象
     */
    public static <T> T string2Object(String str, Class<T> clazz){
        if (str == null || clazz == null) return null;

        try{
            return clazz.equals(String.class) ? (T) str : mapper.readValue(str,clazz);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
