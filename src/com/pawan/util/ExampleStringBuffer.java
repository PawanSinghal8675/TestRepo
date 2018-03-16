package com.pawan.util;

import java.util.UUID;

public class ExampleStringBuffer {

	public static void main(String[] args) {
		ExampleStringBuffer testObj = new ExampleStringBuffer();
		int iNumebrOfIterations = 100;
		int iMultiFac = 1000;
		for(int i = 1 ; i<iNumebrOfIterations ; i++){
			long start = System.currentTimeMillis();
			testObj.exampleAppendToStringBuffer(args,i*iMultiFac);
			long end = System.currentTimeMillis();
			System.out.println("Appending of " + i*iMultiFac + " UUID's takes " +
					(end - start) + "ms");
		}
	}

	public String exampleAppendToStringBuffer(String[] args, int iNumebrOfStrings){
		StringBuffer strBuff = new StringBuffer();
		for(int itr = 0; itr<iNumebrOfStrings;itr++){
			String uuid = UUID.randomUUID().toString();
			strBuff.append(uuid);
		}
		return strBuff.toString();
	}
}
