package prtsc;
class minor{
      final char gender='m';
     final void print(){
        // gender='f';                                      //in final we cannot change
        System.out.println("wonder ful of sports");
    }
}

class major extends minor{
    char gender='f';
    // void print(){
    //     System.out.println("God grace");
    // }
}

class mirror{
    public static void main(String[] args) {
        minor obj =new minor();
       System.out.println(obj.gender);

}
}
