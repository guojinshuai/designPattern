package com.gjs.design.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好，<script>，欢迎访问，996");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new FaceFilter()).add(new URLFilter());

        filterChain.add(filterChain1);

        filterChain.doFilter(msg);

        System.out.println(msg.toString());


    }
}

class Msg {
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface Filter {

    boolean doFilter(Msg msg);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMsg();
        message = message.replace('<', '[');
        message = message.replace('>', ']');
        msg.setMsg(message);
        return true;
    }
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMsg();
        message = message.replaceAll("996", "955");
        msg.setMsg(message);
        return false;
    }
}

class FaceFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMsg();
        message = message.replaceAll("大家好", "大家好^v^");
        msg.setMsg(message);
        return true;
    }
}

class URLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMsg();
        message = message.replaceAll("欢迎访问", "欢迎访问^v^");
        msg.setMsg(message);
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
