package com.company.lesson4;

class main {
    public static void main (String [] args){
        String str1= new String (  "Hot JAVaHello");
        String str2="65";
        System.out.println(String.valueOf(65));
        String str3=String.valueOf(65);
        System.out.println(str1.trim());
        System.out.println(str1.substring(2,8));
        String [] strings= str1.split( " JAVa");
        for (String element: strings){
            System.out.println(element);
        }
        System.out.println(str1.charAt(1));
        System.out.println(str1.codePointAt (1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.concat (str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65));
        System.out.println(str1.indexOf(73));
        System.out.println(str1.length());
    }

}

