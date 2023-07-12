package ks47team01.common.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Set;
import java.util.StringJoiner;
@Component
@Slf4j
public class CommonInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Set<String> paramkeySet = request.getParameterMap().keySet();

        StringJoiner param = new StringJoiner(", ");

        for(String key : paramkeySet) {
            //memberId=id001 -> memberId: id001
            //memberId=id001&memberPw=pw001 -> memberId: id001, memberPw: pw001
            param.add(key + " : " + request.getParameter(key));
        }

        log.info("ACCESS INFO======================================================");
        log.info("PORT		    ::::::		{}", request.getLocalPort());
        log.info("ServerName		::::::		{}", request.getServerName());
        log.info("HTTPMethod		::::::		{}", request.getMethod());
        log.info("URI			    ::::::		{}", request.getRequestURI());
        log.info("CLIENT IP		::::::		{}", request.getRemoteAddr());
        log.info("Parameter		::::::		{}", param);
        log.info("ACCESS INFO======================================================");

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
