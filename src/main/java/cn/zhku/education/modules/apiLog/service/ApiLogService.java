package cn.zhku.education.modules.apiLog.service;

import cn.zhku.education.pojo.dao.CopyfailexceptionMapper;
import cn.zhku.education.pojo.dao.SrcnotfoundexceptionMapper;
import cn.zhku.education.pojo.entity.Copyfailexception;

import cn.zhku.education.pojo.entity.Srcnotfoundexception;
import cn.zhku.education.utils.beans.Msg;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.text.MessageFormat;
import java.util.Date;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/12/28 11:42
 * @version 1.00
 * Description: nineteen
 */

@Service
public class ApiLogService {
    @Resource
    private CopyfailexceptionMapper copyfailexceptionMapper;

    @Resource
    private SrcnotfoundexceptionMapper srcnotfoundexceptionMapper;




    public Mono<String> copyFailException(Date time) {
        Copyfailexception copyfailexception = new Copyfailexception();
        copyfailexception.setLogTime(time);
        copyfailexceptionMapper.insert(copyfailexception);
        return Mono.just(MessageFormat.format("插入{0}成功",copyfailexception));
    }

    public Mono<String> srcNotFoundException(Date time) {
        Srcnotfoundexception srcnotfoundexception = new Srcnotfoundexception();
        srcnotfoundexception.setLogTime(time);
        srcnotfoundexceptionMapper.insert(srcnotfoundexception);
        return Mono.just(MessageFormat.format("插入{0}成功",srcnotfoundexception));
    }



    public Flux<Copyfailexception> copyFailExceptionList() {
        return Flux.fromIterable(copyfailexceptionMapper.selectByExample(null));
    }

    public Flux<Srcnotfoundexception> srcnotfoundexceptionList() {
        return Flux.fromIterable(srcnotfoundexceptionMapper.selectByExample(null));
    }



    public Mono<Integer> countCopyFailException() {
        return Mono.just(copyfailexceptionMapper.countByExample(null));
    }


    public Mono<Integer> countSrcnotfoundexception() {
        return Mono.just(srcnotfoundexceptionMapper.countByExample(null));
    }
}
