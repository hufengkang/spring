package cn.zero.annotation.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AnnoHandlerProcessor implements BeanPostProcessor{
	
	private Map<String, AnnoHandler> map = new HashMap<>();
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(AnnoHandler.class.isAssignableFrom(bean.getClass())) {
			AnnoMapping annoMapping = bean.getClass().getAnnotation(AnnoMapping.class);
			if(annoMapping != null) {
				String key = annoMapping.value();
				map.put(key, (AnnoHandler) bean);
			}
		
		}
		
		return bean;
	}

}
