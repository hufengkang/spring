package cn.zero.utils;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheUtil {

	@Autowired
	private RedisTemplate redisTemplate;

	/**
	 * description:缓存基本的对象，基本类型的包装类、String、实体类
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public ValueOperations<String, Object> setCacheObject(String key, Object value) {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);

		return opsForValue;
	}

	/**
	 * description:获得缓存的基本对象
	 * 
	 * @param key
	 * @return
	 */
	public Object getCacheObject(String key) {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		return opsForValue.get(key);
	}

	/**
	 * description:缓存map
	 * 
	 * @param key
	 * @param dataMap
	 * @return
	 */
	public HashOperations<String, String, Object> setCacheMap(String key, Map<String, Object> dataMap) {
		HashOperations<String, String, Object> opsForHash = redisTemplate.opsForHash();
		if (dataMap != null) {
			for (Entry<String, Object> entry : dataMap.entrySet()) {
				opsForHash.put(key, entry.getKey(), entry.getValue());
			}
		}
		return opsForHash;
	}

	/**
	 * description:一次缓存整个map
	 * 
	 * @param key
	 * @param dataMap
	 * @return
	 */
	public HashOperations<String, String, Object> setCacheOneMap(String key, Map<String, Object> dataMap) {
		HashOperations<String, String, Object> opsForHash = redisTemplate.opsForHash();
		if (dataMap != null) {
			opsForHash.putAll(key, dataMap);
		}
		return opsForHash;
	}

	/**
	 * description:得到整个map
	 * 
	 * @param key
	 * @return
	 */
	public Map<String, Object> getCacheMap(String key) {
		HashOperations<String, String, Object> opsForHash = redisTemplate.opsForHash();
		return opsForHash.entries(key);

	}

	public Object getCacheValueFromMap(String key, String field) {
		HashOperations<String, String, Object> opsForHash = redisTemplate.opsForHash();
		return opsForHash.get(key, field);
	}

}
