/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.td;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Inventory", y=UR.VISUAL, N=Uz.INTERFACE)
public class jK
extends UM {
    private static /* synthetic */ String OlOiO0qn;
    private static /* synthetic */ int[] ooirsst;

    static {
        jK.ntfClinit();
    }

    @Override
    public boolean Z() {
        jK.IIpOjmmn("xedktuyq", -418771056, 839201459, 839201460, 839201461, -418771056, (td)((Object)jK.IIpOjmmn("iuxgbaaa", -418771042, 839201456, 839201457, 839201458, -418771042)));
        return (boolean)jK.IIpOjmmn("sjbxbzw", -418771055, 839201462, 839201464, 839201463, -418771055, (UM)this);
    }

    @Override
    public boolean i() {
        jK.IIpOjmmn("kzoqdq", -418771056, 839201459, 839201460, 839201461, -1086471522, (td)((Object)jK.IIpOjmmn("pkldow", -418771042, 839201456, 839201457, 839201458, -1086471522)));
        return (boolean)jK.IIpOjmmn("csdq", -418771055, 839201462, 839201457, 839201463, -1086471522, (UM)this);
    }

    private static /* synthetic */ void ntfClinit() {
        OlOiO0qn = "\u00ca7\f7\u0016a+5n@\u00f9\u00eckX!:\f!\u0004xC\u00ee\u0091ZQ\u00f7\u001a\u0003@m1a+5n@\u00f9\u00ecfYa+5n@\u00f9\u00ecJqU\f;";
        ooirsst = new int[]{1966089, 1, 983054, 262154, 0x1D0001, 0x310003, 2555914, 65539, 917505};
    }

    private static /* synthetic */ CallSite lIOqss(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ooirsst[n2 ^ 0x320532B0];
        int n9 = n8 >>> 16;
        String string2 = jK.lI0ri(OlOiO0qn.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x320532B0);
        n8 = ooirsst[n3 ^ 0x320532B0];
        int n10 = n8 >>> 16;
        String string3 = jK.lI0ri(OlOiO0qn.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x320532B0);
        n8 = ooirsst[n4 ^ 0x320532B0];
        int n11 = n8 >>> 16;
        String string4 = jK.lI0ri(OlOiO0qn.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x320532B0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE70A0F26) + -178;
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

    private static /* synthetic */ String lI0ri(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-120, -23, -9, -102, -43, -14, -66, 42, -105, -85, 43, -94, -52, -13, -11, -102};
        byte[] byArray3 = new byte[]{111, -85, -99, -111, 69, -119, -25, -62, 56, 15, -53, 73, -25, 19, -118, -80};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IIpOjmmn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = ooirsst[n2 ^ 0x320532B0];
        int n7 = n6 >>> 16;
        String string2 = jK.lI0ri(OlOiO0qn.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x320532B0);
        n6 = ooirsst[n3 ^ 0x320532B0];
        int n8 = n6 >>> 16;
        String string3 = jK.lI0ri(OlOiO0qn.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x320532B0);
        n6 = ooirsst[n4 ^ 0x320532B0];
        int n9 = n6 >>> 16;
        String string4 = jK.lI0ri(OlOiO0qn.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x320532B0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE70A0F26) + -178;
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

    private static /* synthetic */ void IIIkksnO(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[9];
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
        OlOiO0qn = stringBuilder.toString();
        ooirsst = nArray;
    }
}
