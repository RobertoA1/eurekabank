package seguridad;

import java.security.SecureRandom;
import java.util.Base64;

public class FabricaToken {
    static String generarToken() throws IllegalStateException, IllegalArgumentException{
        String token = null;
        token = Base64.getEncoder().encodeToString(generarBytes());
        return token;
    }

    static byte[] generarBytes(){
        SecureRandom sr = new SecureRandom();
        byte bytes[] = new byte[24];
        sr.nextBytes(bytes);
        return bytes;
    }
}