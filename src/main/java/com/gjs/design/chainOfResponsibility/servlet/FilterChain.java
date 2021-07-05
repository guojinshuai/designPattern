package com.gjs.design.chainOfResponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        filters.get(index++).doFilter(request, response, this);
    }

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }
}
