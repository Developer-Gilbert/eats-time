package com.eatsTime.main.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eatsTime.product.controller.ProductListOkController;

public class MainController implements MainControllerInterface {
    // URI ��û ��ο� ��Ʈ�ѷ� ����
    private Map<String, MainControllerInterface> controllers = new HashMap<>();

    public MainController() {
        // ���� ������
        controllers.put("/", this);

        // ��� ������
        controllers.put("/banner", new BannerController());

        // ��ǰ ��� ������
        controllers.put("/productList", (MainControllerInterface) new ProductListOkController());
    }

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String path = uri.substring(contextPath.length());

        // ���ε� ��Ʈ�ѷ��� ã�Ƽ� ó��
        MainControllerInterface controller = controllers.get(path);
        if (controller != null) {
            controller.handleRequest(request, response);
        } else {
            // ó���� �� ���� ��û�� ��� ���� ó��
            throw new RuntimeException("Invalid request path: " + path);
        }
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