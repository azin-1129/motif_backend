package com.ssafy.motif.app.mapper;

import com.ssafy.motif.app.dto.image.ProfileImage;

public interface ImageMapper {
	void profilePicAdd(ProfileImage profileImage);
	ProfileImage profilePicLoad(String email);
	void profilePicRemove(String email);
}