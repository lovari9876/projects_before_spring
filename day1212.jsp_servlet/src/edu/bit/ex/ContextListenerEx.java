package edu.bit.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Servlet implementation class ContextListenerEx
 */
@WebListener
public class ContextListenerEx implements ServletContextListener {
	private static final long serialVersionUID = 1L;

	public ContextListenerEx() {
	} // 생성자

//	이하의 함수들은 WAS인 톰캣이 호출해준다.
//	웹어플리케이션의 생명주기(LifeCycle)를 감시하는 리스너(Listener)가 있습니다. 
//	바로 ServletContextListener 입니다.
//	리스너의 해당 메소드가 웹 어플리케이션의 시작과 종료 시 호출 됩니다.
//	(contextInitialized(), contextDestroyed())
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized");
	}
}
