package com.comrade.service.userprofile;

import java.util.List;

import com.comrade.form.response.CommonResponse;
import com.comrade.modal.Userprofile;

public interface UserProfileService {
	public Userprofile saveUserProfile(Userprofile userprofile);

	public List<Userprofile> getUserProfiles();

	public Userprofile getUserProfileByUserId(Integer userId);

	public CommonResponse deleteUserProfileByUserId(Integer userId);

	public Userprofile updateUserprofile(Userprofile userprofile);
}
