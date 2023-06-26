object test{
    def  avg(num1:Int ,num2:Int):Double={
        (num1.toDouble+num2.toDouble)/2;
    }
    def round(y:Double)={
        val rounded = f"%%.2f".format(y).toDouble;
        rounded;
    }
    def main(args:Array[String])={
       //println( round(avg(234,233)));
        println((avg(111191,233)));
    }
}