package com.gjs.design.chainOfResponsibility.servlet;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);
}
