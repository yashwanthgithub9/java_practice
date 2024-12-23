/*
 * package com.Spring.SpringSecurity.Service;
 * 
 * import java.security.Key; import java.security.NoSuchAlgorithmException;
 * import java.util.Base64; import java.util.Date; import java.util.HashMap;
 * import java.util.Map;
 * 
 * import javax.crypto.KeyGenerator; import javax.crypto.SecretKey; import
 * javax.management.RuntimeErrorException;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import io.jsonwebtoken.Jwts; import io.jsonwebtoken.io.Decoders; import
 * io.jsonwebtoken.security.Keys;
 * 
 * @Service public class JWTService {
 * 
 * private String secretkey="";
 * 
 * 
 * public JWTService() { try { KeyGenerator generator =
 * KeyGenerator.getInstance("HmacSHA256"); SecretKey key =
 * generator.generateKey(); secretkey =
 * Base64.getEncoder().encodeToString(key.getEncoded()); } catch
 * (NoSuchAlgorithmException e) { // TODO Auto-generated catch block //
 * e.printStackTrace(); throw new RuntimeException(e); } }
 * 
 * public String generateToken(String username) { // TODO Auto-generated method
 * stub Map<String, Object> claimsMap = new HashMap<>();
 * 
 * return Jwts.builder() .claims() .add(claimsMap) .subject(username)
 * .issuedAt(new Date(System.currentTimeMillis())) .expiration(new
 * Date(System.currentTimeMillis()+60*60*10)) .and() .signWith(getKey())
 * .compact();
 * 
 * 
 * 
 * 
 * 
 * // return
 * "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6Inlhc2giLCJpYXQiOjE1MTYxNDM0NTEzfQ.eGI-j7mQM8KiIour2_yPYe_IuCXHk22LmzS2AS1PGw4";
 * }
 * 
 * private Key getKey() { // TODO Auto-generated method stub try { KeyGenerator
 * generator = KeyGenerator.getInstance("HmacSHA256"); SecretKey key =
 * generator.generateKey(); secretkey =
 * Base64.getEncoder().encodeToString(key.getEncoded()); } catch
 * (NoSuchAlgorithmException e) { // TODO Auto-generated catch block //
 * e.printStackTrace(); throw new RuntimeException(e); }
 * 
 * byte [] bs=Decoders.BASE64.decode(secretkey);
 * 
 * return Keys.hmacShaKeyFor(bs); }
 * 
 * }
 */

package com.Spring.SpringSecurity.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWTService {


    private String secretkey = "";

    public JWTService() {

        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            SecretKey sk = keyGen.generateKey();
            secretkey = Base64.getEncoder().encodeToString(sk.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 60 * 60 * 30))
                .and()
                .signWith(getKey())
                .compact();

    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretkey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}