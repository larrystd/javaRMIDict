/**
 * @description: 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
 */

package com.dic;

import java.rmi.Remote;

public interface Translator extends Remote {
  public String translate(String str) throws java.rmi.RemoteException;
}