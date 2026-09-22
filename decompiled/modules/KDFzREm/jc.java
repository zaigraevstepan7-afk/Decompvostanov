/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Rs;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iR;
import KDFzREm.iz;
import KDFzREm.jX;
import KDFzREm.ja;
import KDFzREm.jp;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.ue;
import KDFzREm.wS;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="Notifications", y=UR.VISUAL, N=Uz.INTERFACE)
public class jc
extends UM {
    public Object[] L;
    private static String[] u;
    private static short[] i;
    private static byte[] R;
    private static short[] M;
    private static boolean[] B;
    private static /* synthetic */ String OOilItt;
    private static /* synthetic */ int[] Ilinq;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft((-n ^ 0xBD88C9C3) + 1, 25), 30) ^ 0x74754526;
    }

    private static void P() {
        i = new short[]{0, 1, 2, 0, 1};
        M = new short[]{2, 3, 2, 3, 3, 3, 3};
    }

    private static void T() {
        R = new byte[]{3, 2, 4};
    }

    public jc() {
        jc.lllirrrs("hqulh", 965871263, -596301112, -596301107, -596301106, 965871263, 965871263, (jc)this);
        jp jp2 = new jp(this, (String)((Object)jc.lllirrrs("rmsomwqy", 965871259, -596301112, -596301105, -596301120, 965871259, 965871259)[0]), (boolean)jc.lllirrrs("nhlqozk", 965871259, -596301112, -596301119, -596301118, 965871259, 965871259)[0]);
        jc.lllirrrs("hgmuojwb", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("rmsomwqy", 965871259, -596301112, -596301117, -596301116, 965871259, 965871259)[0]] = jp2;
        jX jX2 = new jX(this, (String)((Object)jc.lllirrrs("rjkhwp", 965871259, -596301112, -596301105, -596301120, 965871259, 965871259)[1]), (boolean)jc.lllirrrs("vybnaq", 965871259, -596301112, -596301119, -596301118, 965871259, 965871259)[1]);
        jc.lllirrrs("nhlqozk", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("zcecbtgt", 965871259, -596301112, -596301117, -596301116, 965871259, 965871259)[1]] = jX2;
        ja ja2 = new ja(this, (String)((Object)jc.lllirrrs("gfctgg", 965871259, -596301112, -596301105, -596301120, 965871259, 965871259)[2]), (boolean)jc.lllirrrs("vybnaq", 965871259, -596301112, -596301119, -596301118, 965871259, 965871259)[2]);
        jc.lllirrrs("droiapak", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("rjkhwp", 965871259, -596301112, -596301117, -596301116, 965871259, 965871259)[2]] = ja2;
        lv[] lvArray = new ue[jc.lllirrrs("rmsomwqy", 965871259, -596301112, -596301109, -596301108, 965871259, 965871259)[0]];
        lvArray[jc.lllirrrs("hqulh", 965871259, -596301112, -596301119, -596301118, 965871259, 965871259)[3]] = (ue)((Object)jc.lllirrrs("gbvpm", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("tfxvzw", 965871259, -596301112, -596301117, -596301116, 965871259, 965871259)[3]]);
        lvArray[jc.lllirrrs("gfctgg", 965871259, -596301112, -596301119, -596301118, 965871259, 965871259)[4]] = (ue)((Object)jc.lllirrrs("rjkhwp", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("ypbf", 965871259, -596301112, -596301117, -596301116, 965871259, 965871259)[4]]);
        lvArray[jc.lllirrrs("rjkhwp", 965871259, -596301112, -596301109, -596301108, 965871259, 965871259)[1]] = (ue)((Object)jc.lllirrrs("ypbf", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("srynn", 965871259, -596301112, -596301115, -596301116, 965871259, 965871259)[0]]);
        CallSite callSite = jc.lllirrrs("srynn", 965871249, -596301114, -596301113, -596301096, 965871249, 965871249, (lY)this, (String)((Object)jc.lllirrrs("zcecbtgt", 965871259, -596301112, -596301105, -596301120, 965871259, 965871259)[3]), (lv[])lvArray);
        jc.lllirrrs("zcecbtgt", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("rexzqo", 965871259, -596301112, -596301115, -596301116, 965871259, 965871259)[1]] = callSite;
    }

    static {
        jc.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-55, -102, 35, -27, -67, -28, -126, -23, 49, 35, 40, 64, -75, 101, 4, 99};
        int n = 0;
        int n2 = 95;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 187;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        u = new String[]{"module-toggle", "armor-durability", "irc-ping", "notifications"};
    }

    private void s() {
        if (jc.lllirrrs("vybnaq", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this) == null) {
            jc.lllirrrs("rexzqo", 965871260, -596301112, -596301111, -596301110, 965871260, 965871260, (jc)this, (Object[])new Object[jc.lllirrrs("rjkhwp", 965871259, -596301112, -596301109, -596301108, 965871259, 965871259)[2]]);
            CallSite callSite = jc.lllirrrs("ypbf", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this);
        }
    }

    private static void m() {
        B = new boolean[]{true, false, false, false, true};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(((n ^ 0xAAF934AC) + 1 ^ 0x7B527887) + 1, 18) ^ 0xAE53F23C, 10) ^ 0x987ACCE2;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-112, 116, 3, -124, 24, 97, 79, 105, 92, 24, -88, -50, 76, -87, -88, 8};
        int n = 0;
        int n2 = 92;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{40, -27, -91, 28, -5, -102, -103, 14, 59, 105, 83, -121, -44, -125, -111, -44};
        int n = 0;
        int n2 = 203;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 185;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight((Integer.rotateRight(n, 6) ^ 0x3DF71DE2) + 1, 22) ^ 0x37822038, 23);
    }

    @uF
    public void N(Ry ry) {
        jc.lllirrrs("gbvpm", 965871263, -596301112, -596301107, -596301106, -1955965696, 1472652615, (jc)this);
        jc.lllirrrs("ypbf", 965871248, -596301093, -596301092, -596301091, -1955965696, 1472652615, (List)((List)((Object)jc.lllirrrs("tfxvzw", 965871263, -596301095, -596301117, -596301094, -1955965696, 1472652615, (lj)((lj)((Object)jc.lllirrrs("nhlqozk", 965871261, -596301112, -596301111, -596301110, 1036727849, -1530523613, (jc)this)[jc.lllirrrs("zcecbtgt", 965871259, -596301112, -596301115, -596301116, 1362532389, 339628940)[5]]))))), ue2 -> jc.lllirrrs("srynn", 965871263, -596301090, -596301113, -596301089, -1955965696, 1472652615, (ue)ue2, (Object)ry));
    }

    @uF
    public void N(iR iR2) {
        jc.lllirrrs("tfxvzw", 965871263, -596301112, -596301107, -596301106, -1955965696, 1472652615, (jc)this);
        if (jc.lllirrrs("srynn", 965871263, -596301104, -596301103, -596301102, -1955965696, 1472652615, (iR)iR2) != (wS)((Object)jc.lllirrrs("nakb", 965871259, -596301101, -596301100, -596301110, 1329335719, -1686862930)[jc.lllirrrs("tfxvzw", 965871259, -596301112, -596301115, -596301116, -1361061923, -136779358)[2]])) {
            return;
        }
        jc.lllirrrs("droiapak", 965871248, -596301093, -596301092, -596301091, -1955965696, 1472652615, (List)((List)((Object)jc.lllirrrs("droiapak", 965871263, -596301095, -596301117, -596301094, -1955965696, 1472652615, (lj)((lj)((Object)jc.lllirrrs("tfxvzw", 965871261, -596301112, -596301111, -596301110, -913999023, 2073416732, (jc)this)[jc.lllirrrs("srynn", 965871259, -596301112, -596301115, -596301116, -1642144747, -127386038)[3]]))))), ue2 -> jc.lllirrrs("hgmuojwb", 965871263, -596301090, -596301113, -596301089, -1955965696, 1472652615, (ue)ue2, (Object)iR2));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n, 27), 30), 15), 14) ^ 0xB6E902, 30);
    }

    @uF
    public void N(Rs rs) {
        jc.lllirrrs("zrqcp", 965871263, -596301112, -596301107, -596301106, -1955965696, 1472652615, (jc)this);
        jc.lllirrrs("rjkhwp", 965871248, -596301093, -596301092, -596301091, -1955965696, 1472652615, (List)((List)((Object)jc.lllirrrs("tfxvzw", 965871263, -596301095, -596301117, -596301094, -1955965696, 1472652615, (lj)((lj)((Object)jc.lllirrrs("gbvpm", 965871261, -596301112, -596301111, -596301110, 308725040, 1035853986, (jc)this)[jc.lllirrrs("gfctgg", 965871259, -596301112, -596301115, -596301116, 774525613, -1804696836)[4]]))))), ue2 -> jc.lllirrrs("ypbf", 965871263, -596301090, -596301113, -596301089, -1955965696, 1472652615, (ue)ue2, (Object)rs));
    }

    @uF
    public void N(iz iz2) {
        jc.lllirrrs("hqulh", 965871263, -596301112, -596301107, -596301106, 965871263, 965871263, (jc)this);
        jc.lllirrrs("droiapak", 965871248, -596301093, -596301092, -596301091, 965871248, 965871248, (List)((List)((Object)jc.lllirrrs("zcecbtgt", 965871263, -596301095, -596301117, -596301094, 965871263, 965871263, (lj)((lj)((Object)jc.lllirrrs("rjkhwp", 965871261, -596301112, -596301111, -596301110, 965871261, 965871261, (jc)this)[jc.lllirrrs("hqulh", 965871259, -596301112, -596301115, -596301116, 965871259, 965871259)[6]]))))), ue2 -> jc.lllirrrs("hqulh", 965871263, -596301090, -596301113, -596301089, 965871263, 965871263, (ue)ue2, (Object)iz2));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{93, 25, -16, -59, 6, -92, -117, -113, -106, 63, -116, 83, 107, -81, -64, 73};
        int n = 0;
        int n2 = 185;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        OOilItt = "B\u00b3\u00e6\u00e6F\rM\u009f\u008a\u00b4'\u001b\u000f\u008bL\u001d~\u00ac\u0086\u00b4>\u001f\u0094K\u0082#\u00a0\u0017B\u00c1tL\u00f2\u00eeK3Y\u00a0\u00b5\u00de?Q\u0096u\u0096 \u00a8\u0087\u00ac\u00c3/\u001b~\u00b4\u0080\u00b4\u0001\n\u0088E\u00c3\u000b\u00f9\u00bd\u0096\u00e9D1e\u0088\u00a2\u00f6}\u0012\u008c\u0017\u0084 \u0089\u00a2\u009c\u00d8R2r\u00f5\u008b\u00f1i\u0095s|\u00eej\u0016i\u00bb\u00c8\u00f73\u0010\u009d\u0003\u00e2\u000e\u00a8\u0018D\u00d6;#\u00f1\u0001\u00f8\u0085\u008bV\u0091\u00e6F\rM\u009f\u008a\u00b48\u001d\u00eab\u00eej\u0016i\u00bb\u00c8\u00f73\u0010\u009d\u0003\u00e2\u000e\u00a8\u00ef)\u00d6;^I\u008c\u00e6F\rM\u009f\u008a\u00b4%-DN\u000b\u00d6a\u0003v\u00b9\u00a1\u00f27\u0012\u009e_\u00f2\\\u00a7\u00c5N\u00932\u0016-\u00be\u0084\u00ab`H\u00c9M\u009fY\u00fa\u00c4N\u0094eO{\u00ef\u00d6\u00abjM\u00ceM\u00cc\n\u008a\u00e6F\rM\u009f\u008a\u00b4;,\u00e7\u00cdr2~\u00b9\u008fr\u008bL<[\u009c\u009d\u00c9\u0017\u0013\u00d5[\u00feW?\u00b4\u00e6F\rM\u009f\u008a\u00b4>\u0014\u009a\u00eej\u0016i\u00bb\u00c8\u00f73\u0010\u009d\u0003\u00fe\u0018\u00b0\u0094\u00af\u00c5;(\u00eej\u0016i\u00bb\u00c8\u00ee&\u0017\u0096\u0003\u00cb\u0019\u00ac<t\u00cbo\u00190\u0099\u0088\u00f5!\u000b\u0097I\u00dfW\u00eb\t\u00ae\u00da\u00e0\u00d2\u00c3v\u00160\u00af\u0093\u00f2>Q\u00b6E\u00de\u0018\u00e6\u00e6F\rM\u009f\u008a\u00b4>\u0015";
        Ilinq = new int[]{7667722, 65537, 5963795, 8323073, 19726338, 5898241, 7471107, 0xEE0001, 16318483, 1, 0x700002, 19660801, 7208962, 5832705, 20774922, 10420225, 2097209, 15663114, 786452, 19857422, 14221319, 17563680, 131082, 8388629, 13565962, 0xA00001, 0xE0000E, 9764874, 10551342};
        jc.P();
        jc.T();
        jc.m();
        jc.b();
    }

    private static /* synthetic */ void OOj0O(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[29];
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
        OOilItt = stringBuilder.toString();
        Ilinq = nArray;
    }

    private static /* synthetic */ CallSite lllirrrs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ilinq[n2 ^ 0xDC752AC8];
        int n8 = n7 >>> 16;
        String string2 = jc.llssjj(OOilItt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xDC752AC8);
        n7 = Ilinq[n3 ^ 0xDC752AC8];
        int n9 = n7 >>> 16;
        String string3 = jc.llssjj(OOilItt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xDC752AC8);
        n7 = Ilinq[n4 ^ 0xDC752AC8];
        int n10 = n7 >>> 16;
        String string4 = jc.llssjj(OOilItt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xDC752AC8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x39920629) + -178;
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

    private static /* synthetic */ CallSite Ilm0tm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ilinq[n2 ^ 0xDC752AC8];
        int n9 = n8 >>> 16;
        String string2 = jc.llssjj(OOilItt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xDC752AC8);
        n8 = Ilinq[n3 ^ 0xDC752AC8];
        int n10 = n8 >>> 16;
        String string3 = jc.llssjj(OOilItt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xDC752AC8);
        n8 = Ilinq[n4 ^ 0xDC752AC8];
        int n11 = n8 >>> 16;
        String string4 = jc.llssjj(OOilItt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xDC752AC8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x39920629) + -178;
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

    private static /* synthetic */ String llssjj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{58, 66, -126, -105, -30, -32, 112, 96, -59, -69, -3, -105, 58, -5, 7, 29};
        byte[] byArray3 = new byte[]{25, -4, 120, 12, 106, -101, 35, 34, 117, 63, 116, 96, 75, -116, 74, -58};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IIOqO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ilinq[n2 ^ 0xDC752AC8];
        int n8 = n7 >>> 16;
        String string2 = jc.llssjj(OOilItt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xDC752AC8);
        n7 = Ilinq[n3 ^ 0xDC752AC8];
        int n9 = n7 >>> 16;
        String string3 = jc.llssjj(OOilItt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xDC752AC8);
        n7 = Ilinq[n4 ^ 0xDC752AC8];
        int n10 = n7 >>> 16;
        String string4 = jc.llssjj(OOilItt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xDC752AC8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x39920629) + -178;
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
