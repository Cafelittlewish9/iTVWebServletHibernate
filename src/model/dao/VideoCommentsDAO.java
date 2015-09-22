package model.dao;

import java.util.List;

import model.vo.VideoCommentsVO;

public interface VideoCommentsDAO {

	public List<VideoCommentsVO> selectAll();

	public int insert(VideoCommentsVO videoComments);

	public int update(VideoCommentsVO videoComments);

	public int delete(int commentId);

}