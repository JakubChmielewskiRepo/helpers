package com.epam.prejap.ess.helpers;

import java.util.Objects;

/**
 * the Objects class is final and all of it's methods are static so it cannot be extended, and cannot be accessed from non-static context.
 *
 * public static boolean equals(Object a, Object b) {
 *         return (a == b) || (a != null && a.equals(b));
 *     }
 *
 * Objects.equals(o1,o2) if both objects are null, always returns true.
 * Objects.equals(o1,o2) if one of the objects is null, always returns false.
 * If both objects are not-null, then it invokes o1.equals(o2) method
 * There is no null pointer exception thrown, unlike in the basic String, or any Wrapper equals method s.equals(s2)-> throws NullPointerException
 * It works also for custom objects like Objects.equals(person,person2), but only if the whole objects are null.
 * However if the whole object is not-null, but one or more of the objects fields are null, the result of the operation will depend on o1.equals(o2) method, and it may still produce NPM
 *
 *
 *
 * public static int hashCode(Object o) {
 *         return o != null ? o.hashCode() : 0;
 *     }
 *
 * Objects.hashCode(s) prevents from producing NPM which default Object hashCode() does. Objects class implementation for null objects returns int 0 instead.
 */
public class Main {

    public static void main(String[] args) {

    Person person=null;
    Person person2=null;
    Person person3=new Person();
    Person person4=new Person("John","Smith");
    Person person5=new Person("John",null);
    String s=null;
    String s2=null;
    String s3="null";
    String s4="SomeText";
    String s5="SomeText";




        System.out.println(Objects.equals(s,s2));
        System.out.println(Objects.equals(s2,s3));
        System.out.println(Objects.equals(s4,s5));
        System.out.println(Objects.equals(person,person2));
        System.out.println(Objects.equals(person,person3));
       // System.out.println(Objects.equals(person5,person4)); throws NPM
        System.out.println(Objects.equals(person4,person5)); //does not throw NPM



        System.out.println(Objects.hashCode(s)); //does not throw NPM, instead returns 0
        System.out.println(Objects.hashCode(person2)); //does not throw NPM instead returns 0
        //System.out.println(s.hashCode()); throws NPM
        //System.out.println(person2.hashCode()); throws NPM
    }
}
