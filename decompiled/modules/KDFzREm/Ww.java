/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="BypassHealth", y=UR.MISC, N=Uz.BASE)
public class Ww
extends UM {
    private static /* synthetic */ String l1tjtO;
    private static /* synthetic */ int[] lIik0iq;

    static {
        Ww.ntfClinit();
    }

    public static boolean m() {
        return (boolean)Ww.I1kmjtmI("klfvrqyz", 850404044, 1570245454, 1570245452, 1570245455, 695494631, -649586531, 530225419, (Ww)((Object)Ww.I1kmjtmI("klfvrqyz", 850404044, 1570245451, 1570245452, 1570245453, 695494631, -649586531, 530225419, (UB)((Object)Ww.I1kmjtmI("uutmr", 850404034, 1570245448, 1570245449, 1570245450, 695494631, -649586531, 530225419)))));
    }

    private static /* synthetic */ void ntfClinit() {
        l1tjtO = "\u000fx0j\u0015,0>\u00acO\u00b8\u00e3\u00a7\u00da\u0015,0>\u00acO\u00b8\u00cf\u008f%\u00f1x&\u0001(\u00afX\u00c5\u00f3\u0088\fJ\u001b\u00aaEx&\u0001(\u00afX\u00c5\u00f3\u0088\fH.\u00aaV\u0015,0>\u00acO\u00b8\u00e1\u0092";
        lIik0iq = new int[]{851977, 0x160001, 2490382, 196618, 0x170001, 1572878, 3407882, 3};
    }

    private static /* synthetic */ CallSite llnstntm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lIik0iq[n2 ^ 0x5D980B48];
        int n8 = n7 >>> 16;
        String string2 = Ww.lIsijm(l1tjtO.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x5D980B48);
        n7 = lIik0iq[n3 ^ 0x5D980B48];
        int n9 = n7 >>> 16;
        String string3 = Ww.lIsijm(l1tjtO.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x5D980B48);
        n7 = lIik0iq[n4 ^ 0x5D980B48];
        int n10 = n7 >>> 16;
        String string4 = Ww.lIsijm(l1tjtO.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x5D980B48);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x32B0227A) + -178;
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

    private static /* synthetic */ String lIsijm(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{8, 120, -121, -101, 41, -84, -69, 101, 47, -19, -14, 21, 69, -103, -47, -84};
        byte[] byArray3 = new byte[]{111, -125, -23, 27, -80, 55, 37, -9, -125, -73, -20, 53, 96, -13, -126, -12};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1kmjtmI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIik0iq[n2 ^ 0x5D980B48];
        int n9 = n8 >>> 16;
        String string2 = Ww.lIsijm(l1tjtO.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x5D980B48);
        n8 = lIik0iq[n3 ^ 0x5D980B48];
        int n10 = n8 >>> 16;
        String string3 = Ww.lIsijm(l1tjtO.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x5D980B48);
        n8 = lIik0iq[n4 ^ 0x5D980B48];
        int n11 = n8 >>> 16;
        String string4 = Ww.lIsijm(l1tjtO.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x5D980B48);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x32B0227A) + -178;
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

    private static /* synthetic */ void IIj0imij0(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[8];
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
        l1tjtO = stringBuilder.toString();
        lIik0iq = nArray;
    }
}
