/**
  * Created by Administrator on 2017/8/7.
  */
object Test06 {

  def main(args: Array[String]): Unit = {
    println(a1)
    println(a2)
    println(a3("5","6"))
    var a4 = (v:Int)=>v+1;
    var a5 = (s:Int)=>{if(s>90){"优秀"} else{"不优秀"}}
    var a6 = (score:Int)=>"您输入的是:"+score;
    println(a6(89))
  }

  def a1 = 10;
  def a2 = "返回值";
  def a3(v1:String,v2:String)=v1+":"+v2;

}
