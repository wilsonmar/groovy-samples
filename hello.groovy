// hello.groovy 
/* This program shows how to display 
      hello world to console. */
// in https://github.com/wilsonmar/groovy-samples"""
class Example {
   static void main(String[] args) {
      def s = """multi-line
      string"""
      def x = 42  // object
      System.out.println("Hello World " + new Date().toString());
      // println('Hello World',x.getClass());
      println("Hello, $s, $x");  // need double-quote
   }
}
