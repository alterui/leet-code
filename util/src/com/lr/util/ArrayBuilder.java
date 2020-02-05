package com.lr.util;

/**
 * @author liurui
 * @date 2020/2/3 22:54
 */
@FunctionalInterface
public interface    ArrayBuilder {
    //定义一个创建int类型数组的方法,参数传递数组的长度,返回创建好的int类型数组
    int[] builderArray(int length);
}
