package com.clickdebit.service.constants;

public enum TransactionStatus {
	TRANSACTION_INITIATED(0),
	
	BANK_SELECTED(1),
	
	BANK_PAGE_LOAD_FAILURE(2),
	BANK_PAGE_LOAD_SUCCESS(3),
	
	BANK_LOGIN_FAILURE(4),
	BANK_LOGIN_SUCCESS(5),
	
	BANK_LOGIN_OTP_FAILURE(6),
	BANK_LOGIN_OTP_SUCCESS(7),
	
	BANK_LOGIN_CAPTCHA_FAILURE(8),
	BANK_LOGIN_CAPTCHA_SUCCESS(9),
	
	DOES_PAYEE_EXISTS_FAILURE(10),
	DOES_PAYEE_EXISTS_SUCCESS(11),

	IS_PAYEE_OTP_REQUIRED_FAILURE(12),
	IS_PAYEE_OTP_REQUIRED_SUCCESS(13),
	
	ADD_PAYEE_FAILURE(14),
	ADD_PAYEE_OTP_FAILURE(15),
	ADD_PAYEE_SUCCESS(16),

	IS_TRANSACTION_OTP_REQUIRED_FAILURE(17),
	IS_TRANSACTION_OTP_REQUIRED_SUCCESS(18),
	
	TRANSACTION_OTP_FAILURE(19),
	TRANSACTION_OTP_SUCCESS(20),
	
	TRANSACTION_SUCCESS(21),
	TRANSACTION_FAILURE(22),
	
	IS_TRANSACTION_TOKEN_REQUIRED_FAILURE(23),
	IS_TRANSACTION_TOKEN_REQUIRED_SUCCESS(24),
	
	TRANSACTION_TOKEN_FAILURE(25),
	TRANSACTION_TOKEN_SUCCESS(26);
	
	private int value;
	
	private TransactionStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
