package seguridad;

import java.security.*;
import java.security.spec.*;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Contrasenas {
    static String generarHash(String pass) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException {
        byte[] salt = FabricaToken.generarBytes();
        KeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 100, 128);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        
        byte[] hash = skf.generateSecret(spec).getEncoded();

        /* Genera un hash de 24 caracteres */
        return Base64.getEncoder().encodeToString(hash); 
    }

    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 10; i++){
                System.out.println(i +  ": " + generarHash("holaaaa"));
            }
            System.out.println();
        } catch (Exception e){
            System.out.println("error " + e.getMessage());
        }
    }
}
