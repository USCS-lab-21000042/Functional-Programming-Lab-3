import scala.io.StdIn

object test{
    
    
    def pr(st:String):Unit={
        
        if(st.length>0){
            println(st(st.length-1));
            
            pr(st.slice(0, st.length - 1));
        }
    }
     
    def main(args:Array[String])={
        var st1:String =StdIn.readLine()
        pr(st1);
    }
    
}