import scala.io.StdIn

object test{
    
    def input(st:String =StdIn.readLine())={
        var lenth:Int =st.length;
        def print(lenth)={
            println(st[lenth-1]);
            lenth-=1;
            if(lenth>0){
                print(lenth);
            }
        }
    }  
    def main(args:Array[String])={
        input();
    }
}