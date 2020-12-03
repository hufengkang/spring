package cn.zero.domain;

public class User {
	private Long id;
	private String custNo;// 客户号
	private String certTpye;// 证件类型
	private String certNo;// 证件号
	private String userName;// 用户名

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCertTpye() {
		return certTpye;
	}

	public void setCertTpye(String certTpye) {
		this.certTpye = certTpye;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", custNo=" + custNo + ", certTpye=" + certTpye + ", certNo=" + certNo + ", userName="
				+ userName + "]";
	}

}
