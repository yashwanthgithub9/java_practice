package com.Identity_Service.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtService {

    //1. Get a jwt secret key from anywhere like https://jwtsecretkeygenerator.com/
    public final String SECRET="9kwLUVSTjZePj3aZerpX8kqhN5cCr3iBCeLPS7G3VUf";

    //2.Get decoded secretkey

    private SecretKey getSignKey(){  //Check this part of its Key or Keys or SecretKey

        byte[] key= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(key);

    }

    //3.JWT Builder

    private String createToken(Map<String, Object> claims, String username){

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username) // Write the message: "User is Yashwanth"
                .setIssuedAt(new Date(System.currentTimeMillis())) // Date stamp: "Jan 5, 2026"
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
                .signWith(getSignKey(), SignatureAlgorithm.HS256) // <--- THE WAX SEAL. Pressing the Royal Ring (Key) onto the data.
                .compact();// Fold it up into a String.
    }

    //4.Generate JWT

    public String generateToken(String name){
        Map<String,Object> claims = new HashMap<>();
        return createToken(claims,name);
    }

    //5.Validate JWT

    public void validateJwt(final String token){ //Void :If the token is VALID: The code runs efficiently, finishes the line, and does nothing. Silence = Success.
                                                //If the token is FAKE or EXPIRED: This line will crash and throw an Exception (like SignatureException or ExpiredJwtException).
                                                // This crash stops the request instantly, preventing the user from entering.
        Jwts.parserBuilder()//Start the verification machine
                .setSigningKey(getSignKey())//Load the official stamp
                .build()//Turn the machine on
                .parseClaimsJwt(token);//Scan this specific token now

    }





}
