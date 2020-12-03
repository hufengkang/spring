package cn.zero.dao;

import cn.zero.domain.SignInInfo;

public interface SignInInfoDao {

	int addSignInInfo(SignInInfo signInInfo);

	SignInInfo selectSignInfo(String custNo);

}
