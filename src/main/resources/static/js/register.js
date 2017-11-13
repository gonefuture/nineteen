/*
 * @Author: 伟龙-Willon qq:1061258787 
 * @Date: 2017-11-10 17:17:39 
 * @Last Modified by: 伟龙-Willon
 * @Last Modified time: 2017-11-13 20:19:11
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
        const CONFIG = {
            PORNAME : '/nineteen',
            ALTER : '提交数据失败',
            INFOALERT : '请填写合法的信息',
            CHECKPHONE:'/student/',
            SUBMIT : '/student/begin',
            TO : './game_index.html'
        };
        var reg = {
            name : /[\u4e00-\u9fa5]/,
            phone : /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/,
            college_class : /^[\u4E00-\u9FA50-9_]+$/
        }
        $('#phone').blur(function () {
            if(reg.phone.test($(this).val())){
                $.get(CONFIG.PORNAME+CONFIG.CHECKPHONE+'/'+$(this).val(),function (res) {
                    if (res) {
                        /**
                         *第二次玩
                         *
                         */
                        confirm(res.phone + '欢迎您再次登陆，继续刷分\n');
                        var phone = decodeURI(res.phone) || '';
                        window.location.href = CONFIG.TO + '?username=' + phone;
                    }
                });
            }
        });
        $('#start').click(function(){
            var query = queryParse.call($('form'));
            if(reg.name.test(query.name)&&reg.phone.test(query.phone)&&reg.college_class.test(query.collegeClass)){
                    /**
                     *第一次玩插入
                     */
                    $.post(CONFIG.PORNAME+CONFIG.SUBMIT,query,function(res){
                        if(res){
                            console.log(res);
                            var username = decodeURI(query.name) || '';
                            window.location.href = CONFIG.TO+'?username='+username;
                        }else{
                            alert(CONFIG.ALTER);
                        }
                    });
            }else{
                alert(CONFIG.INFOALERT);
            }

        });

    }
}
browserRedirect();

