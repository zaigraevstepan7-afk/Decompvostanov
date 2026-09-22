/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Pd;
import KDFzREm.Pk;
import KDFzREm.Pw;
import KDFzREm.RZ;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iC;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoSlow", y=UR.MOVEMENT, N=Uz.BASE)
public class Pl
extends UM {
    private static boolean[] u;
    private static byte[] i;
    private static short[] R;
    public Object[] L;
    private static String[] M;
    private static /* synthetic */ String ll0ipnOI;
    private static /* synthetic */ int[] llltm;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 27), 15) ^ 0xE2A3F17F, 10) ^ 0xD2B4C679, 25);
    }

    private static void P() {
        u = new boolean[]{true, false, false, true};
    }

    private static void T() {
        R = new short[]{0, 1, 0, 1, 2, 2, 2, 2};
    }

    public Pl() {
        Pl.lImiqjp("ppaanjaz", -169657906, -628917988, -628917987, -628917986, -169657906, -169657906, (Pl)this);
        Pk pk = new Pk(this, (String)((Object)Pl.lImiqjp("ikxvjxl", -169657910, -628917988, -628917998, -628917997, -169657910, -169657910)[0]), (boolean)Pl.lImiqjp("ikxvjxl", -169657910, -628917988, -628918004, -628918003, -169657910, -169657910)[0]);
        Pl.lImiqjp("grly", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this)[Pl.lImiqjp("eucxrk", -169657910, -628917988, -628917991, -628917990, -169657910, -169657910)[0]] = pk;
        Pw pw = new Pw(this, (String)((Object)Pl.lImiqjp("grly", -169657910, -628917988, -628917998, -628917997, -169657910, -169657910)[1]), (boolean)Pl.lImiqjp("ikxvjxl", -169657910, -628917988, -628918004, -628918003, -169657910, -169657910)[1]);
        Pl.lImiqjp("ikxvjxl", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this)[Pl.lImiqjp("ppaanjaz", -169657910, -628917988, -628917991, -628917990, -169657910, -169657910)[1]] = pw;
        lv[] lvArray = new Pd[Pl.lImiqjp("eucxrk", -169657910, -628917988, -628917996, -628917999, -169657910, -169657910)[0]];
        lvArray[Pl.lImiqjp("bcodiif", -169657910, -628917988, -628918004, -628918003, -169657910, -169657910)[2]] = (Pk)((Object)Pl.lImiqjp("raqthnf", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this)[Pl.lImiqjp("grly", -169657910, -628917988, -628917991, -628917990, -169657910, -169657910)[2]]);
        lvArray[Pl.lImiqjp("raqthnf", -169657910, -628917988, -628918004, -628918003, -169657910, -169657910)[3]] = (Pw)((Object)Pl.lImiqjp("nvistqhm", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this)[Pl.lImiqjp("bcodiif", -169657910, -628917988, -628917991, -628917990, -169657910, -169657910)[3]]);
        CallSite callSite = Pl.lImiqjp("axhup", -169657920, -628918002, -628918001, -628918008, -169657920, -169657920, (lY)this, (String)((Object)Pl.lImiqjp("bcodiif", -169657910, -628917988, -628917998, -628917997, -169657910, -169657910)[2]), (lv[])lvArray);
        Pl.lImiqjp("eucxrk", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this)[Pl.lImiqjp("ppaanjaz", -169657910, -628917988, -628917991, -628917990, -169657910, -169657910)[4]] = callSite;
    }

    static {
        Pl.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-114, 16, 55, 44, 80, -20, 7, -69, 50, 74, -79, 92, -118, 17, 1, 6};
        int n = 0;
        int n2 = 226;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 35;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        i = new byte[]{2, 3};
    }

    private static void s() {
        M = new String[]{"vanilla", "spooky-time-duels", "mode"};
    }

    private void m() {
        if (Pl.lImiqjp("eucxrk", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this) == null) {
            Pl.lImiqjp("grly", -169657907, -628917988, -628917985, -628917992, -169657907, -169657907, (Pl)this, (Object[])new Object[Pl.lImiqjp("axhup", -169657910, -628917988, -628917996, -628917999, -169657910, -169657910)[1]]);
            CallSite callSite = Pl.lImiqjp("ppaanjaz", -169657908, -628917988, -628917985, -628917992, -169657908, -169657908, (Pl)this);
        }
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 22), 18), 18) ^ 0x44146CE, 10), 15);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{41, 34, 116, -113, -78, -34, 74, 93, -127, -10, 107, 42, 36, -45, -112, 44};
        int n = 0;
        int n2 = 127;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 149;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-9, 32, 106, -9, 68, 28, -96, 127, 125, 116, -79, 66, -88, -77, 0, -42};
        int n = 0;
        int n2 = 49;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 155;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 14), 4), 5), 17) ^ 0xC367A830, 19);
    }

    @uF
    public void N(iC iC2) {
        Pl.lImiqjp("axhup", -169657906, -628917988, -628917987, -628917986, -1670421432, -2126561439, (Pl)this);
        Pl.lImiqjp("eucxrk", -169657906, -628917994, -628917993, -628918000, -1670421432, -2126561439, (Pd)((Pd)((Object)Pl.lImiqjp("axhup", -169657906, -628917989, -628917996, -628917995, -1670421432, -2126561439, (ld)((ld)((Object)Pl.lImiqjp("grly", -169657908, -628917988, -628917985, -628917992, -1731833622, -1178121204, (Pl)this)[Pl.lImiqjp("raqthnf", -169657910, -628917988, -628917991, -628917990, -1464497205, 371399573)[6]]))))), (Object)iC2);
    }

    @uF
    public void N(RZ rZ) {
        Pl.lImiqjp("raqthnf", -169657906, -628917988, -628917987, -628917986, -1670421432, -2126561439, (Pl)this);
        Pl.lImiqjp("axhup", -169657906, -628917994, -628917993, -628918000, -1670421432, -2126561439, (Pd)((Pd)((Object)Pl.lImiqjp("bcodiif", -169657906, -628917989, -628917996, -628917995, -1670421432, -2126561439, (ld)((ld)((Object)Pl.lImiqjp("ppaanjaz", -169657908, -628917988, -628917985, -628917992, -1561379461, -634053146, (Pl)this)[Pl.lImiqjp("grly", -169657910, -628917988, -628917991, -628917990, -861506410, -2108381857)[7]]))))), (Object)rZ);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(n, 18) ^ 0xCF80618A) + 1, 16), 25);
    }

    @uF
    public void N(Ry ry) {
        Pl.lImiqjp("nvistqhm", -169657906, -628917988, -628917987, -628917986, -1670421432, -2126561439, (Pl)this);
        Pl.lImiqjp("axhup", -169657906, -628917994, -628917993, -628918000, -1670421432, -2126561439, (Pd)((Pd)((Object)Pl.lImiqjp("raqthnf", -169657906, -628917989, -628917996, -628917995, -1670421432, -2126561439, (ld)((ld)((Object)Pl.lImiqjp("nvistqhm", -169657908, -628917988, -628917985, -628917992, 331648298, -461635720, (Pl)this)[Pl.lImiqjp("grly", -169657910, -628917988, -628917991, -628917990, -7754152, -434583674)[5]]))))), (Object)ry);
    }

    private static /* synthetic */ void ntfClinit() {
        ll0ipnOI = "\u00b7\u00f9\u00e5\u00f9\u0006{\u00d0\u00b1\u00bc\u00dc(\u0094\u00f5\u00e8D\u00e7r\u008b\u00f1\u00c9\u00e2\"_\u0092\u00f2\u00b1\u00d6 \u00ee=:\u00e2\u00f5\u00c0\u00c9\u0098\u00aa\u0002\u00a1\u0084\u00f9\u00e5\u00f9\u0006{\u00d0\u00b1\u0080\u00d4\u00a9\u0094\u00ef\u00e95H\u00dc\u00b1\u00bc\u00d9)\u00a6]\u0017\u00ea\u00b4\u00e4\u00de\u00d7\u00b8\u00baD\u008a\u00ee\u00e6\u00ff\u00ea]\u001c\u00f1\u00c9\u00e2\"_\u0092\u00f2\u00b1\u00d6 \u00ee=:\u00e2\u00f5$\u00c9\u0098\u00e4\u00f1\u00c9\u00e2\"_\u0092\u00f2\u00b1\u00d6 \u00ee!,\u00fa\u00db\u00d1\u00da\u0098K\u00f9\u00e5\u00f9\u0006{\u00d0\u00b1\u00bc\u00d3o\u00f1\u00e8\u00c7\u0012D\u00ef\u00db\u00bd\u0097+\u0098I\u0014\u00e2\u00f11\u00dc\u008c\u00ef5P\u00da\u00b1\u0083\u00cc5\u00a8\u001c?\u00b3\u00cb\u000b\u00f6\u00e7\u00c5.l\u00f8\u00f3\u00ff\u00d41\u00fa[\u0014\u00c3\u00d4\u0001\u00c7\u00f1\u00c69\u0011\u00d1\u00fa\u00ebw\u00f9\u00e5\u00f9\u0006{\u00d0\u00b1\u0080\u00dc_";
        llltm = new int[]{2555914, 0x100001, 655363, 4980737, 5046291, 4915201, 4653058, 10, 851969, 3211284, 11927562, 4587521, 0x110015, 4784130, 2490369, 6291475, 4521985, 917506, 7536650, 0xC00001, 8192057};
        Pl.T();
        Pl.b();
        Pl.P();
        Pl.s();
    }

    private static /* synthetic */ void OOqOips(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[21];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            int n = 0;
            while (n < string.length()) {
                int n2 = string.charAt(n) << 8 | string.charAt(n + 1);
                int n3 = string.charAt(n + 2) << 8 | string.charAt(n + 3);
                int n4 = n + 4;
                nArray[n2] = stringBuilder.length() << 16 | n3;
                stringBuilder.append(string, n4, n4 + n3);
                n = n4 + n3;
            }
        }
        ll0ipnOI = stringBuilder.toString();
        llltm = nArray;
    }

    private static /* synthetic */ String Iltnmp(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-53, 118, 104, 116, 39, 74, 74, -10, -9, 115, -116, 55, 26, -44, 4, -38};
        byte[] byArray3 = new byte[]{82, -1, 110, -59, -23, -4, -62, 51, 36, 71, 38, 14, 14, -67, 112, 59};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOrOIlrpr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = llltm[n2 ^ 0xDA83791C];
        int n10 = n9 >>> 16;
        String string2 = Pl.Iltnmp(ll0ipnOI.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xDA83791C);
        n9 = llltm[n3 ^ 0xDA83791C];
        int n11 = n9 >>> 16;
        String string3 = Pl.Iltnmp(ll0ipnOI.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xDA83791C);
        n9 = llltm[n4 ^ 0xDA83791C];
        int n12 = n9 >>> 16;
        String string4 = Pl.Iltnmp(ll0ipnOI.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xDA83791C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF5E33978) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite lImiqjp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llltm[n2 ^ 0xDA83791C];
        int n8 = n7 >>> 16;
        String string2 = Pl.Iltnmp(ll0ipnOI.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xDA83791C);
        n7 = llltm[n3 ^ 0xDA83791C];
        int n9 = n7 >>> 16;
        String string3 = Pl.Iltnmp(ll0ipnOI.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xDA83791C);
        n7 = llltm[n4 ^ 0xDA83791C];
        int n10 = n7 >>> 16;
        String string4 = Pl.Iltnmp(ll0ipnOI.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xDA83791C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF5E33978) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite Olmni(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = llltm[n2 ^ 0xDA83791C];
        int n10 = n9 >>> 16;
        String string2 = Pl.Iltnmp(ll0ipnOI.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xDA83791C);
        n9 = llltm[n3 ^ 0xDA83791C];
        int n11 = n9 >>> 16;
        String string3 = Pl.Iltnmp(ll0ipnOI.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xDA83791C);
        n9 = llltm[n4 ^ 0xDA83791C];
        int n12 = n9 >>> 16;
        String string4 = Pl.Iltnmp(ll0ipnOI.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xDA83791C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF5E33978) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }
}
