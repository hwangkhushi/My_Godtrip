package kr.co.godtrip.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	public MemberDAO() {
		System.out.println("-----MemberDAO()객체 생성됨");
	}
		
	@Autowired
	SqlSession sqlSession;
		
	public void insert(MemberDTO dto) {
		sqlSession.insert("member.insert",dto);
	}//insert() end
	
}//class end
