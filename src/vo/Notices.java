package vo;

import java.util.Date;

public class Notices {
	private int NOTICE_NUM;
	private String NOTICE_SUBJECT;
	private String NOTICE_CONTENT;
	private Date NOTICE_DATE;
	private int NOTICE_CLICKED_COUNT;
	private String NOTICE_FILE;

	public int getNOTICE_NUM() {
		return NOTICE_NUM;
	}

	public void setNOTICE_NUM(int nOTICE_NUM) {
		NOTICE_NUM = nOTICE_NUM;
	}

	public String getNOTICE_SUBJECT() {
		return NOTICE_SUBJECT;
	}

	public void setNOTICE_SUBJECT(String nOTICE_SUBJECT) {
		NOTICE_SUBJECT = nOTICE_SUBJECT;
	}

	public String getNOTICE_CONTENT() {
		return NOTICE_CONTENT;
	}

	public void setNOTICE_CONTENT(String nOTICE_CONTENT) {
		NOTICE_CONTENT = nOTICE_CONTENT;
	}

	public Date getNOTICE_DATE() {
		return NOTICE_DATE;
	}

	public void setNOTICE_DATE(Date nOTICE_DATE) {
		NOTICE_DATE = nOTICE_DATE;
	}

	public int getNOTICE_CLICKED_COUNT() {
		return NOTICE_CLICKED_COUNT;
	}

	public void setNOTICE_CLICKED_COUNT(int nOTICE_CLICKED_COUNT) {
		NOTICE_CLICKED_COUNT = nOTICE_CLICKED_COUNT;
	}

	public String getNOTICE_FILE() {
		return NOTICE_FILE;
	}

	public void setNOTICE_FILE(String nOTICE_FILE) {
		NOTICE_FILE = nOTICE_FILE;
	}

}
