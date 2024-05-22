package com.thanhtuyen.server.utils;

import java.io.Serializable;

public class ResponseDTO implements Serializable{
	private String response;
	private Object data;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(String response, Object data) {
		super();
		this.response = response;
		this.data = data;
	}

	public String getResponse() {
		return response;
	}

	public Object getData() {
		return data;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDTO [response=" + response + ", data=" + data + "]";
	}

}
