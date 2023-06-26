import scala.io.StdIn
 object test{
    
    val x=List("visal","vishmitha","Alwis","hellow world");
    def checklist(x:List[String])={
        val i:Int =0;
        var len=x.length;
        for(i <- 0 to len-1){
            if(x(i).length>5){
                println(x(i));
            }
        }
    }

    def main(args:Array[String])={
        checklist(x);
        //println(x);
    }
    
 }