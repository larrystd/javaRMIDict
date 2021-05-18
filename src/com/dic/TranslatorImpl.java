/**
 * @description: Translator接口的实现，翻译功能
 */
package com.dic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class TranslatorImpl extends UnicastRemoteObject implements Translator {
  private static final long serialVersionUID = 1L;

	private Map<String,String> dict = new HashMap<String,String>();
  
  protected TranslatorImpl() throws RemoteException {
    super();
  }

	@Override
	public String translate(String str) throws RemoteException {
		dict.put("分布式", "distributed");
		dict.put("系统", "system");
		dict.put("递归", "recursion");
		dict.put("回溯", "backtracking");
		return dict.get(str).toString();
	}
}