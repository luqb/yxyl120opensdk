package com.github.yxyl120.sdk.Utils;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesUtil {
    private static final String CHARSET_NAME = "UTF-8";
    private static final String INSTANCE_NAME = "AES/CBC/PKCS5Padding";
    private static final String ENCRYPT_METHOD = "AES";

    public AesUtil() {
    }

    public static String decrypt(String str, String key, String ivStr) {
        try {
            if (str != null && str.trim().length() >= 1) {
                SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), ENCRYPT_METHOD);
                IvParameterSpec iv = new IvParameterSpec(ivStr.getBytes());
                Cipher cipher = Cipher.getInstance(INSTANCE_NAME);
                cipher.init(2, skeySpec, iv);
                byte[] encrypted = Hex.decodeHex(str.toCharArray());
                byte[] original = cipher.doFinal(encrypted);
                return new String(original, CHARSET_NAME);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String encrypt(String str, String key, String ivStr) {
        try {
            if (str != null && str.trim().length() >= 1) {
                SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), ENCRYPT_METHOD);
                IvParameterSpec iv = new IvParameterSpec(ivStr.getBytes());
                Cipher cipher = Cipher.getInstance(INSTANCE_NAME);
                cipher.init(1, skeySpec, iv);
                byte[] encrypted = str.getBytes(CHARSET_NAME);
                byte[] original = cipher.doFinal(encrypted);
                return Hex.encodeHexString(original);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

}
