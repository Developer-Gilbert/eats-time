package com.eatsTime.member.dao;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
=======
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.eatsTime.member.domain.MemberVO;
>>>>>>> master
import com.eatsTime.mybatis.config.MyBatisConfig;

public class MemberDAO {
	public SqlSession sqlSession;

	public MemberDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
<<<<<<< HEAD
=======
	
	// ���������� �ҷ�����
	public List<MemberVO> selectAll(MemberVO memberVO) {
		return sqlSession.selectList("member.selectAll", memberVO);
	}
	
	// ȸ����������
	public void update(MemberVO memberVO) {
		sqlSession.update("member.update", memberVO);
	}
	
	// ȸ��Ż��
	public void delete(String memberId) {
		sqlSession.delete("member.delete", memberId);
	}
>>>>>>> master

}