//package cn.zero.domain;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
///**
// * @description:定时任务相关信息
// * @author zero
// *
// */
//@Component
//@PropertySource(value="classpath:domainProperties/schedule.properties")
//public class ScheduleJob {
//
//	@Value("${scheduleJob.jobId}")
//	private String jobId;
//	
//	@Value("${scheduleJob.jobName}")
//	private String jobName;
//	
//	@Value("${scheduleJob.jobGroup}")
//	private String jobGroup;
//	
//	@Value("${scheduleJob.jobStatus}")
//	private String jobStatus; // 0-禁用 1-启用 2-删除
//	
//	@Value("${scheduleJob.cronExpression}")
//	private String cronExpression;
//	
//	@Value("${scheduleJob.desc}")
//	private String desc;
//
//	@Override
//	public String toString() {
//		return "ScheduleJob [jobId=" + jobId + ", jobName=" + jobName + ", jobGroup=" + jobGroup + ", jobStatus="
//				+ jobStatus + ", cronExpression=" + cronExpression + ", desc=" + desc + "]";
//	}
//
//	public String getJobId() {
//		return jobId;
//	}
//
//	public void setJobId(String jobId) {
//		this.jobId = jobId;
//	}
//
//	public String getJobName() {
//		return jobName;
//	}
//
//	public void setJobName(String jobName) {
//		this.jobName = jobName;
//	}
//
//	public String getJobGroup() {
//		return jobGroup;
//	}
//
//	public void setJobGroup(String jobGroup) {
//		this.jobGroup = jobGroup;
//	}
//
//	public String getJobStatus() {
//		return jobStatus;
//	}
//
//	public void setJobStatus(String jobStatus) {
//		this.jobStatus = jobStatus;
//	}
//
//	public String getCronExpression() {
//		return cronExpression;
//	}
//
//	public void setCronExpression(String cronExpression) {
//		this.cronExpression = cronExpression;
//	}
//
//	public String getDesc() {
//		return desc;
//	}
//
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//
//}
