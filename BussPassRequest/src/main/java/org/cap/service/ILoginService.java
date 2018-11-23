package org.cap.service;

import java.time.LocalDate;
import java.util.List;

import org.cap.bean.LoginBean;
import org.cap.bean.PassRequestForm;
import org.cap.bean.Routetable;
import org.cap.bean.TransactionBean;

public interface ILoginService {
	public boolean isValidLogin(LoginBean bean);
	public abstract PassRequestForm createRequest(PassRequestForm busBean);
	public abstract List<Routetable> listAllRoutes();
	public abstract Routetable addRoute(Routetable newroute);
	public abstract List<String> PendingReqServlet();
	public List<PassRequestForm> pendingDetails();
	public abstract List<PassRequestForm> pendingDetailsOfEmp(String empid);
	public abstract Integer transaction(TransactionBean transaction);
	public List<TransactionBean> monthlyReport(LocalDate fdate, LocalDate tdate);

}
