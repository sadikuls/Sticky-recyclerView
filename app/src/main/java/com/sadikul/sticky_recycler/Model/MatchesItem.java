package com.sadikul.sticky_recycler.Model;

import com.google.gson.annotations.SerializedName;

public class MatchesItem{

	@SerializedName("gs_localteamid")
	private String gsLocalteamid;

	@SerializedName("date")
	private String date;

	@SerializedName("hi")
	private int hi;

	@SerializedName("leaguename")
	private String leaguename;

	@SerializedName("leagueKey")
	private String leagueKey;

	@SerializedName("visitorteam_org")
	private String visitorteamOrg;

	@SerializedName("ht")
	private String ht;

	@SerializedName("scoretime")
	private String scoretime;

	@SerializedName("localteam_org")
	private String localteamOrg;

	@SerializedName("localteamid")
	private String localteamid;

	@SerializedName("localteam")
	private String localteam;

	@SerializedName("visitorteamid")
	private String visitorteamid;

	@SerializedName("stageName")
	private String stageName;

	@SerializedName("gs_visitorteamid")
	private String gsVisitorteamid;

	@SerializedName("leagueid")
	private String leagueid;

	@SerializedName("visitorteam")
	private String visitorteam;

	@SerializedName("filegroup")
	private String filegroup;

	@SerializedName("id")
	private String id;

	@SerializedName("time")
	private String time;

	@SerializedName("status")
	private String status;

	@SerializedName("stageId")
	private int stageId;

	public void setGsLocalteamid(String gsLocalteamid){
		this.gsLocalteamid = gsLocalteamid;
	}

	public String getGsLocalteamid(){
		return gsLocalteamid;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setHi(int hi){
		this.hi = hi;
	}

	public int getHi(){
		return hi;
	}

	public void setLeaguename(String leaguename){
		this.leaguename = leaguename;
	}

	public String getLeaguename(){
		return leaguename;
	}

	public void setLeagueKey(String leagueKey){
		this.leagueKey = leagueKey;
	}

	public String getLeagueKey(){
		return leagueKey;
	}

	public void setVisitorteamOrg(String visitorteamOrg){
		this.visitorteamOrg = visitorteamOrg;
	}

	public String getVisitorteamOrg(){
		return visitorteamOrg;
	}

	public void setHt(String ht){
		this.ht = ht;
	}

	public String getHt(){
		return ht;
	}

	public void setScoretime(String scoretime){
		this.scoretime = scoretime;
	}

	public String getScoretime(){
		return scoretime;
	}

	public void setLocalteamOrg(String localteamOrg){
		this.localteamOrg = localteamOrg;
	}

	public String getLocalteamOrg(){
		return localteamOrg;
	}

	public void setLocalteamid(String localteamid){
		this.localteamid = localteamid;
	}

	public String getLocalteamid(){
		return localteamid;
	}

	public void setLocalteam(String localteam){
		this.localteam = localteam;
	}

	public String getLocalteam(){
		return localteam;
	}

	public void setVisitorteamid(String visitorteamid){
		this.visitorteamid = visitorteamid;
	}

	public String getVisitorteamid(){
		return visitorteamid;
	}

	public void setStageName(String stageName){
		this.stageName = stageName;
	}

	public String getStageName(){
		return stageName;
	}

	public void setGsVisitorteamid(String gsVisitorteamid){
		this.gsVisitorteamid = gsVisitorteamid;
	}

	public String getGsVisitorteamid(){
		return gsVisitorteamid;
	}

	public void setLeagueid(String leagueid){
		this.leagueid = leagueid;
	}

	public String getLeagueid(){
		return leagueid;
	}

	public void setVisitorteam(String visitorteam){
		this.visitorteam = visitorteam;
	}

	public String getVisitorteam(){
		return visitorteam;
	}

	public void setFilegroup(String filegroup){
		this.filegroup = filegroup;
	}

	public String getFilegroup(){
		return filegroup;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setStageId(int stageId){
		this.stageId = stageId;
	}

	public int getStageId(){
		return stageId;
	}

	@Override
 	public String toString(){
		return 
			"MatchesItem{" + 
			"gs_localteamid = '" + gsLocalteamid + '\'' + 
			",date = '" + date + '\'' + 
			",hi = '" + hi + '\'' + 
			",leaguename = '" + leaguename + '\'' + 
			",leagueKey = '" + leagueKey + '\'' + 
			",visitorteam_org = '" + visitorteamOrg + '\'' + 
			",ht = '" + ht + '\'' + 
			",scoretime = '" + scoretime + '\'' + 
			",localteam_org = '" + localteamOrg + '\'' + 
			",localteamid = '" + localteamid + '\'' + 
			",localteam = '" + localteam + '\'' + 
			",visitorteamid = '" + visitorteamid + '\'' + 
			",stageName = '" + stageName + '\'' + 
			",gs_visitorteamid = '" + gsVisitorteamid + '\'' + 
			",leagueid = '" + leagueid + '\'' + 
			",visitorteam = '" + visitorteam + '\'' + 
			",filegroup = '" + filegroup + '\'' + 
			",id = '" + id + '\'' + 
			",time = '" + time + '\'' + 
			",status = '" + status + '\'' + 
			",stageId = '" + stageId + '\'' + 
			"}";
		}
}