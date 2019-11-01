package com.kerin

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Administrator on 2017/8/11.
  */
object Test {

  def main(args: Array[String]): Unit = {
    var conf = new SparkConf().setAppName("Test03").setMaster("local")
    var sc = new SparkContext(conf)
    var a = sc.parallelize(Seq(1 to 5))
    var b = sc.parallelize(Seq(1 to 11))
    var c = b.subtract(a)
    c.foreach(x=>print(x))
  }

}
