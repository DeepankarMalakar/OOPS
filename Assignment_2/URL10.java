// Q10. Extract Domain from URL 
// Problem Statement:  
// A digital marketing company wants to extract the domain name from a given URL. Write a Java program that:  
//  Accepts a URL.  
//  Extracts and displays only the domain name.  
// Example Input/Output:  
// Input:  
// Enter URL: https://www.google.com/search?q=java  
// Output:  
// Domain: google.com

import java.net.*;

class URLDomainExtractor {
    public String getDomain(String url) throws MalformedURLException {
        URL u = new URL(url);
        return u.getHost().replace("www.", "");
    }
}

class URL10 {
    public static void main(String[] args) throws MalformedURLException {
        URLDomainExtractor ude = new URLDomainExtractor();
        System.out.println("Domain: " + ude.getDomain("https://www.google.com"));
    }
}