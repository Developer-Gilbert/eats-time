package com.eatsTime.notificationboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eatsTime.Result;
<<<<<<< HEAD
import com.eatsTime.member.controller.JoinOkController;
=======
import com.eatsTime.notificationboard.controller.ListOkController;
import com.eatsTime.notificationboard.controller.ViewOkController;
import com.eatsTime.notificationboard.controller.WriteOkController;
>>>>>>> master

public class NotificationBoardFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
<<<<<<< HEAD
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;

//		���� if�� else if�� ���ôϱ� �� ����Ʈ ��Ʈ�ѷ��� ���缭 �����ؼ� �۾�
		if(target.equals("joinOk")) {
			result = new JoinOkController().execute(req, resp);
			
		} else if(target.equals("joinOk")) {
			result = new JoinOkController().execute(req, resp);
=======
		System.out.println("들어옴");
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		System.out.println(target);
		
		if(target.equals("adminindex")) {
			result = new Result();
			result.setPath("templates/admin/adminIndex.jsp");
		} else if(target.equals("adminNoticeWrite")) {
			result = new Result();
			result.setPath("templates/admin/adminNoticeWrite.jsp");
		}else if(target.equals("writeOk")) {
			System.out.println("writeOk 들어옴");
			result = new WriteOkController().execute(req, resp);			
		}else if(target.equals("listOk")) {
			result = new ListOkController().execute(req, resp);	
		}else if(target.equals("viewOk")) {
			System.out.println("viewOk 들어옴");
			result = new ViewOkController().execute(req, resp);
>>>>>>> master
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
