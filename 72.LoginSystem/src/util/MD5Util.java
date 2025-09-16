package util;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(input.getBytes());
//			StringBuilder sb = new StringBuilder();
//			for (byte b : bytes)
//				sb.append(String.format("%02x", b));
			BigInteger no = new BigInteger(1, bytes);
			String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("MD5 error", e);
		}
	}
}
