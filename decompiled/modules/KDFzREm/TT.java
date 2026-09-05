/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.ME;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Gamma", y=UR.VISUAL, N=Uz.WORLD)
public class TT
extends UM {
    private static String[] u;
    private static short[] i;
    private static float[] R;
    public Object[] L;
    private static boolean[] M;
    private static /* synthetic */ String lltrnjkrO;
    private static /* synthetic */ int[] l1p0pIr;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateRight(-n ^ 0x522F3B3B, 5), 9) ^ 0xFE282D68;
    }

    private static void P() {
        i = new short[]{0, 0};
    }

    private static void T() {
        M = new boolean[]{true};
    }

    public TT() {
        TT.Iliknrkm("rgvjtxnq", 1192876821, 403633365, 403633364, 403633367, 1192876821, 1192876821, (TT)this);
        CallSite callSite = TT.Iliknrkm("rgvjtxnq", 1192876827, 403633362, 403633373, 403633372, 1192876827, 1192876827, (lY)this, (String)((Object)TT.Iliknrkm("ocur", 1192876817, 403633365, 403633366, 403633361, 1192876817, 1192876817)[0]), (float)TT.Iliknrkm("stlmzdea", 1192876817, 403633365, 403633360, 403633363, 1192876817, 1192876817)[0], (float)TT.Iliknrkm("wpcg", 1192876817, 403633365, 403633360, 403633363, 1192876817, 1192876817)[1], (float)TT.Iliknrkm("eecz", 1192876817, 403633365, 403633360, 403633363, 1192876817, 1192876817)[2], (float)TT.Iliknrkm("eecz", 1192876817, 403633365, 403633360, 403633363, 1192876817, 1192876817)[3]);
        TT.Iliknrkm("enfn", 1192876823, 403633365, 403633375, 403633374, 1192876823, 1192876823, (TT)this)[TT.Iliknrkm("enfn", 1192876817, 403633365, 403633369, 403633368, 1192876817, 1192876817)[0]] = callSite;
    }

    static {
        TT.ntfClinit();
    }

    private static void b() {
        R = new float[]{5.0f, 1.0f, 10.0f, 0.1f, 10.0f};
    }

    private void s() {
        if (TT.Iliknrkm("wpcg", 1192876823, 403633365, 403633375, 403633374, 1192876823, 1192876823, (TT)this) == null) {
            TT.Iliknrkm("wpcg", 1192876822, 403633365, 403633375, 403633374, 1192876822, 1192876822, (TT)this, (Object[])new Object[TT.Iliknrkm("ocur", 1192876817, 403633365, 403633371, 403633370, 1192876817, 1192876817)[0]]);
            CallSite callSite = TT.Iliknrkm("enfn", 1192876823, 403633365, 403633375, 403633374, 1192876823, 1192876823, (TT)this);
        }
    }

    private static void m() {
        u = new String[]{"gamma"};
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(n, 17) ^ 0x2708BE92, 1) ^ 0x36CA4C7D, 22), 24);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-125, -17, 25, -111, -13, -126, 0, 3, -18, -121, -4, -20, -48, -124, 107, -84};
        int n = 0;
        int n2 = 172;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 55;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(n ^ 0xB18DDBF2, 18) ^ 0x4D778B98, 3);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 19), 12), 24), 4), 19), 8);
    }

    @uF
    public void N(ME mE) {
        TT.Iliknrkm("wpus", 1192876821, 403633365, 403633364, 403633367, -1495473902, -2145399363, (TT)this);
        TT.Iliknrkm("eexk", 1192876821, 403633344, 403633347, 403633346, -1495473902, -2145399363, (ME)mE, (float)(TT.Iliknrkm("rgvjtxnq", 1192876821, 403633351, 403633350, 403633345, -1495473902, -2145399363, (Float)((Float)((Object)TT.Iliknrkm("wpcg", 1192876821, 403633349, 403633369, 403633348, -1495473902, -2145399363, (lQ)((lQ)((Object)TT.Iliknrkm("eecz", 1192876823, 403633365, 403633375, 403633374, -31249821, -683539826, (TT)this)[TT.Iliknrkm("sand", 1192876817, 403633365, 403633369, 403633368, -289925727, -211227286)[1]])))))) / TT.Iliknrkm("sand", 1192876817, 403633365, 403633360, 403633363, -1229686309, -1825965054)[4]));
    }

    private static /* synthetic */ void ooiOq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[24];
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
        lltrnjkrO = stringBuilder.toString();
        l1p0pIr = nArray;
    }

    private static /* synthetic */ CallSite Iliknrkm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1p0pIr[n2 ^ 0x180EF4D5];
        int n8 = n7 >>> 16;
        String string2 = TT.l10OjIl(lltrnjkrO.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x180EF4D5);
        n7 = l1p0pIr[n3 ^ 0x180EF4D5];
        int n9 = n7 >>> 16;
        String string3 = TT.l10OjIl(lltrnjkrO.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x180EF4D5);
        n7 = l1p0pIr[n4 ^ 0x180EF4D5];
        int n10 = n7 >>> 16;
        String string4 = TT.l10OjIl(lltrnjkrO.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x180EF4D5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4719DBA3) + -178;
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

    private static /* synthetic */ String l10OjIl(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{101, 3, -125, 3, 125, -32, -123, -6, 117, 117, -38, 53, -78, -104, 40, -37};
        byte[] byArray3 = new byte[]{82, 77, -60, -27, 12, -103, -59, 124, 127, 66, -124, 42, 124, 24, -22, 11};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lO0tkpnm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1p0pIr[n2 ^ 0x180EF4D5];
        int n7 = n6 >>> 16;
        String string2 = TT.l10OjIl(lltrnjkrO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x180EF4D5);
        n6 = l1p0pIr[n3 ^ 0x180EF4D5];
        int n8 = n6 >>> 16;
        String string3 = TT.l10OjIl(lltrnjkrO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x180EF4D5);
        n6 = l1p0pIr[n4 ^ 0x180EF4D5];
        int n9 = n6 >>> 16;
        String string4 = TT.l10OjIl(lltrnjkrO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x180EF4D5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4719DBA3) + -178;
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

    private static /* synthetic */ CallSite OlktrrI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1p0pIr[n2 ^ 0x180EF4D5];
        int n7 = n6 >>> 16;
        String string2 = TT.l10OjIl(lltrnjkrO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x180EF4D5);
        n6 = l1p0pIr[n3 ^ 0x180EF4D5];
        int n8 = n6 >>> 16;
        String string3 = TT.l10OjIl(lltrnjkrO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x180EF4D5);
        n6 = l1p0pIr[n4 ^ 0x180EF4D5];
        int n9 = n6 >>> 16;
        String string4 = TT.l10OjIl(lltrnjkrO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x180EF4D5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4719DBA3) + -178;
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

    private static /* synthetic */ CallSite lljptql(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1p0pIr[n2 ^ 0x180EF4D5];
        int n7 = n6 >>> 16;
        String string2 = TT.l10OjIl(lltrnjkrO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x180EF4D5);
        n6 = l1p0pIr[n3 ^ 0x180EF4D5];
        int n8 = n6 >>> 16;
        String string3 = TT.l10OjIl(lltrnjkrO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x180EF4D5);
        n6 = l1p0pIr[n4 ^ 0x180EF4D5];
        int n9 = n6 >>> 16;
        String string4 = TT.l10OjIl(lltrnjkrO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x180EF4D5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4719DBA3) + -178;
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

    private static /* synthetic */ void ntfClinit() {
        lltrnjkrO = "\u00a8N\u00c0\u0082:S!\u0018\u0018\u00c7\u00cam\u0019\u008a'f\\\u00ec\u00de\u00ca\u00c1\u0017n\u0004q\u000e\u00f4\u00e1g\u0019\u0088\u00007d\u00e6\u00f2\u0090-\u00c2\u00ed\fJ 3M\u00f9\u00e4=\u00d5\u00f4\u00c2\u00ed\fJ 3M\u00f9\u00de\u0096\u00ca\u00e02^\u001f\f'\u00f8\u00a0lo\u00fc.7\u0092\u00c8\u00e7\u0084\u001ay\u000b9M\u00c6\u00fbr_\u00a9\u0005f\u00b5\u00f8\u00c0\u00ed_T.\u001a$\u00ef\u00ddE[\u00e8\u000e\f\u00c8\u009aaK\u00dc\u009b\u00ea\u00c4\u0017l3?\u000e\u00e0\u00ea\u001b\u00c2\u00ed\fJ 3M\u00d8\u00ca\u0088C\u00c0e\u00af\u00ed(\u00af\u00fd\u00b7\u00af\u00e7\u001cy\u0013?M\u00f9\u00eenQ\u00e8-?\u0099\u00fa\u00e5\u00dfM\u0089j\u00e7\u00dd\u00177\t?\f\u00f2\u00a0FZ\u00a8\u0003)\u0002\u0016\u00ca\u00c1\u0017n\u0004q\u000e\u00f4\u00e1g\u0019\u0094\u0016/7#\u00e1\u0090\u00f4\u00c2\u00ed\fJ 3M\u00c1\u00db";
        l1p0pIr = new int[]{12845066, 0x110001, 8978435, 8585217, 11599891, 0xB00001, 8650754, 2424842, 1, 0x3B0030, 0x100001, 1179667, 0xA00001, 0x2F0002, 7012353, 7143426, 3211274, 9175060, 10551311, 7274506, 8781827, 7929866, 7077889, 65551};
        TT.P();
        TT.b();
        TT.T();
        TT.m();
    }
}
