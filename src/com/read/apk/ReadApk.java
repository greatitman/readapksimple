package com.read.apk;

public class ReadApk {

	/**
	 * 
	 * @param args
	 * @return void
	 * @author hsx
	 * @time 2013-4-24下午03:20:24
	 */
	public static void main(String[] args) {
		String path = "./src//com//read//apk//AvengerPlayer.apk";//baidushurufa.apk";

		String[] messag = AnalysisApk.unZip(path, "E://11");
		System.out.println(messag[0] + "-------->" + messag[1]);
	}

}
