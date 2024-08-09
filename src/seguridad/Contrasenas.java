package seguridad;

import java.security.*;
import java.security.spec.*;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Contrasenas {
    public static String generarKey(String pass) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException {
        byte[] salt = FabricaToken.generarBytes();
        return generarKey(pass, salt);
    }

    public static String generarKey(String pass, byte[] salt) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException {
        KeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 100, 128);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        
        byte[] hash = skf.generateSecret(spec).getEncoded();

        /* un salt de 32 caracteres + un hash de 24 caracteres = 56 caracteres*/
        return Base64.getEncoder().encodeToString(salt) + Base64.getEncoder().encodeToString(hash);
    }

    public static String generarHash(String pass, byte[] salt) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException {
        KeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 100, 128);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        
        byte[] hash = skf.generateSecret(spec).getEncoded();

        return Base64.getEncoder().encodeToString(hash);
    }
}
