package com.thanhtuyen.server.utils;

import java.io.Serializable;

public class RequestDTO implements Serializable{
	private String request;
	private Object data;

	public RequestDTO() {
		super();
	}

	public RequestDTO(String request, Object data) {
		super();
		this.request = request;
		this.data = data;
	}

	public String getRequest() {
		return request;
	}

	public Object getData() {
		return data;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestDTO [request=" + request + ", data=" + data + "]";
	}

}
