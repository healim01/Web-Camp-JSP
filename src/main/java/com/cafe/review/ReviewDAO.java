package com.cafe.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

@Repository
public class ReviewDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertReview(ReviewVO vo) {
		int result = sqlSession.insert("Review.insertReview", vo); 
		return result;
	}
	
	public int deleteReview(int id) {
		int result = sqlSession.delete("Review.deleteReview", id); 
		return result;
	}

	public int updateReview(ReviewVO vo) {
		int result = sqlSession.update("Review.updateReview", vo); 
		return result;
	}
	
	public ReviewVO getReview(int id) {
		ReviewVO one = sqlSession.selectOne("Review.getReview", id); 
		return one;
	}
	
	public List<ReviewVO> getReviewList() {
		List<ReviewVO> list = sqlSession.selectList("Review.getReviewList"); 
		return list;
	}
}