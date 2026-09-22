/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.RM;
import KDFzREm.RR;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.mF;
import KDFzREm.mp;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="ChatHelper", y=UR.MISC, N=Uz.HELPER)
public class ma
extends UM {
    private static byte[] u;
    private static boolean[] i;
    private static short[] R;
    public Object[] L;
    private static String[] M;
    private static /* synthetic */ String lOmImr;
    private static /* synthetic */ int[] lIIlkIsmI;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(-n, 26), 31), 7) ^ 0x664ACCDA, 14), 26);
    }

    private static void P() {
        i = new boolean[]{true, true, false};
    }

    private static void T() {
        u = new byte[]{2};
    }

    public ma() {
        ma.IIrmj("ldigri", 1245348492, -1988435504, -1988435503, -1988435502, 1245348492, 1245348492, 1245348492, (ma)this);
        mp mp2 = new mp(this, (String)((Object)ma.IIrmj("lolyml", 1245348488, -1988435504, -1988435491, -1988435490, 1245348488, 1245348488, 1245348488)[0]), (boolean)ma.IIrmj("drczk", 1245348488, -1988435504, -1988435496, -1988435489, 1245348488, 1245348488, 1245348488)[0]);
        ma.IIrmj("qevun", 1245348494, -1988435504, -1988435501, -1988435500, 1245348494, 1245348494, 1245348494, (ma)this)[ma.IIrmj("xlgttfme", 1245348488, -1988435504, -1988435499, -1988435498, 1245348488, 1245348488, 1245348488)[0]] = mp2;
        lv[] lvArray = new mF[ma.IIrmj("bbzet", 1245348488, -1988435504, -1988435496, -1988435489, 1245348488, 1245348488, 1245348488)[1]];
        lvArray[ma.IIrmj("drczk", 1245348488, -1988435504, -1988435496, -1988435489, 1245348488, 1245348488, 1245348488)[2]] = (mF)((Object)ma.IIrmj("qevun", 1245348494, -1988435504, -1988435501, -1988435500, 1245348494, 1245348494, 1245348494, (ma)this)[ma.IIrmj("bbzet", 1245348488, -1988435504, -1988435499, -1988435498, 1245348488, 1245348488, 1245348488)[1]]);
        CallSite callSite = ma.IIrmj("gaxr", 1245348482, -1988435520, -1988435519, -1988435518, 1245348482, 1245348482, 1245348482, (lY)this, (String)((Object)ma.IIrmj("rjqjvjur", 1245348488, -1988435504, -1988435491, -1988435490, 1245348488, 1245348488, 1245348488)[1]), (lv[])lvArray);
        ma.IIrmj("sfgjtstf", 1245348494, -1988435504, -1988435501, -1988435500, 1245348494, 1245348494, 1245348494, (ma)this)[ma.IIrmj("rrkknr", 1245348488, -1988435504, -1988435499, -1988435498, 1245348488, 1245348488, 1245348488)[2]] = callSite;
    }

    static {
        ma.ntfClinit();
    }

    private static void b() {
        M = new String[]{"better-commands", "chat-addons"};
    }

    private void s() {
        if (ma.IIrmj("rrkknr", 1245348494, -1988435504, -1988435501, -1988435500, 1245348494, 1245348494, 1245348494, (ma)this) == null) {
            ma.IIrmj("syxazhwu", 1245348495, -1988435504, -1988435501, -1988435500, 1245348495, 1245348495, 1245348495, (ma)this, (Object[])new Object[ma.IIrmj("lolyml", 1245348488, -1988435504, -1988435517, -1988435516, 1245348488, 1245348488, 1245348488)[0]]);
            CallSite callSite = ma.IIrmj("niea", 1245348494, -1988435504, -1988435501, -1988435500, 1245348494, 1245348494, 1245348494, (ma)this);
        }
    }

    private static void m() {
        R = new short[]{0, 0, 1, 1, 1, 1};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight((Integer.rotateLeft(Integer.rotateLeft(-n, 2), 9) ^ 0x11DCEB45) + 1, 18), 7);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-48, -65, -93, 72, 124, -70, -69, -100, 27, -110, 117, -121, 56, -4, 116, -109};
        int n = 0;
        int n2 = 181;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-105, 97, -88, 124, -113, 23, -125, 27, 98, 86, -16, -102, -17, -20, 61, 69};
        int n = 0;
        int n2 = 37;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 65;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(n ^ 0xAF4855B7, 25), 5) ^ 0xD8CDD579) + 1 ^ 0xCC52EE85;
    }

    @uF
    public void N(RR rR) {
        ma.IIrmj("ohujsrzk", 1245348492, -1988435504, -1988435503, -1988435502, 1282022091, 1643702884, 2012757054, (ma)this);
        ma.IIrmj("tqhme", 1245348483, -1988435494, -1988435493, -1988435492, 1282022091, 1643702884, 2012757054, (List)((List)((Object)ma.IIrmj("drczk", 1245348492, -1988435497, -1988435496, -1988435495, 1282022091, 1643702884, 2012757054, (lj)((lj)((Object)ma.IIrmj("qevun", 1245348494, -1988435504, -1988435501, -1988435500, 756959566, 620397217, -1102563177, (ma)this)[ma.IIrmj("pbbcaml", 1245348488, -1988435504, -1988435499, -1988435498, 1192948266, -968750562, 1008816264)[5]]))))), mF2 -> ma.IIrmj("pbbcaml", 1245348492, -1988435515, -1988435519, -1988435514, 1282022091, 1643702884, 2012757054, (mF)mF2, (Object)rR));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 28) ^ 0x450B7B5D, 13), 16), 12) ^ 0xCF30A20B;
    }

    @uF
    public void N(RM rM) {
        ma.IIrmj("qevun", 1245348492, -1988435504, -1988435503, -1988435502, 1282022091, 1643702884, 2012757054, (ma)this);
        ma.IIrmj("gaxr", 1245348483, -1988435494, -1988435493, -1988435492, 1282022091, 1643702884, 2012757054, (List)((List)((Object)ma.IIrmj("ohujsrzk", 1245348492, -1988435497, -1988435496, -1988435495, 1282022091, 1643702884, 2012757054, (lj)((lj)((Object)ma.IIrmj("xlgttfme", 1245348494, -1988435504, -1988435501, -1988435500, 1848456542, 1206952093, 295907455, (ma)this)[ma.IIrmj("ohujsrzk", 1245348488, -1988435504, -1988435499, -1988435498, -861632314, 1468592858, -2119746339)[4]]))))), mF2 -> ma.IIrmj("rrkknr", 1245348492, -1988435515, -1988435519, -1988435514, 1282022091, 1643702884, 2012757054, (mF)mF2, (Object)rM));
    }

    @uF
    public void N(Rs rs) {
        ma.IIrmj("rjqjvjur", 1245348492, -1988435504, -1988435503, -1988435502, 1282022091, 1643702884, 2012757054, (ma)this);
        ma.IIrmj("ldigri", 1245348483, -1988435494, -1988435493, -1988435492, 1282022091, 1643702884, 2012757054, (List)((List)((Object)ma.IIrmj("ohujsrzk", 1245348492, -1988435497, -1988435496, -1988435495, 1282022091, 1643702884, 2012757054, (lj)((lj)((Object)ma.IIrmj("xlgttfme", 1245348494, -1988435504, -1988435501, -1988435500, 1234958664, 831944401, 840662917, (ma)this)[ma.IIrmj("qevun", 1245348488, -1988435504, -1988435499, -1988435498, -1851754301, 1348316714, 858698581)[3]]))))), mF2 -> ma.IIrmj("sfgjtstf", 1245348492, -1988435515, -1988435519, -1988435514, 1282022091, 1643702884, 2012757054, (mF)mF2, (Object)rs));
    }

    private static /* synthetic */ void ntfClinit() {
        lOmImr = "\u00cau\u00e4\u00edmo\u00b9\u00ad\u0095\u0017+\u0018\u00ee\u00fd^\\\u00b5\u00ad\u0095\u001dL\u00a8G}\u00e0\u0096fR\u00d6\u00acnk\u00a7\u00cau\u00e4\u00edmo\u00b9\u00ad\u0094\u001d\u00aes$\u0005<Ku\u00e4\u00edmo\u00b9\u00ad\u0095\u0016\u00e4}\u00c8\u00f6IK\u00fb\u00f7\u008d\u0015N\u00e0\u000eG\u00ec\u001f\u00b8X\u00cd\u00f9\u0010i\u00bb\u00ec\u008a\tO\u00aa\u001a\t\u00ab*\u00bb=u\u00e4\u00edmo\u00b9\u00ad\u0094:\u0004^\u00d0\u00d2^I\u00bc\u00c6}\u00c8\u00f6IK\u00fb\u00ee\u0098\u0012E\u00e0'P\u00e8\u00bb\u008dE\u0099\u00bei\u00adc\u00f7\u0018\u00f4\u00adP\u00d4\u00f6\u0010_\u00a0\u00eb\u0095Sn\u00a6\u001bF\u00f7}\u00e9\u00d3yP\u0086\u00c7\u0094SN\u0096S~\u00e8h\u00a9P\u008d\u00fb^D\u00b3\u00ad\u00aa\bP\u00a6\u0006U\u00b9R\u0093z\u00e6\u00d1Ex\u0091\u00ef\u00d6\u0010T\u00f4A~\u00c9M\u0099K\u00f0\u00d2R\u0005\u00b8\u00e8\u00c2\u00b5b\u00f3}\u00c8\u00f6IK\u00fb\u00ee\u0098\u0012E\u00e0;F\u00f0\u00b7\u00c6V\u0099\u00ae}\u00c8\u00f6IK\u00fb\u00ee\u0098\u0012E\u00e0'P\u00e8\u0019\u0096E\u0099";
        lIIlkIsmI = new int[]{2162698, 0x200001, 0x830003, 3014657, 14811155, 2949121, 13434882, 0x30000A, 8519681, 655380, 8781838, 6619143, 3801120, 5898241, 13565971, 1966082, 10, 0x810001, 9699385, 3080193, 0x2B0002, 5963786, 7077909};
        ma.m();
        ma.T();
        ma.P();
        ma.b();
    }

    private static /* synthetic */ String lImqI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{91, -75, 45, -82, 18, -124, -113, -38, 110, -13, -83, -105, 57, -100, 88, 81};
        byte[] byArray3 = new byte[]{119, -16, 68, 81, 102, -44, 26, -5, 79, 125, 112, -9, 23, -44, 3, 119};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lIkIIOj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIIlkIsmI[n2 ^ 0x897AE1D0];
        int n9 = n8 >>> 16;
        String string2 = ma.lImqI(lOmImr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x897AE1D0);
        n8 = lIIlkIsmI[n3 ^ 0x897AE1D0];
        int n10 = n8 >>> 16;
        String string3 = ma.lImqI(lOmImr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x897AE1D0);
        n8 = lIIlkIsmI[n4 ^ 0x897AE1D0];
        int n11 = n8 >>> 16;
        String string4 = ma.lImqI(lOmImr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x897AE1D0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4A3A823A) + -178;
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

    private static /* synthetic */ void Oljmjjl(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[23];
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
        lOmImr = stringBuilder.toString();
        lIIlkIsmI = nArray;
    }

    private static /* synthetic */ CallSite IIrmj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIIlkIsmI[n2 ^ 0x897AE1D0];
        int n9 = n8 >>> 16;
        String string2 = ma.lImqI(lOmImr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x897AE1D0);
        n8 = lIIlkIsmI[n3 ^ 0x897AE1D0];
        int n10 = n8 >>> 16;
        String string3 = ma.lImqI(lOmImr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x897AE1D0);
        n8 = lIIlkIsmI[n4 ^ 0x897AE1D0];
        int n11 = n8 >>> 16;
        String string4 = ma.lImqI(lOmImr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x897AE1D0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4A3A823A) + -178;
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
