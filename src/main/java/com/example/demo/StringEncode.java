package com.example.demo;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
public class StringEncode
{
public static void main(String[] args)
{
String string = "VELTECH HIGHTECH";
// Encoding
Encoder encoder = Base64.getEncoder();
byte[] data = string.getBytes(StandardCharsets.UTF_8);
String encodedString = encoder.encodeToString(data);
System.out.println("Given String to encode is " + string);
System.out.println("Encoded: " + encodedString);
// Decoding
Decoder decoder = Base64.getDecoder();
byte[] bytes = decoder.decode(encodedString);
String decodedString = new String(bytes, StandardCharsets.UTF_8);
System.out.println("Decoded: " + decodedString);
}
}