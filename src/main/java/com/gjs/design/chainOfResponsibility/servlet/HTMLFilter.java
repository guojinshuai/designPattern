package com.gjs.design.chainOfResponsibility.servlet;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("html request");
        chain.doFilter(request, response);
        System.out.println("html response");
    }
}
