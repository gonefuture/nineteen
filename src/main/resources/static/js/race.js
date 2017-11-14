﻿/*
 * @Author: 伟龙-Willon qq:1061258787 
 * @Date: 2017-11-10 17:17:39 
 * @Last Modified by: 伟龙-Willon
 * @Last Modified time: 2017-11-14 14:40:14
 */

 /**
  * 具体操作
  * 1、一个开始按钮的监听
  * 2、页面的跳转
  */
/**
 * 浏览器嗅探
 * 仅对移动端开放
 */
function browserRedirect() {
    var sUserAgent = navigator.userAgent.toLowerCase();
    var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
    var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
    var bIsMidp = sUserAgent.match(/midp/i) == "midp";
    var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
    var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
    var bIsAndroid = sUserAgent.match(/android/i) == "android";
    var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
    var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
    if (!(bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) ){
        window.location.href = './404.html';
    }else{

        /**
         * 1获取视窗大小
         */
        var win = {
            width:window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth,
            height:window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight
        };

        /**
         * 2排行榜动画定时器
         */
       var timer = '';
        
        /**
         * 3从缓存中获取用户数据
         * id值
         */
        $.get(''+'',function(res){
            if(res){
                //渲染个人信息
                viewCommand({
                    command:'display',
                    param:[$('tbody')[0],res,'myGradeView']
                })
            }else{
                alert('抱歉！获取个人成绩失败');
            }
        });

        /**
         * 4获取排行榜数据
         */
        $.get('',function(res){
            if(res){

                //渲染排行榜
                viewCommand({
                    command : 'display',
                    param:[$('table')[1],res,'rankView']
                });

                 /**
                 * 开启排行榜动画
                 */
                    timer = setInterval(function(){
                    $(".rankContent table").animate({'top':(-win.width/15)},function(){
                            $(".rankContent table").append($(".rankContent table tr:first"));
                            $(".rankContent table").css('top','0');
                    })
                },2000);

            }else{
                
                alert('抱歉！获取排名信息失败');
            }
        });
        
    }
}
browserRedirect();