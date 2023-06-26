object test{
    def  avg(num1:Int ,num2:Int):Double={
        (num1.toDouble+num2.toDouble)/2;
    }
    def round(y:Double)={
        val rounded = f"%%.2f".format(y).toDouble;
        rounded;
    }
    def main(args:Array[String])={
        var num:Double=11.8;
        println(avg(1232,5655659));
        println(round(avg(1232,5655659)));
        
    }
}