package com.org.messenger.entity;

import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class People {
	
	@GraphId private Long id;
	
	private String password;
	
	@Relationship(type = "SIGNUP", direction = Relationship.UNDIRECTED)
	public ProfileInfo profileInfo;
	
	@Relationship(type = "FRIENDS", direction = Relationship.UNDIRECTED)
	public Set<People> friends;
	
	
	public Set<People> getFriends() {
		return friends;
	}



	public void setFriends(Set<People> friends) {
		this.friends = friends;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public ProfileInfo getProfileInfo() {
		return profileInfo;
	}



	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}



	private People() {
	};

}
