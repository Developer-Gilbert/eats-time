package com.eatsTime.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BannerController implements MainControllerInterface {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        // ��� ������ ��ȸ
        // ...

        Object bannerData = null;
        // ��ȸ ����� JSP �������� ����
        request.setAttribute("bannerData", bannerData);

        // ����� ����� JSP ��θ� ��ȯ
        return "index.jsp";
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        // ...
    }

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}