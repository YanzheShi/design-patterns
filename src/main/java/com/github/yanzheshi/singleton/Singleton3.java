package com.github.yanzheshi.singleton;

import net.jcip.annotations.NotThreadSafe;

/**
 * 懒汉式, 线程不安全
 * @author shiyanzhe
 */

@NotThreadSafe
public class Singleton3 {
  private static Singleton3 instance;

  private Singleton3(){

  }

  public static Singleton3 getInstance() {
      if (instance == null) {
          instance = new Singleton3();
      }
      return instance;
  }
}


