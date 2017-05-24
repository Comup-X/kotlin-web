package com.example.demo.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by Comup on 2017/5/24.
 */
@Configuration
class MvcConfig : WebMvcConfigurerAdapter() {
    override fun addViewControllers(registry: ViewControllerRegistry?) {
        super.addViewControllers(registry)
        registry?.addViewController("/error")?.setViewName("error.html")
        registry?.setOrder(Ordered.HIGHEST_PRECEDENCE)
    }

    override fun configurePathMatch(configurer: PathMatchConfigurer?) {
        super.configurePathMatch(configurer)
        configurer?.isUseSuffixPatternMatch = false
    }
}