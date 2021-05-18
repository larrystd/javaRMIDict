/**
 * @description: server主要功能是进行url与对象的绑定，实现根据url调用对象
 */
package com.dic;

import java.rmi.registry.LocateRegistry;

public class HelloServer {
  public static void main(String[] args){
    try {
      Translator translate = new TranslatorImpl();

      /*
      创建一个ie注册表实例，指明接收端口的请求
      */
      LocateRegistry.createRegistry(8888);

      /* 远程对象绑定到url中*/
      //java.rmi.Naming.rebind("rmi://127.0.0.1:8888/hello",hello);
      java.rmi.Naming.rebind("rmi://127.0.0.1:8888/translate", translate);
      System.out.print("Ready");
    } catch (Exception e){
      System.out.println("提供远程对象失败，原因是: " + e.getMessage());
    }
  }
}