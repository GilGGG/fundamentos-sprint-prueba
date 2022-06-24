package com.fundamentos.sprintboot.prueba.dependencias.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Prueba de mi dependencia propia");
    }
}
