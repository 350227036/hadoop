/**
  * Created by Administrator on 2017/8/6.
  */
object Test03 {
  def main(args: Array[String]): Unit = {
    show()
    print(add(4,6))
    print(sub(4,6))
  }
  def show()={
    print("showshowshowshowshow")
  }
  def add(a:Int,b:Int):Int={
    return a+b;
  }
  def sub(a:Int,b:Int):Int={
    return a-b;
  }
}
