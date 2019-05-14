package com.ssm.simple.demo;

import com.ssm.simple.utils.StringSimpleUtils;

/**
 * 字符串处理
 *
 * @Author peanutnowing
 * @Date 2019/4/19
 */
public class StringDemo {
    /**
     * 截取字符串
     */
    @org.junit.Test
    public void subStringTest(){
       /*    //去掉括号两种方法 1.截取截取字符串
        String numbers = "[1,2,3,4,5]";
        String[] array = StringSimpleUtils.removeBrackets(numbers);
        for (String str : array) {
            System.out.                                                                   println(str);
        }*/

        //熟悉String常用API，比如字符串截取等
        String str ="莫斯科没有眼泪：@abcdefg美少女战士001:说得好(✪▽✪)";
        System.out.println(str.substring(str.indexOf(":")+1,str.length()));
     /*   String userAName ="小仙女0";
        String userBName ="莫斯科";
        String userNameA = userAName.length()>10?userAName.substring(0,10):userAName;
        String nameGroup = userNameA+"、"+userBName;
        String userNames=nameGroup.length()>10?nameGroup.substring(0,10)+"等":nameGroup+"等";
        System.out.println(userNames);*/
    }

    /**
     * 字符串格式化
     */
    @org.junit.Test
    public void formatStringTest(){
        String str ="<p><img src=\"%s\"></p><p><video class=\"edui-upload-video vjs-default-skin video-js\" controls=\"\" preload=\"none\" width=\"420\" height=\"280\" src=\"%s\" data-setup=\"{}\">\n" +
                "<source src=\"%s\" type=\"video/mp4\"/></video></p>";
        System.out.println(String.format(str,1,11,111));
    }
}
