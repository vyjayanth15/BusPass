package org.cap.service;

import org.cap.dao.ILoginDao;
import org.cap.dao.LoginDaoImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.cap.bean.LoginBean;
import org.cap.bean.PassRequestForm;
import org.cap.bean.Routetable;
import org.cap.bean.TransactionBean;

public class LoginServiceImpl implements ILoginService {
	private ILoginDao dao=null;
	public LoginServiceImpl() {
		this.dao=new LoginDaoImpl();
	}
	@Override
	public boolean isValidLogin(LoginBean bean) {
		if(dao.isValidLogin(bean))
			return true;
		return false;
	}
	@Override
	public PassRequestForm createRequest(PassRequestForm busBean) {
		if(dao.createRequest(busBean) != null)
			return busBean;
		return null;
	}
	@Override
	public List<Routetable> listAllRoutes() {
		List<Routetable> routeList=new ArrayList<>();
		routeList = dao.listAllRoutes();
		return routeList;
	}
	@Override
	public Routetable addRoute(Routetable newroute) {
		if(dao.addRoute(newroute)!=null) {
			return newroute;
		}
		return null;
	}
	@Override
	public List<String> PendingReqServlet() {
		List<String> list=new ArrayList<>();
		list=dao.PendingReqServlet();
		return list;
	}
	@Override
	public List<PassRequestForm> pendingDetails() {
		List<PassRequestForm> pendingList=dao.pendingDetails();
		if(pendingList!=null)
			return pendingList;
		return null;
	}
	@Override
	public List<PassRequestForm> pendingDetailsOfEmp(String empid) {
		List<PassRequestForm> pendingList=dao.pendingDetailsOfEmp(empid);
		if(pendingList!=null)
			return pendingList;
		return null;
	}
	@Override
	public Integer transaction(TransactionBean transaction) {
		Integer transaction_id=dao.transaction(transaction);
		return transaction_id;
	}
	@Override
	public List<TransactionBean> monthlyReport(LocalDate fdate, LocalDate tdate) {
		List<TransactionBean> tBean=dao.monthlyReport(fdate, tdate);
		if(tBean!=null)
			return tBean;
		return null;
	}

}
