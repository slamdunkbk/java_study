package com.java.exception;

import java.io.IOException;

class ThrowExceptions2{
	// IOException은 예외처리를 강제하고 있지만
	// ArithmeticException은 강제하지 않고 있다
	void throwArithmeticException(){
		throw new ArithmeticException();
	}
	// IOException은 try..catch 또는 throws 해서 처리를 해야된다.
	void throwIOException(){
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}
// ArithmeticException -> RuntimeException -> Exception
// IOException -> Exception
//
// ArithmeticException의 부모클래스는 RuntimeException
// 이므로 Unchecked(반드시 예외처리를 하지 않아도된다)