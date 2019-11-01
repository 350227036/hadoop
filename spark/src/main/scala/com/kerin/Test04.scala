/**
  * Created by Administrator on 2017/8/6.
  */
object Test04 {

  def main(args: Array[String]): Unit = {
    printStr("Java","Scala","Python","R")
  }

  def printStr(vv:String*)={
    for(v<-vv){
      print(v+" ")
    }
  }

}
