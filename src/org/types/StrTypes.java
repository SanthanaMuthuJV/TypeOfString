package org.types;

public class StrTypes {
public static void main(String[] args) {
System.out.println("============Literal String===========");

String s1 = "java";
String s2 = "maven";
String s3 = "java";

int ms1 = System.identityHashCode(s1);
System.out.println("momery of java "+ ms1);

int ms2 = System.identityHashCode(s2);
System.out.println("memory of maven "+ ms2);

int ms3 = System.identityHashCode(s3);
System.out.println("memory of java "+ ms3);

System.out.println("===========Non-Literal  String==========");

String nls = new String("java");
String nls2 = new String ("maven");
String nls3 = new String ("java");

int mnls = System.identityHashCode(nls);
System.out.println("memory of java "+ mnls);

int mnls2 = System.identityHashCode(nls2);
System.out.println("memory of maven "+ mnls2);

int mnls3 = System.identityHashCode(nls3);
System.out.println("memory of java "+ mnls3);

System.out.println("============Immutable String===========");

String si = "java";
String si2 = "maven";

String mer = si.concat(si2);
System.out.println(mer);

int msi = System.identityHashCode(si);
System.out.println("memeory of java "+ msi);

int msi2 = System.identityHashCode(si2);
System.out.println("memory of maven "+ msi2);

int mmerg = System.identityHashCode(mer);
System.out.println("memory of javamaven "+ mmerg);

System.out.println("=============Mutable String===========");

StringBuilder mu = new StringBuilder("java");
StringBuilder mu2 = new StringBuilder("maven");

StringBuilder jo = mu.append(mu2);
System.out.println(jo);

int mmu = System.identityHashCode(mu);
System.out.println("memory of java "+ mmu);

int mmu2 = System.identityHashCode(mu2);
System.out.println("memory of maven "+ mmu2);

int mjo = System.identityHashCode(jo);
System.out.println("memory of java " + mjo);































































	
}
}
