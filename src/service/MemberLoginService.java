package service;

import java.sql.*;
import static db.JdbcUtil.*;
import dao.MemberDAO;
import vo.Members;

public class MemberLoginService {

	public boolean memberLogin(Members member) {
		Connection con = getConnection();
		// DAO 객체 생성
		MemberDAO memberDAO = MemberDAO.getInstance();
		// DAO 객체에 DB 연결 정보를 넘김.
		memberDAO.setConnection(con);

		String loginId = memberDAO.memberLogin(member);
		boolean loginResult = false;
		if (loginId != null) {
			// DB에 해당 id 존재
			loginResult = true;
		} else {
			// DB에 해당 id 없음
			loginResult = false;
		}
		// DB 접속 해제
		close(con);
		return loginResult;
	}

}
