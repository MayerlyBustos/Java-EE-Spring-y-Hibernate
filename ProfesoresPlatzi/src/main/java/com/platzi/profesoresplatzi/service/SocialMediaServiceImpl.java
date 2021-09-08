package com.platzi.profesoresplatzi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.profesoresplatzi.dao.SocialMediaDao;
import com.platzi.profesoresplatzi.model.SocialMedia;
import com.platzi.profesoresplatzi.model.TeacherSocialMedia;

@Service("socialMediaService")
@Transactional
public class SocialMediaServiceImpl implements SocialMediaService{
	
	@Autowired
	private SocialMediaDao _socialMediaDao;
	
	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.saveSocialMedia(socialMedia);
	}

	@Override
	public void deleteSocialMediaById(Long id) {
		// TODO Auto-generated method stub
		_socialMediaDao.deleteSocialMediaById(id);
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.updateSocialMedia(socialMedia);
	}

	@Override
	public List<SocialMedia> findAllSocialMedias() {
		// TODO Auto-generated method stub
		return _socialMediaDao.findAllSocialMedias();
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findById(idSocialMedia);
	}

	@Override
	public SocialMedia findByName(String name) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findByName(name);
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findSocialMediaByIdAndName(idSocialMedia, nickname);
	}
	
	@Override
	public TeacherSocialMedia findSocialMediaByIdTeacherAndIdSocialMedia(Long idTeacher, Long idSocialMedia) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findSocialMediaByIdTeacherAndIdSocialMedia(idTeacher, idSocialMedia);
	}

}
