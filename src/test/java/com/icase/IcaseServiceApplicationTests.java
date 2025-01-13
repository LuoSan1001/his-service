package com.icase;

import com.icase.pojo.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class IcaseServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void genJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("account", "luosan");
        claims.put("userName", "洛三");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "hosanna")
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void parseJwt() {
        String jwt = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmFtZSI6Iua0m-S4iSIsImV4cCI6MTcxNzY0Nzc1NiwiYWNjb3VudCI6Imx1b3NhbiJ9.lNVP2X6ncwreeGJXC6ih95pedTNjpMLvIYo2u65Nr3E";

        Map<String, Object> claims = Jwts.parser()
                .setSigningKey("hosanna")
                .parseClaimsJws(jwt)
                .getBody();

        System.out.println(claims);
    }
}
