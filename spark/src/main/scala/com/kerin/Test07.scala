/**
  * Created by Administrator on 2017/8/8.
  */
object Test07 {

  def main(args: Array[String]): Unit = {
    println(a1("你好","你好么"))
    a2("他好")
    a3("大家好");
    var nmhs =(info:String)=>info
    print(nmhs("真的好"))
  }

  def a1[X,Y](x:X,y:Y)="返回值:"+x+"-"+y
  def a2(t: =>String)={
    println(t)
  }
  def a3(args:String*)={
    for(arg<-args){
      println(arg)
    }
  }

}
