Class datatype{

//STATIC
static long e = 98765L,f = 338383L;
static float g = 34.2f, h = 4.3f;


//CREATING OBJECT
double i = 45.1111d, j = 20.2222d; 
int k = 22, l = 20; 


public static void main (String args[]){

//Object Creation
datatype data=new datatype();

//Inside Main Method
byte a = 29, b = 97;
short c = 2322 , d = 8762;
char letter = ‘a’;
String name = “Mithun Chakravarthi”;
boolean  v = true; 

//BYTE
System.out.println(“Value of byte is :”+(a+b));
System.out.println(“Value of byte is :”+(a-b));
System.out.println(“Value of byte is :”+(a*b));
System.out.println(“Value of byte is :”+(a/b));


//Short
System.out.println(“Value of short is :”+(c+d));
System.out.println(“Value of short is :”+(c-d));
System.out.println(“Value of short is :”+(c*d));
System.out.println(“Value of short is :”+(c/d));

//Long
System.out.println(“Value of long is :”+(e+f));
System.out.println(“Value of long is :”+(e-f));
System.out.println(“Value of long is :”+(e*f));
System.out.println(“Value of long is :”+(e/f));


//Float
System.out.println(“Value of float is :”+(g+h));
System.out.println(“Value of float is :”+(g-h));
System.out.println(“Value of float is :”+(g*h));
System.out.println(“Value of float is :”+(g/h));


//Double
System.out.println(“Value of double is :”+(data.i+data.j));
System.out.println(“Value of double is :”+(data.i-data.j));
System.out.println(“Value of double is :”+(data.i*data.j));
System.out.println(“Value of double is :”+(data.i/data.j));

//INT
System.out.println(“Value of int is :”+(data.k+data.l));
System.out.println(“Value of int is :”+(data.k-data.l));
System.out.println(“Value of int is :”+(data.k*data.l));
System.out.println(“Value of int is :”+(data.k/data.l));

//Char
System.out.println(“My name starts with letter :”+letter);


//String
System.out.println(“My name is :”+name);


//Boolean
System.out.println(“Ela is married”+v);
}
}