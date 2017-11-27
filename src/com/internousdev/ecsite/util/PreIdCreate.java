package com.internousdev.ecsite.util;

import org.apache.commons.lang3.RandomStringUtils;

public class PreIdCreate {
	public String preIdCteate(){
	   String str =RandomStringUtils.randomAlphabetic(8);
	   return str;
	   }
}