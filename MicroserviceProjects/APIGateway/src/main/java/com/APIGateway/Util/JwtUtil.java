package com.APIGateway.Util;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class JwtUtil {

    private static final String SECRET="9kwLUVSTjZePj3aZerpX8kqhN5cCr3iBCeLPS7G3VUf";// ⚠️ MUST MATCH IDENTITY SERVICE!

    public void validateToken(final String token) {
        Jwts.parserBuilder()
                .setSigningKey(geSignKey())
                .build()
                .parseClaimsJws(token);
    }

    public SecretKey geSignKey(){
        byte[] keys= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keys);
    }
}

