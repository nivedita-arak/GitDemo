package com.ikon.backend.beans;

public class TicketInfoBean {
	String priority; 
	String incident_ID ;
	String summary ;
	String status ;
	String assigned_Group ;
	String appName ;
	String relev_Perc ;
	String usage_Perc;
	String reportd_Date ;
	
//	public TicketInfoBean(String priority, String incident_ID, String summary, String status, String assigned_Group,
//	String appName, String relev_Perc, String usage_Perc, String reportd_Date) {
//Priority = priority;
//Incident_ID = incident_ID;
//Summary = summary;
//Status = status;
//Assigned_Group = assigned_Group;
//AppName = appName;
//Relev_Perc = relev_Perc;
//Usage_Perc = usage_Perc;
//Reportd_Date = reportd_Date;
//}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getIncident_ID() {
		return incident_ID;
	}
	public void setIncident_ID(String incident_ID) {
		this.incident_ID = incident_ID;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssigned_Group() {
		return assigned_Group;
	}
	public void setAssigned_Group(String assigned_Group) {
		this.assigned_Group = assigned_Group;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getRelev_Perc() {
		return relev_Perc;
	}
	public void setRelev_Perc(String relev_Perc) {
		this.relev_Perc = relev_Perc;
	}
	public String getUsage_Perc() {
		return usage_Perc;
	}
	public void setUsage_Perc(String usage_Perc) {
		this.usage_Perc = usage_Perc;
	}
	public String getReportd_Date() {
		return reportd_Date;
	}
	public void setReportd_Date(String reportd_Date) {
		this.reportd_Date = reportd_Date;
	}
	

	@Override
	public String toString() {
		return "TicketInfoBean [priority=" + priority + ", incident_ID=" + incident_ID + ", summary=" + summary
				+ ", status=" + status + ", assigned_Group=" + assigned_Group + ", appName=" + appName + ", relev_Perc="
				+ relev_Perc + ", usage_Perc=" + usage_Perc + ", reportd_Date=" + reportd_Date + "]";
	}
	
	
	
}
