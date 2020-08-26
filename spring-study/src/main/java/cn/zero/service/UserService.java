package cn.zero.service;

import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zero.dao.SignInInfoDao;
import cn.zero.dao.UserDao;
import cn.zero.domain.SignInInfo;
import cn.zero.domain.User;

/**
 * @description:
 * @author zero
 *
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private SignInInfoDao signInInfoDao;

	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * @description:添加用户信息和签到信息
	 * @param user
	 * @return
	 */
	public boolean openAccount(User user) {// user:custNo
		try {
			// 新增用户信息
			userDao.addUser(user);

			// 新增签到信息
			SignInInfo signInInfo = new SignInInfo();
			signInInfo.setCustNo(user.getCustNo());
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.DATE, -1);
			Date yesterday = cal.getTime();
			String yesterdayStr = DateFormatUtils.format(yesterday, "yyyy-MM-dd");
			signInInfo.setLatest(yesterdayStr);
			signInInfoDao.addSignInInfo(signInInfo);
		} catch (Exception e) {
			logger.error("用户信息入库失败");
			throw new RuntimeException(e);
		}
		return true;
	}
	
	/**
	 * @description:查询客户签到信息&若断签，清除的签到记录
	 * @param user
	 * @return
	 */
	public SignInInfo querySignInInfo(User user) {
		SignInInfo info = signInInfoDao.selectSignInfo(user.getCustNo());
		return null;
	}

}
