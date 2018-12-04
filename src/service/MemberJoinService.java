package service;

import java.sql.*;
import static db.JdbcUtil.*;
import dao.MemberDAO;
import vo.Members;

public class MemberJoinService {
	public boolean memberJoin(Members member) {
		MemberDAO memberDAO = MemberDAO.getInstance();
		Connection con = getConnection();
		memberDAO.setConnection(con);

		boolean joinResult = false;
		int result = memberDAO.memberJoin(member);
		if (result > 0) {
			joinResult = true;
			commit(con);
		} else {
			joinResult = false;
			rollback(con);
		}
		close(con);
		return joinResult;
	}
}
