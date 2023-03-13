package com.study.test.vo;

import java.util.Arrays;

public class MemberDetailVO {
	private String[] lesson;
	private String takeLesson;
	private String recomendName;
	private String intro;
	
	public String[] getLesson() {
		return lesson;
	}
	public void setLesson(String[] lesson) {
		this.lesson = lesson;
	}
	public String getTakeLesson() {
		return takeLesson;
	}
	public void setTakeLesson(String takeLesson) {
		this.takeLesson = takeLesson;
	}
	public String getRecomendName() {
		return recomendName;
	}
	public void setRecomendName(String recomendName) {
		this.recomendName = recomendName;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	@Override
	public String toString() {
		return "MemberDetailVO [lesson=" + Arrays.toString(lesson) + ", takeLesson=" + takeLesson + ", recomendName="
				+ recomendName + ", intro=" + intro + "]";
	}
	
	
}
