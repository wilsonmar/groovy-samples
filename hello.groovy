// hello.groovy 
/* This program takes the basics and combines several fundamental constructs into one file.
      */
// in https://github.com/wilsonmar/groovy-samples
class Example {
   static void main(String[] args) {
      def beatles = ["John","Paul","Ringo","George"]
      for (int i=0; i < beatles.size; i++){
      	println "Hello, " + beatles[i]
      }

      /*def enum DAYS { SUN, MON, TUE, WED, THU, FRI, SAT }
      def weekdays = DAYS.MON..DAYS.FRI  // Two dots define a range.
      for (var in weekdays){ println var }
      */
      def range = 5..7; 
      println(range); 
      println(range.get(2)); 
      // Output: 5, 6, 7

      // log.info("Any Text message" + x)
      DisplayName();
      // println( sum(10,5) ); // output = 15
   }
   static def DisplayName() {
      def x = 42  // integer object
      float PI = 3.14159265359f  // floating point number
      BigDecimal bd = 3.5g;      // g comes after f, right?
      def s = """multi-line
      string"""

      System.out.println("Hello World " + new Date().toString());
      // println('Hello World',x.getClass());
      println("Hello, $s, $x");  // need double-quote
   } 
   static int sum(int a,int b) {
      int c = a+b;
      return c; // STYLE: avoid printing from inside a calculation function.
   }  
}
