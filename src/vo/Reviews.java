package vo;

import java.util.Date;

public class Reviews {
	private int REVIEW_NUM;
	private String REVIEW_SUBJECT;
	private String REVIEW_CONTENT;
	private Date REVIEW_DATE;
	private int REVIEW_CLICKED_COUNT;
	private String REVIEW_FILE;

	public int getREVIEW_NUM() {
		return REVIEW_NUM;
	}

	public void setREVIEW_NUM(int rEVIEW_NUM) {
		REVIEW_NUM = rEVIEW_NUM;
	}

	public String getREVIEW_SUBJECT() {
		return REVIEW_SUBJECT;
	}

	public void setREVIEW_SUBJECT(String rEVIEW_SUBJECT) {
		REVIEW_SUBJECT = rEVIEW_SUBJECT;
	}

	public String getREVIEW_CONTENT() {
		return REVIEW_CONTENT;
	}

	public void setREVIEW_CONTENT(String rEVIEW_CONTENT) {
		REVIEW_CONTENT = rEVIEW_CONTENT;
	}

	public Date getREVIEW_DATE() {
		return REVIEW_DATE;
	}

	public void setREVIEW_DATE(Date rEVIEW_DATE) {
		REVIEW_DATE = rEVIEW_DATE;
	}

	public int getREVIEW_CLICKED_COUNT() {
		return REVIEW_CLICKED_COUNT;
	}

	public void setREVIEW_CLICKED_COUNT(int rEVIEW_CLICKED_COUNT) {
		REVIEW_CLICKED_COUNT = rEVIEW_CLICKED_COUNT;
	}

	public String getREVIEW_FILE() {
		return REVIEW_FILE;
	}

	public void setREVIEW_FILE(String rEVIEW_FILE) {
		REVIEW_FILE = rEVIEW_FILE;
	}

}
