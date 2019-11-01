package com.kerin

import org.apache.spark.{SparkConf,SparkContext}
/**
  * Created by Administrator on 2017/8/11.
  */
object Test09 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Test09").setMaster("local")
    val sc = new SparkContext(conf)
    val text = sc.parallelize(Seq("a","b","c","c"))
    val cnt = text.count()
    println("数量"+cnt)
  }

}
