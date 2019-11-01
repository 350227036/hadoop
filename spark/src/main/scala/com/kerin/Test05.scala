/**
  * Created by Administrator on 2017/8/7.
  */
object Test05 {

  def main(args: Array[String]): Unit = {
    print(apply(show,20))
  }

  def apply(f:Int=>String,v:Int)=f(v)

  def show[A](x:A)="["+x.toString()+"]"

}
