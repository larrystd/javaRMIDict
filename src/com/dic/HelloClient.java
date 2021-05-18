/**
 * @description: client发送请求
 */
package com.dic;

import java.rmi.Naming;
import java.util.Scanner;

public class HelloClient {

  public static void main(String[] args) {
		// System.setSecurityManager(new RMISecurityManager());
		try {
      // 通过url访问对象
			Translator tran = (Translator)Naming.lookup("//127.0.0.1:8888/translate");
			Scanner sc = new Scanner(System.in);
			System.out.println("中译英/请输入要翻译中文词语");
			String word = sc.nextLine();
			System.out.println(word + "翻译结果为" + tran.translate(word));
      sc.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}