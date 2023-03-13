package com.study.test.vo;

import java.util.Arrays;

public class MemberVO {
	public String memId;
	public String memPw;
	public String memName;
	public String[] memTell;
	public String memEmail;
	public String memDate;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String[] getMemTell() {
		return memTell;
	}
	public void setMemTell(String[] memTell) {
		this.memTell = memTell;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemDate() {
		return memDate;
	}
	public void setMemDate(String memDate) {
		this.memDate = memDate;
	}
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", memTell="
				+ Arrays.toString(memTell) + ", memEmail=" + memEmail + ", memDate=" + memDate + "]";
	}
	
	
}
