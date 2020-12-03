package cn.zero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

@Service
public class RedisUserService {

	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	public String getString(String key) {
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		
		if(redisTemplate.hasKey(key)) {
			return opsForValue.get(key);
		}else {
			opsForValue.set(key, "welcome to here");
			return opsForValue.get(key);
		}
		
	}
	
	public void delString(String key) {
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		redisTemplate.delete(key);
	}
	
}
