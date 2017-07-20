package com.comup.demospringboothotswap

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
//此配置为配置此类下所有网页响应方法的网页访问前缀，此处需要访问test借口需要访问ip:port/api/test
@RequestMapping("/api")
class TController {
    @GetMapping("/test")
    fun test(): String {
        return "hello world!+++"
    }
}

/**
 * 此处有一坑如果网页在静态资源根目录且跟配置的路径名一致将发生view循环错误
 * 如: @RequestMapping("/index")
 *    fun xxx():String{
 *        return "index"
 *    }
 */
@Controller
//此配置为配置此类下所有网页响应方法的网页访问前缀，此处需要访问test借口需要访问ip:port或者ip:port/index
@RequestMapping("/")
class TTController {
    @RequestMapping(value = *arrayOf("/", "/index"))
    fun index(): String {
        //网页文件路径
        return "/index/index"
    }
}