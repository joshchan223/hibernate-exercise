package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import core.util.HibernateUtil;
import web.member.pojo.Member;


public class TestAPP {
	public static void main(String[] args) {
		//連線工廠
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Member member = session.get(Member.class, 1);
		System.out.println(member.getNickname());
		HibernateUtil.shutdown();
	}
}
