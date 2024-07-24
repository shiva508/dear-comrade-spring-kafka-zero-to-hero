package com.comrade.service.kafkauserprofile;

import com.comrade.modal.KafkaUserprofile;
import java.util.List;

import com.comrade.form.response.CommonResponse;
import com.comrade.modal.Userprofile;

public interface KafkaUserProfileService {
	public KafkaUserprofile saveUserProfile(KafkaUserprofile userprofile);

	public List<KafkaUserprofile> getUserProfiles();

	public KafkaUserprofile getUserProfileByUserId(Integer userId);

	public CommonResponse deleteUserProfileByUserId(Integer userId);

	public KafkaUserprofile updateUserprofile(KafkaUserprofile userprofile);
}
