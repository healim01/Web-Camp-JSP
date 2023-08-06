package com.cafe.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CafeServiceImpl implements CafeService{
	
	@Autowired
	ReviewDAO reviewDAO;
	
	@Override
	public int insertReview(ReviewVO vo) {
		return reviewDAO.insertReview(vo);
	}

	@Override
	public int deleteReview(int id) {
		return reviewDAO.deleteReview(id);
	}

	@Override
	public int updateReview(ReviewVO vo) {
		return reviewDAO.updateReview(vo);
	}

	@Override
	public ReviewVO getReview(int seq) {
		// TODO Auto-generated method stub
		return reviewDAO.getReview(seq);
	}

	@Override
	public List<ReviewVO> getReviewList() {
		return reviewDAO.getReviewList();
	}
}
