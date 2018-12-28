package cn.zhku.education.config;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/12/28 12:27
 * @version 1.00
 * Description: nineteen
 */

//@Configuration
@Slf4j
public class WebConfig {


    @Bean
    public Converter<String, Date> addNewConvert() {
        return source -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = sdf.parse(source);
            } catch (Exception e) {
                log.debug("日期转换错误{}",source);
                e.printStackTrace();
            }
            return date;
        };
    }
}
