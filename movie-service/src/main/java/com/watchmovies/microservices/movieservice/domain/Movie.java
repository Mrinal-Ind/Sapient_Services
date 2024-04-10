package com.watchmovies.microservices.movieservice.domain;

import java.util.List;

public class Movie {
	
	private String id;
	private String name;
	private String title;
	private String releaseDate;
	private String genere;
	private List<String> cast;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public List<String> getCast() {
		return cast;
	}
	public void setCast(List<String> cast) {
		this.cast = cast;
	}

}
