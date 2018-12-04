package dao;

import java.sql.*;
import vo.Members;
import static db.JdbcUtil.*;

public class MemberDAO {
	private static MemberDAO memberDAO;
	private Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	private MemberDAO() {
	}

	public static MemberDAO getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}

	public void setConnection(Connection con) {
		this.con = con;
	}

	public int memberJoin(Members member) {
		String sql = "INSERT INTO MEMBERS VALUES (?,?,?,?,?,0,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_ID());
			System.out.println("id");
			pstmt.setString(2, member.getMEMBER_PASSWORD());
			System.out.println("pw");
			pstmt.setString(3, member.getMEMBER_NAME());
			System.out.println("name");
			pstmt.setInt(4, member.getMEMBER_AGE());
			System.out.println("age");
			pstmt.setString(5, member.getMEMBER_ADDRESS());
			System.out.println("address");
			pstmt.setString(6, member.getMEMBER_GENRE());
			System.out.println("genre");
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("memberJoin 오류!!" + e);
		} finally {
			close(pstmt);
		}
		return result;
	}

	public String memberLogin(Members member) {
		String loginId = null;
		String sql = "SELECT MEMBER_ID FROM MEMBERS WHERE MEMBER_ID=? AND MEMBER_PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_ID());
			pstmt.setString(2, member.getMEMBER_PASSWORD());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				loginId = rs.getString("MEMBER_ID");
				System.out.println("DB에서 조회한 id : " + loginId);
			}
		} catch (Exception e) {
			System.out.println("memberLogin 오류 : " + e);
		} finally {
			close(pstmt);
			close(rs);
		}
		return loginId;
	}

}
