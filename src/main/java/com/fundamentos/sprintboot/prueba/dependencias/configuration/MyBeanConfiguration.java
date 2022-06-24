package com.fundamentos.sprintboot.prueba.dependencias.configuration;

import com.fundamentos.sprintboot.prueba.dependencias.bean.MyBean;
import com.fundamentos.sprintboot.prueba.dependencias.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;

public class MyBeanConfiguration {

    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
}
