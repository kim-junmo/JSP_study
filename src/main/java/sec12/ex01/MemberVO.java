package sec12.ex01;

import java.sql.Date;

//오라클 테이블을 기반으로 클래스를 생성.
public class MemberVO {
	
	//sql과 동일한 테이블 구조를 가진 클래스 만들기 
	//컬럼명과 필드 명이 동일하다.
	
	private	String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	//생성자 만들기
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}


	//접근자 만들기
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
