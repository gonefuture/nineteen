/*
 * @Author: 伟龙-Willon qq:1061258787 
 * @Date: 2017-11-12 21:59:23 
 * @Last Modified by: 伟龙-Willon
 * @Last Modified time: 2017-11-13 17:02:18
 */

 /**
  * 控制气球的活动
  * 1、初始化气球
  * 2、事件委托监听点击事件
  */
  
  (function(){

    var num = 4,
        balls = [],
        gamePanel = $('#gamePanel')[0],
        time = $('#time')[0],
        grade = $('#grade')[0],
        annimation = '';

    for(var i = num ;i-- ;){
      balls.push(new Balloon());
    }

    (function run(){
        gamePanel.innerHTML = '';
        balls.forEach(function(balloon){
          balloon.init();
        });
        annimation = window.requestAnimationFrame(run);
    })();

    /**
     * 事件委托，触发爆炸事件
     */
    $('body').on('click','i',function(){
      this.boom();
      grader.grade += 10;
      grade.innerHTML = grader.grade;
    });
    
    /**
     * 开启定时器
     */
    new Countdown(time).init(function(control){
      clearInterval(annimation);
      control.gameover({
        clear:gamePanel,
        submiter : grader,
        alert : '时间已到\n同志您本关获得的分数是：'
      });
    });
    
    /**
     * 打开积分牌,传入积分位置
     */
    var grader = new Grade(grade);
  })();