package com.elasticpath.rest.sdk.oauth.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthToken {

	private String headerName;

	@JsonProperty("access_token")
	private String headerValue;

	public OAuthToken() {
		this.headerName = "Authorization";
	}

	public String getHeaderName() {
		return headerName;
	}

	public String getHeaderValue() {
		return headerValue;
	}

	void setHeaderValue(String accessToken) {
		this.headerValue = "Bearer " + accessToken;
	}
}