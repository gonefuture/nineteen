package cn.zhku.education.modules.apiLog.controller;

import cn.zhku.education.modules.apiLog.service.ApiLogService;
import cn.zhku.education.pojo.entity.Copyfailexception;
import cn.zhku.education.pojo.entity.Srcnotfoundexception;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/12/28 11:38
 * @version 1.00
 * Description: nineteen
 */

@RestController
public class ExceptionController {

    @Resource
    private ApiLogService apiLogService;

    @RequestMapping("get/srcNotFoundException/{time}")
    public Mono<String> srcNotFoundException(@PathVariable("time") String time ) {
        return apiLogService.srcNotFoundException(new Date(Long.valueOf(time)));
    }


    @RequestMapping("/get/copyFailException/{time}")
    public Mono<String> copyFailException(@PathVariable("time") String time) {
        return apiLogService.copyFailException(new Date(Long.valueOf(time)));
    }


    @RequestMapping("srcNotFoundException")
    public Flux<Srcnotfoundexception> srcNotFoundExceptions() {
        return apiLogService.srcnotfoundexceptionList();
    }

    @RequestMapping("copyFailException")
    public Flux<Copyfailexception> copyFailExceptions() {
        return apiLogService.copyFailExceptionList();
    }


    @RequestMapping("/count/copyFailException")
    public Mono<Integer> CountCopyFailException() {
        return apiLogService.countCopyFailException();
    }

    @RequestMapping("/count/srcNotFoundException")
    public Mono<Integer> CountSrcNotFoundException() {
        return apiLogService.countSrcnotfoundexception();
    }


}
