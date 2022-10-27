package sat.recruitment.api.mapper;

import org.springframework.stereotype.Component;

import sat.recruitment.api.dto.UserRequestDto;
import sat.recruitment.api.dto.UserResponseDto;
import sat.recruitment.api.entity.User;

@Component
public class UserMapper implements IUserMapper{
	
	@Override
	public User toDomain(UserRequestDto userRequest) {
		return User.build(userRequest.getName(),
				userRequest.getEmail(), 
				userRequest.getAddress(), 
				userRequest.getPhone(), 
				userRequest.getUserType(), 
				userRequest.getMoney());
	}

	@Override
	public UserResponseDto toDomain(User userResponse) {
		return UserResponseDto.build(userResponse.getName(), 
				userResponse.getEmail(),
				userResponse.getAddress(), 
				userResponse.getPhone(), 
				userResponse.getUserType(), 
				userResponse.getMoney());
	}

}
