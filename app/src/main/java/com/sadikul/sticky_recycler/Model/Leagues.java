package com.sadikul.sticky_recycler.Model;

import android.support.annotation.NonNull;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Leagues implements Comparable<Leagues>{

	@SerializedName("country")
	private String country;

	@SerializedName("leagues")
	private List<LeaguesItem> leagues;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLeagues(List<LeaguesItem> leagues){
		this.leagues = leagues;
	}

	public List<LeaguesItem> getLeagues(){
		return leagues;
	}

	@Override
 	public String toString(){
		return 
			"Leagues{" + 
			"country = '" + country + '\'' + 
			",leagues = '" + leagues + '\'' + 
			"}";
		}

	@Override
	public int compareTo(@NonNull Leagues o) {
		return getCountry().toString().compareTo(o.getCountry().toString());
	}
}