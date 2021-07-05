package com.gjs.design.chainOfResponsibility.servlet;

public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("sensitive request");
        chain.doFilter(request, response);
        System.out.println("sensitive response");
    }
}
