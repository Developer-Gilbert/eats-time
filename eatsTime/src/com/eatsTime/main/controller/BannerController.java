package com.eatsTime.main.controller;

public class BannerController implements MainController {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        // ��� ������ ��ȸ
        // ...

        // ��ȸ ����� JSP �������� ����
        request.setAttribute("bannerData", bannerData);

        // ����� ����� JSP ��θ� ��ȯ
        return "index.jsp";
    }
}
