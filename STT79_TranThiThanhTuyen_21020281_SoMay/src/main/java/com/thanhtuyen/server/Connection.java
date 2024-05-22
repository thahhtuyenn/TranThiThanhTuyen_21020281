package com.thanhtuyen.server;

import com.thanhtuyen.server.dao.PersonDao;
import com.thanhtuyen.server.dao.impl.PersonDaoImpl;
import com.thanhtuyen.server.utils.AppUtils;

import jakarta.persistence.EntityManager;

public class Connection {

	public static void main(String[] args) {
		// CREATE DATABASE TranThiThanhTuyen_21020281
		// CHARACTER SET = "utf8mb4"
		// root - sapassword
		// root - root
		EntityManager em = AppUtils.getEntityManager();
		em.close();
	}

}
