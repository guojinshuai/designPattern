package com.gjs.design.chainOfResponsibility.servlet;

public class Main {

    public static void main(String[] args) {

        Request request = new Request();
        Response response = new Response();

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response);
    }
}
