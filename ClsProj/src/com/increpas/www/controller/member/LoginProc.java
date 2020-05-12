package com.increpas.www.controller.member;

import javax.servlet.http.*;

import com.increpas.www.controller.ClsController;
import com.increpas.www.dao.MembDao;

public class LoginProc implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/ClsProj/main.cls";
		req.setAttribute("isRedirect", true);
		
		// 파라미터 가져오고
		String sid = req.getParameter("id");
		String spw = req.getParameter("pw");
		MembDao dao = new MembDao();
		int cnt = dao.getLoginCnt(sid, spw);
		
		if(cnt == 1) {
			HttpSession session = req.getSession();
			session.setAttribute("SID", sid);
		} else {
			view = "/ClsProj/member/login.cls";			
		}
		return view;
	}

}
