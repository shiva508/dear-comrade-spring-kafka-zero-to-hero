package com.comrade.service.kafkauserprofile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comrade.constants.UserProfileConstants;
import com.comrade.form.exception.NoRecardsFoundException;
import com.comrade.form.response.CommonResponse;
import com.comrade.modal.KafkaUserprofile;
import com.comrade.modal.Userprofile;
import com.comrade.repository.kafkauserprofile.KafkaUserprofileRepository;
import com.comrade.repository.userprofile.UserprofileRepository;
import com.comrade.util.UserProfileUtil;

@Service
public class KafkaUserProfileServiceImpl implements KafkaUserProfileService {
	
	@Autowired
	private KafkaUserprofileRepository kafkaUserprofileRepository;
	
	@Autowired
	private UserProfileUtil userProfileUtil;

	@Override
	public KafkaUserprofile saveUserProfile(KafkaUserprofile userprofile) {
		
		return kafkaUserprofileRepository.save(userprofile);
	}

	@Override
	public List<KafkaUserprofile> getUserProfiles() {
		
		return kafkaUserprofileRepository.findAll();
	}

	@Override
	public KafkaUserprofile getUserProfileByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResponse deleteUserProfileByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KafkaUserprofile updateUserprofile(KafkaUserprofile userprofile) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
