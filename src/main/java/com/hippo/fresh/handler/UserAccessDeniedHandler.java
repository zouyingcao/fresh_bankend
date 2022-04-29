package com.hippo.fresh.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import com.hippo.fresh.utils.ResponseUtils;

/**
 * 无权限处理类
 */
@Component
public class UserAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		ResponseUtils.responseJson(response, ResponseUtils.response(403, "拒绝访问", accessDeniedException.getMessage()));
	}

}
