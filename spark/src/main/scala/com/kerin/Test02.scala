/**
  * Created by Administrator on 2017/8/6.
  */
object Test02 {

  def main(args: Array[String]): Unit = {
    var aa = Array(1,2,3,4,5,6);
    for(a<-aa){
      print(a+" ")
    }
    println()
    for(a1<-(1 to 5);b1<-(6 to 10)){
      print(a1)
      print(b1)
    }
    println()
    var ll = List("nihao","wohao","dajiahao");
    for(l<-ll){
      print(l+" ")
    }
  }

}
