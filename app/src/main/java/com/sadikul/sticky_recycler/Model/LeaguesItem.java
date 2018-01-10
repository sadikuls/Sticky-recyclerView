package com.sadikul.sticky_recycler.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LeaguesItem{

	@SerializedName("hi")
	private String hi;

	@SerializedName("league")
	private String league;

	@SerializedName("matches")
	private List<MatchesItem> matches;

	@SerializedName("key")
	private String key;

	public void setHi(String hi){
		this.hi = hi;
	}

	public String getHi(){
		return hi;
	}

	public void setLeague(String league){
		this.league = league;
	}

	public String getLeague(){
		return league;
	}

	public void setMatches(List<MatchesItem> matches){
		this.matches = matches;
	}

	public List<MatchesItem> getMatches(){
		return matches;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"LeaguesItem{" + 
			"hi = '" + hi + '\'' + 
			",league = '" + league + '\'' + 
			",matches = '" + matches + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}