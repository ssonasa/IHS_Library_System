package vo;

import java.util.Date;

public class Rented_Books {
	private String RENT_MEMBER_ID;
	private String RENT_BOOK_ID;
	private Date RENT_RENTED_DATE;
	private Date RENT_RETURN_DATE;

	public String getRENT_MEMBER_ID() {
		return RENT_MEMBER_ID;
	}

	public void setRENT_MEMBER_ID(String rENT_MEMBER_ID) {
		RENT_MEMBER_ID = rENT_MEMBER_ID;
	}

	public String getRENT_BOOK_ID() {
		return RENT_BOOK_ID;
	}

	public void setRENT_BOOK_ID(String rENT_BOOK_ID) {
		RENT_BOOK_ID = rENT_BOOK_ID;
	}

	public Date getRENT_RENTED_DATE() {
		return RENT_RENTED_DATE;
	}

	public void setRENT_RENTED_DATE(Date rENT_RENTED_DATE) {
		RENT_RENTED_DATE = rENT_RENTED_DATE;
	}

	public Date getRENT_RETURN_DATE() {
		return RENT_RETURN_DATE;
	}

	public void setRENT_RETURN_DATE(Date rENT_RETURN_DATE) {
		RENT_RETURN_DATE = rENT_RETURN_DATE;
	}

}
